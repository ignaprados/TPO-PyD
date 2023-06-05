package main.Habitacion;

public class Habitacion {

    private int cantPersonas;
    private int nroHabitacion;
    private boolean ocupada;
    private Double precioBase;


    // Constructor
    public Habitacion(int cantPersonas, int nroHabitacion, Boolean estado, double precioBase) {
        this.cantPersonas = cantPersonas;
        this.nroHabitacion = nroHabitacion;
        this.ocupada = estado;
        this.precioBase = precioBase;
    }


    // Getters
    public int getCantPersonas() {
        return cantPersonas;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    // Setters
    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

}
