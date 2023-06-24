package main.MedioDePago;

import main.EstadoReserva.Pagada;
import main.Reservas.Reserva;

public class AdaptadorMercadoPago {

    public void pagarReserva(Reserva reserva) {
        reserva.setEstado(new Pagada(reserva));
        reserva.crearFactura();
    }

}
