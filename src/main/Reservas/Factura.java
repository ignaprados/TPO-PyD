package main.Reservas;
import java.time.LocalDate;

public class Factura {
    private int nroFactura; 
    private Double importe; 
    private String tipoConsumidor;
    private LocalDate CAE; 


    //constructor 
    public Factura(int nroFactura, Double importe, String tipoConsumidor, LocalDate CAE) {
        this.nroFactura = nroFactura;
        this.importe = importe;
        this.tipoConsumidor = tipoConsumidor;
        CAE = CAE;
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
    public LocalDate getCAE() {
        return CAE;
    }
    public void setCAE(LocalDate cAE) {
        CAE = CAE;
    }

}
