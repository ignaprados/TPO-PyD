package main.Reservas;

public class Factura {
    private int nroFactura;
    private int importe;


    //constructor
    public Factura(int nroFactura, int importe) {
        this.nroFactura = nroFactura;
        this.importe = importe;
    }

    //getters y setters
    public int getNroFactura() {
        return nroFactura;
    }
    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }
    public int getImporte() {
        return importe;
    }
    public void setImporte(int importe) {
        this.importe = importe;
    }

}
