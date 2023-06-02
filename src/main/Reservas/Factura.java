package main.Reservas;

public class Factura {
    private int nroFactura;
    private Double importe;
    private String tipoConsumidor;
    private String CAE;


    //constructor
    public Factura(int nroFactura, Double importe, String tipoConsumidor, String CAE) {
        this.nroFactura = nroFactura;
        this.importe = importe;
        this.tipoConsumidor = tipoConsumidor;
        this.CAE = CAE;
    }

    //getters y setters
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
    public String getTipoConsumidor() {
        return tipoConsumidor;
    }
    public void setTipoConsumidor(String tipoConsumidor) {
        this.tipoConsumidor = tipoConsumidor;
    }
    public String getCAE() {
        return CAE;
    }
    public void setCAE(String CAE) {
        this.CAE = CAE;
    }

}
