package main.MedioDePago;

public class Efectivo implements MedioDePago{

    public void pagar(Reserva reserva){
        reserva.setEstado(new Pagada(reserva));
        Factura factura = reserva.crearFactura();
    }

}
