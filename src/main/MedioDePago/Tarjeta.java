package main.MedioDePago;

import java.time.LocalDate;

import main.Reservas.Reserva;

public abstract class Tarjeta extends MedioDePago {

    protected int CVV;
    protected int numero;
    protected String nombre;
    protected LocalDate fechaVto;

    // constructor
    public Tarjeta(int CVV, int numero, String nombre, LocalDate fechaVto) {
        this.CVV = CVV;
        this.numero = numero;
        this.nombre = nombre;
        this.fechaVto = fechaVto;
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

    // methods
    public abstract void pagar(Reserva reserva);

}
