package main.EstadoReserva;

import main.Reservas.Reserva;

public abstract class EstadoReserva {
    protected Reserva reserva;

    public abstract void pagarReserva();
    public abstract void cancelarReserva();
}
