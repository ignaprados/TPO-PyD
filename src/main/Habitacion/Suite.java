package main.Habitacion;

public class Suite extends Habitacion {

    private int cantPersonas;
    private int nroHabitacion;
    private boolean ocupada;
    private Double precioBase;


    // Constructor
    public Suite(int cantPersonas, int nroHabitacion, boolean ocupada, Double precioBase) {
        super(cantPersonas, nroHabitacion, ocupada, precioBase);
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
