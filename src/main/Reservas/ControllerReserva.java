package main.Reservas;
import java.time.LocalDate;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.EstadoReserva.EstadoReserva;
import main.Habitacion.Habitacion;
import main.MedioDePago.MedioDePago;
import main.Reservas.Extras.Extra;

public class ControllerReserva {
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Factura> listaFacturas;

    //constructor
    public ControllerReserva() {
        this.listaReservas = new ArrayList<Reserva>();
        this.listaFacturas = new ArrayList<Factura>();
    }

    //getters y setters
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas){
        this.listaFacturas = listaFacturas;
    }

    public ArrayList<Factura> getListaFacturas(){
        return listaFacturas;
    }

     // CRUD Reservas
    public void agregarReserva(Reserva nuevoReserva) {
        listaReservas.add(nuevoReserva);
    }

    public void eliminarReserva(Reserva Reserva) {
        listaReservas.remove(Reserva);
    }

    //methods
    public void crearReserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, ArrayList<Cliente> listaCliente, MedioDePago formaDePago, LocalDate fechaReserva, EstadoReserva estado, int montoTotal, Factura factura, Habitacion habitacion, ArrayList<Extra> extras){
        Reserva nuevaReserva = new Reserva(checkIn, checkOut, cliente, listaCliente, formaDePago, fechaReserva, estado, montoTotal, factura, habitacion, extras);
        agregarReserva(nuevaReserva);
    }

}
