package main.Reservas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.EstadoReserva.EstadoReserva;
import main.EstadoReserva.PendienteDePago;
import main.Habitacion.Habitacion;
import main.MedioDePago.MedioDePago;
import main.Reservas.Extras.Extra;
import main.Descuentos.Descuento;
import main.Descuentos.SinDesc;


public class Reserva {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Cliente cliente;
    private ArrayList<Cliente> listaCliente;
    private MedioDePago formaDePago;
    private LocalDateTime fechaReserva; //fecha y horario en el que se realizó la reserva
    private EstadoReserva estado;
    private int montoTotal;
    private Habitacion habitacion;
    private ArrayList<Extra> extras;
    private boolean activa;
    private Descuento descuento;

    //constructor
    public Reserva(LocalDate checkIn, LocalDate checkOut, Cliente cliente, ArrayList<Cliente> listaCliente, MedioDePago formaDePago,  int montoTotal,Habitacion habitacion, ArrayList<Extra> extras) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cliente = cliente;
        this.listaCliente = listaCliente;
        this.formaDePago = formaDePago;
        this.fechaReserva = LocalDateTime.now();
        this.estado = new PendienteDePago(this);
        this.montoTotal = montoTotal;
        this.habitacion = habitacion;
        this.extras = extras;
        this.activa = true;
        this.descuento = new SinDesc();

    }

	//getters
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }
    public MedioDePago getFormaDePago() {
        return formaDePago;
    }
    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }
    public EstadoReserva getEstado() {
        return estado;
    }
    public int getMontoTotal() {
        return montoTotal;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public ArrayList<Extra> getExtras() {
        return extras;
    }
    public boolean getActiva() {
        return this.activa;
    }

    //setters
    public void setFormaDePago(MedioDePago formaDePago) {
        this.formaDePago = formaDePago;
    }
    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    public void setCliente(Cliente cliente) {
        this.cliente= cliente;
    }
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public void setExtras(ArrayList<Extra> extras) {
        this.extras = extras;
    }
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    //methods
    public void crearFactura() {
        //usar singleton para el controller reserva
        ControllerReserva controllerReserva = new ControllerReserva();

        int cantFacturas = controllerReserva.getListaFacturas().size();
        int nroFactura = cantFacturas + 1;
        Factura nuevaFactura = new Factura(nroFactura, this.getMontoTotal());
        controllerReserva.agregarFactura(nuevaFactura);
    }

    public void calcMonto(){

        int total = 0;
        int totalExtras = 0;
        for (Extra extra:extras){
            totalExtras += extra.getPrecio();
        }

        total += totalExtras;
        total += this.habitacion.getPrecioBase();

        this.montoTotal = total;
    }
    
    
    
}