package main.Reservas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.EstadoReserva.EstadoReserva;
import main.Habitacion.Habitacion;
import main.MedioDePago.MedioDePago;
import main.Reservas.Extras.Extra;

public class Reserva {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Cliente cliente;
    private ArrayList<Cliente> listaCliente;
    private MedioDePago formaDePago;
    private LocalDate fechaReserva;
    private EstadoReserva estado;
    private Double montoTotal;
    private LocalDateTime fechaDeReserva;
    private Factura factura;
    private Habitacion habitacion;
    private ArrayList<Extra> extras;

    
    //constructor
    public Reserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, ArrayList<Cliente> listaCliente, MedioDePago formaDePago, LocalDate fechaReserva, EstadoReserva estado, Double montoTotal, LocalDateTime fechaDeReserva, Factura factura, Habitacion habitacion, ArrayList<Extra> extras) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cliente = cliente;
        this.listaCliente = listaCliente;
        this.formaDePago = formaDePago;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.fechaDeReserva = fechaDeReserva;
        this.factura = factura;
        this.habitacion = habitacion;
        this.extras = extras;
    }
    //getters y setters 
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente= cliente;
    }
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }
    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    public MedioDePago getFormaDePago() {
        return formaDePago;
    }
    public void setFormaDePago(MedioDePago formaDePago) {
        this.formaDePago = formaDePago;
    }
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public EstadoReserva getEstado() {
        return estado;
    }
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    public Double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public LocalDateTime getFechaDeReserva() {
        return fechaDeReserva;
    }
    public void setFechaDeReserva(LocalDateTime fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public ArrayList<Extra> getExtras() {
        return extras;
    }
    public void setExtras(ArrayList<Extra> extras) {
        this.extras = extras;
    }
      
}


