package main.Descuentos;

public abstract class Descuento {
    private Double descuento;

    // constructor
    public Descuento() {
    }

    // getters
    public Double getDescuento() {
        return descuento;
    }

    // setters
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    // methods
    public Double calcularPrecio(Double monto) {
        Double precioFinal = monto * this.descuento;
        return precioFinal;
    }
}
