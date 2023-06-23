package main.MedioDePago;

public class Transferencia {

    private String CBU;
    private String nroComprobante;

    //constructor
    public Transferencia(String CBU, String nroComprobante){
        this.CBU = CBU;
        this.nroComprobante = nroComprobante;
    }

    //setters
    public void setCBU(String CBU){
        this.CBU = CBU;
    }

    public void setNroComprobante(String nroComprobante){
        this.nroComprobante = nroComprobante;
    }

    //getters
    public String getCBU(){
        return this.CBU;
    }

    public String getNroComprobante(){
        return this.nroComprobante;
    }

    public void pagar(Reserva reserva){
        reserva.setEstado(new Pagada(reserva));
        Factura factura = reserva.crearFactura();
    }
}
