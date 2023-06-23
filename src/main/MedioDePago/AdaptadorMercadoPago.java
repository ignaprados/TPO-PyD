package main.MedioDePago;

public class AdaptadorMercadoPago {

    public void pagarReserva(Reserva reserva){
        reserva.setEstado(new Pagada(reserva));
        Factura factura = reserva.crearFactura();
    }

}
