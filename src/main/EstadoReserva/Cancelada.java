package main.EstadoReserva;

import main.Reservas.Reserva;

public class Cancelada extends EstadoReserva{

    public Cancelada(Reserva reserva) {
        super(reserva);
    }
    public void pagarReserva() {
        System.out.println("No se puede pagar una reserva cancelada");

    }
    public void cancelarReserva() {
        System.out.println("La reserva ya esta cancelada");
    }

}
