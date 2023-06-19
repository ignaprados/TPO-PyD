package main.EstadoReserva;

import main.Reservas.Reserva;

public class Pagada extends EstadoReserva{

    public Pagada(Reserva reserva) {
        super(reserva);
    }

    public void cancelarReserva(){
        this.reserva.setEstado(new Cancelada(reserva));
        this.reserva.setActiva(false);
    }

    public void pagarReserva() {
        System.out.println("No se puede pagar una reserva ya pagada.");
    }
}
