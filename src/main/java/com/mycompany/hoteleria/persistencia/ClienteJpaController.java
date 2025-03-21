/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria.persistencia;

import com.mycompany.hoteleria.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Emi
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("hoteleriaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getReservas() == null) {
            cliente.setReservas(new ArrayList<Reserva>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Reserva> attachedReservas = new ArrayList<Reserva>();
            for (Reserva reservasReservaToAttach : cliente.getReservas()) {
                reservasReservaToAttach = em.getReference(reservasReservaToAttach.getClass(), reservasReservaToAttach.getId());
                attachedReservas.add(reservasReservaToAttach);
            }
            cliente.setReservas(attachedReservas);
            em.persist(cliente);
            for (Reserva reservasReserva : cliente.getReservas()) {
                Cliente oldClienteOfReservasReserva = reservasReserva.getCliente();
                reservasReserva.setCliente(cliente);
                reservasReserva = em.merge(reservasReserva);
                if (oldClienteOfReservasReserva != null) {
                    oldClienteOfReservasReserva.getReservas().remove(reservasReserva);
                    oldClienteOfReservasReserva = em.merge(oldClienteOfReservasReserva);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            List<Reserva> reservasOld = persistentCliente.getReservas();
            List<Reserva> reservasNew = cliente.getReservas();
            List<Reserva> attachedReservasNew = new ArrayList<Reserva>();
            for (Reserva reservasNewReservaToAttach : reservasNew) {
                reservasNewReservaToAttach = em.getReference(reservasNewReservaToAttach.getClass(), reservasNewReservaToAttach.getId());
                attachedReservasNew.add(reservasNewReservaToAttach);
            }
            reservasNew = attachedReservasNew;
            cliente.setReservas(reservasNew);
            cliente = em.merge(cliente);
            for (Reserva reservasOldReserva : reservasOld) {
                if (!reservasNew.contains(reservasOldReserva)) {
                    reservasOldReserva.setCliente(null);
                    reservasOldReserva = em.merge(reservasOldReserva);
                }
            }
            for (Reserva reservasNewReserva : reservasNew) {
                if (!reservasOld.contains(reservasNewReserva)) {
                    Cliente oldClienteOfReservasNewReserva = reservasNewReserva.getCliente();
                    reservasNewReserva.setCliente(cliente);
                    reservasNewReserva = em.merge(reservasNewReserva);
                    if (oldClienteOfReservasNewReserva != null && !oldClienteOfReservasNewReserva.equals(cliente)) {
                        oldClienteOfReservasNewReserva.getReservas().remove(reservasNewReserva);
                        oldClienteOfReservasNewReserva = em.merge(oldClienteOfReservasNewReserva);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Reserva> reservas = cliente.getReservas();
            for (Reserva reservasReserva : reservas) {
                reservasReserva.setCliente(null);
                reservasReserva = em.merge(reservasReserva);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
