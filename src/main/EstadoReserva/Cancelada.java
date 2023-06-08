package main.EstadoReserva;

public class Cancelada extends EstadoReserva{

    public void pagarReserva() {
        System.out.println("No se puede pagar una reserva cancelada");

    }
    public void cancelarReserva() {
        System.out.println("La reserva ya esta cancelada");
    }

}
