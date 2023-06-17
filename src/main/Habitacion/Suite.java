package main.Habitacion;

public class Suite extends Habitacion {

    private int cantPersonas;
    private int nroHabitacion;
    private boolean ocupada;
    private Double precioBase;


    // Constructor
    public Suite(int cantPersonas, int nroHabitacion,  Double precioBase) {
        super(cantPersonas, nroHabitacion, precioBase);
        this.precioBase = precioBase;
    }

}
