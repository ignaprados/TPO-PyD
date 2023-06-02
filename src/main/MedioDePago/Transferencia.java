package main.MedioDePago;

public class Transferencia {

    private String CBU;
    private String nroComprobante;

    //constructor
    public Transferencia(String CBU, String nroComprobante){
        this.CBU = CBU;
        this.nroComprobante = nroComprobante;
    }

    //setter y getters
    public void setCBU(String CBU){
        this.CBU = CBU;
    }

    public void setNroComprobante(String nroComprobante){
        this.nroComprobante = nroComprobante;
    }

    public String getCBU(){
        return this.CBU;
    }

    public String getNroComprobante(){
        return this.nroComprobante;
    }
}
