package main.EstadoReserva;

import main.Reservas.Reserva;

public class PendienteDePago extends EstadoReserva {

    public PendienteDePago(Reserva reserva) {
        super(reserva);
    }

    public void pagarReserva() {
        this.reserva.setEstado(new Pagada(reserva));
        this.reserva.crearFactura();
        this.reserva.getFormaDePago().pagar(this.reserva);
    }

    public void cancelarReserva() {
        this.reserva.setEstado(new Cancelada(reserva));
        this.reserva.setActiva(false);
    }
}
