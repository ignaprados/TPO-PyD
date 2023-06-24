package main.Reservas.Extras;

public class Extra {
    private int ID;
    private String descripcion;
    private Double precio;

    // constructor
    public Extra(int ID, String descripcion, Double precio) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // getters
    public int getID() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    // setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
