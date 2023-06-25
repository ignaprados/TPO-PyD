package main.MedioDePago;

import main.Reservas.Reserva;

public class Transferencia extends MedioDePago {

    private String CBU;
    private int nroComprobante;

    // constructor
    public Transferencia(String CBU, int nroComprobante) {
        this.CBU = CBU;
        this.nroComprobante = nroComprobante;
    }

    // setters
    public void setCBU(String CBU) {
        this.CBU = CBU;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    // getters
    public String getCBU() {
        return this.CBU;
    }

    public int getNroComprobante() {
        return this.nroComprobante;
    }

    public String toString() {
        return "transferencia";
    }

    public void pagar(Reserva reserva) {
        AdaptadorMercadoPago adaptador = new AdaptadorMercadoPago();
        adaptador.pagarReserva(reserva);
    }
}
