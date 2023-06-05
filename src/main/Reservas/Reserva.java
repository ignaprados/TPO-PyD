package main.Reservas;
import java.time.LocalDate;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.EstadoReserva.EstadoReserva;
import main.EstadoReserva.PendienteDePago;
import main.Habitacion.Comun;
import main.Habitacion.Habitacion;
import main.MedioDePago.MedioDePago;
import main.MedioDePago.TarjetaCredito;
import main.Reservas.Extras.Extra;

public class Reserva {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Cliente cliente;
    private ArrayList<Cliente> listaCliente;
    private MedioDePago formaDePago;
    private LocalDate fechaReserva;
    private EstadoReserva estado;
    private int montoTotal;
    private Factura factura;
    private Habitacion habitacion;
    private ArrayList<Extra> extras;


    //constructor
    public Reserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, ArrayList<Cliente> listaCliente, MedioDePago formaDePago, LocalDate fechaReserva, EstadoReserva estado, int montoTotal, Factura factura, Habitacion habitacion, ArrayList<Extra> extras) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cliente = cliente;
        this.listaCliente = listaCliente;
        this.formaDePago = formaDePago;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.factura = factura;
        this.habitacion = habitacion;
        this.extras = extras;
    }
    public Reserva(LocalDate checkIn2, LocalDate checkOut2, Cliente cliente2, ArrayList<Cliente> listaClientes,
			TarjetaCredito tarjetaCredito, LocalDate fechaReserva2, PendienteDePago estadoReserva, int montoTotal2,
			Factura factura2, Comun habitacion2, ArrayList<Extra> listaExtras) {
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
    public int getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
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


