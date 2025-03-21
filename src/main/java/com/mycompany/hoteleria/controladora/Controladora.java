package com.mycompany.hoteleria.controladora;

import com.mycompany.hoteleria.Cliente;
import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.Usuario;
import com.mycompany.hoteleria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(Usuario usu) {
        controlPersis.crearUsuario(usu);
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void crearCliente(Cliente cliente) {
        controlPersis.crearCliente(cliente);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public void crearReserva(Reserva reserva) {
       controlPersis.crearReserva(reserva);
    }

    public List<Reserva> traerReservas() {
        return controlPersis.traerReservas();
    }

    public void borrarReserva(int idReserva) {
        controlPersis.borrarReserva(idReserva);
    }

    public Reserva traerReserva(int idReserva) {
        return controlPersis.traerReserva(idReserva);
    }

    public void modificarReserva(Reserva reserva, Cliente cliente, String checkout, String checkin, int cantHuespedes, String tipoHabitacion, String preferencias, String estadoReserva) {
        reserva.setCliente(cliente);
        reserva.setCheckout(checkout);
        reserva.setCheckin(checkin);
        reserva.setCantHuespedes(cantHuespedes);
        reserva.setTipoHabitacion(tipoHabitacion);
        reserva.setPreferencias(preferencias);
        reserva.setEstadoReserva(estadoReserva);
        controlPersis.modificarReserva(reserva);
    }

   

   

}
