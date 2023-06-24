package main.MedioDePago;

import main.Reservas.Reserva;

public interface MedioDePago {

    public abstract void pagar(Reserva reserva);

}
