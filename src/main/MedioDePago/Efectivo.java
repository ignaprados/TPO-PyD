package main.MedioDePago;

import main.Reservas.Reserva;

public class Efectivo extends MedioDePago {

    public void pagar(Reserva reserva) {
        System.out.println("Reserva pagada con efectivo");
    }

}
