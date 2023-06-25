package main.MedioDePago;

import main.Reservas.Reserva;

public class Transferencia extends MedioDePago {

    private String CBU;
    private String nroComprobante;
    private AdaptadorMercadoPago adaptador;

    // constructor
    public Transferencia(String CBU, String nroComprobante) {
        this.CBU = CBU;
        this.nroComprobante = nroComprobante;
        this.adaptador = new AdaptadorMercadoPago();
    }

    // setters
    public void setCBU(String CBU) {
        this.CBU = CBU;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    // getters
    public String getCBU() {
        return this.CBU;
    }

    public String getNroComprobante() {
        return this.nroComprobante;
    }

    public String toString() {
        return "transferencia";
    }

    public void pagar(Reserva reserva) {
        this.adaptador.pagarReserva(reserva);
    }
}
