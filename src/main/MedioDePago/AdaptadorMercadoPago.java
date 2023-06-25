package main.MedioDePago;

import main.Reservas.Reserva;

public class AdaptadorMercadoPago {

    public void pagarReserva(Reserva reserva) {
        String texto = reserva.getFormaDePago().toString();
        System.out.println("Reserva pagada con " + texto + ".");
    }
}