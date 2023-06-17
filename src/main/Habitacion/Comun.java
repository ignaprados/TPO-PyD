package main.Habitacion;

public class Comun extends Habitacion{

    private int cantPersonas;
    private int nroHabitacion;
    private boolean ocupada;
    private Double precioBase;


    // Constructor
    public Comun(int cantPersonas, int nroHabitacion,  Double precioBase) {
        super(cantPersonas, nroHabitacion, precioBase);
        this.precioBase = precioBase;
    }




}
