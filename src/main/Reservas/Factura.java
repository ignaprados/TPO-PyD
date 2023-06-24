package main.Reservas;

public class Factura {
    private int nroFactura;
    private Double importe;

    // constructor
    public Factura(int nroFactura, Double importe) {
        this.nroFactura = nroFactura;
        this.importe = importe;
    }

    // getters y setters
    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

}
