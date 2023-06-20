package main.Habitacion;

public abstract class Habitacion {

    private int cantPersonas;
    private int nroHabitacion;
    private boolean ocupada;
    private Double precioBase;


    // Constructor
    public Habitacion(int cantPersonas, int nroHabitacion, double precioBase) {
        this.cantPersonas = cantPersonas;
        this.nroHabitacion = nroHabitacion;
        this.ocupada = false;
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

    // Overriding equals() to compare two Habitaciones
    @Override
    public boolean equals(Object otraHabitacion) {

        // If the object is compared with itself then return true
        if (otraHabitacion == this) {
            return true;
        }
        /* Check if o is an instance of Habitacion or not
          "null instanceof [type]" also returns false */
        if (!(otraHabitacion instanceof Habitacion)) {
            return false;
        }
        Habitacion habitacion = (Habitacion) otraHabitacion;
        return Integer.compare(nroHabitacion, habitacion.getNroHabitacion()) == 0;
    }

}
