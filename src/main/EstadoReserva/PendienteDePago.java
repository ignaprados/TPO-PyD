package main.EstadoReserva;

public class PendienteDePago extends EstadoReserva{

    public void pagarReserva() {
        this.reserva.crearFactura();
        this.reserva.setEstado(new Pagada());
    }

    public void cancelarReserva() {
       this.reserva.setEstado(new Cancelada());
       this.reserva.setActiva(false);
    }
}
