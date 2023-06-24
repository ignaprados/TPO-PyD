package main.MedioDePago;

import main.EstadoReserva.Pagada;
import main.Reservas.Reserva;

public class Efectivo implements MedioDePago {

    public void pagar(Reserva reserva) {
        reserva.setEstado(new Pagada(reserva));
        reserva.crearFactura();
    }

}
