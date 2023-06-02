package main.MedioDePago;
import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta {

    public TarjetaCredito(int CVV, int numero, String nombre, LocalDate fechaVto) {
        super(CVV, numero, nombre, fechaVto);
    }

}