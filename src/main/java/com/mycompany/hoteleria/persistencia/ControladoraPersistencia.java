
package com.mycompany.hoteleria.persistencia;

import com.mycompany.hoteleria.Cliente;
import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.Usuario;
import com.mycompany.hoteleria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    UsuarioJpaController UsuJpa = new UsuarioJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ReservaJpaController reservaJpa = new ReservaJpaController();
    
    public void crearUsuario(Usuario usu) {
        UsuJpa.create(usu);
    }

    public List<Usuario> traerUsuarios() {
      return UsuJpa.findUsuarioEntities();
    }

    public void crearCliente(Cliente cliente) {
       clienteJpa.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public void crearReserva(Reserva reserva) {
        reservaJpa.create(reserva);
    }

    public List<Reserva> traerReservas() {
        return reservaJpa.findReservaEntities();
    }

    public void borrarReserva(int idReserva) {
        try {
            reservaJpa.destroy(idReserva);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Reserva traerReserva(int idReserva) {
        return reservaJpa.findReserva(idReserva);
    }

    public void modificarReserva(Reserva reserva) {
        try {
            reservaJpa.edit(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
