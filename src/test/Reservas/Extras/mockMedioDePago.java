package test.Reservas.Extras;

import main.EstadoReserva.Pagada;
import main.MedioDePago.MedioDePago;
import main.Reservas.Reserva;

public class mockMedioDePago implements MedioDePago {

    @Override
    public void pagar(Reserva reserva) {
        reserva.setEstado(new Pagada(reserva));
        reserva.crearFactura();
    }

}
