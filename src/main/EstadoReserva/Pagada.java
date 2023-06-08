package main.EstadoReserva;

public class Pagada extends EstadoReserva{

    public void cancelarReserva(){
        this.reserva.setEstado(new Cancelada());
        this.reserva.setActiva(false);
    }

    public void pagarReserva() {
        System.out.println("No se puede pagar una reserva ya pagada.");
    }
}
