package main.Reservas;

import java.time.LocalDate;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.Habitacion.Habitacion;
import main.MedioDePago.MedioDePago;
import main.Reservas.Extras.Extra;

public class ControllerReserva {
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Factura> listaFacturas;

    private static ControllerReserva instancia;

    // constructor
    private ControllerReserva() {
        this.listaReservas = new ArrayList<Reserva>();
        this.listaFacturas = new ArrayList<Factura>();
    }

    // singleton
    public static ControllerReserva getInstance() {
        if (instancia == null) {
            instancia = new ControllerReserva();
        }

        return instancia;
    }

    // getters y setters
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    // CRUD Reservas
    public void agregarReserva(Reserva nuevoReserva) {
        listaReservas.add(nuevoReserva);
    }

    public void eliminarReserva(Reserva Reserva) {
        listaReservas.remove(Reserva);
    }

    public void agregarFactura(Factura nuevaFactura) {
        listaFacturas.add(nuevaFactura);
    }

    public void eliminarFactura(Factura Factura) {
        listaFacturas.remove(Factura);
    }

    // methods
    public void crearReserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, ArrayList<Cliente> listaCliente,
            MedioDePago formaDePago, Double montoTotal, Habitacion habitacion, ArrayList<Extra> extras) {

        Reserva nuevaReserva = new Reserva(checkIn, checkOut, cliente, listaCliente, formaDePago,
                habitacion, extras);
        habitacion.setOcupada(true);
        agregarReserva(nuevaReserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.getEstado().cancelarReserva();
    }

}
