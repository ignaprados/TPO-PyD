package main.MedioDePago;

import java.time.LocalDate;

import main.EstadoReserva.Pagada;
import main.Reservas.Reserva;

public class TarjetaCredito extends Tarjeta {

    private int cantCuotas;

    // constructor heredado
    public TarjetaCredito(int CVV, int numero, String nombre, LocalDate fechaVto, int cuotas) {
        super(CVV, numero, nombre, fechaVto);
        this.cantCuotas = cuotas;
    }

    // setters y getters
    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaVto(LocalDate fecha) {
        this.fechaVto = fecha;
    }

    public void setCantCuotas(int cuotas) {
        this.cantCuotas = cuotas;
    }

    public int getCVV() {
        return this.CVV;
    }

    public int getNumero() {
        return this.numero;
    }

    public String nombre() {
        return this.nombre;
    }

    public LocalDate getFechaVto() {
        return this.fechaVto;
    }

    public int getCantCuotas() {
        return this.cantCuotas;
    }

    // métodos
    public void pagar(Reserva reserva) {
        reserva.setEstado(new Pagada(reserva));
        reserva.crearFactura();
    }

}