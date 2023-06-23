package main.MedioDePago;
import java.time.LocalDate;
public class TarjetaDebito extends Tarjeta {

    private int CVV;
    private int numero;
    private String nombre;
    private LocalDate fechaVto;

    //Constructor heredado
    public TarjetaDebito(int CVV, int numero, String nombre, LocalDate fechaVto){
        super(CVV,numero,nombre, fechaVto);
    }

    //setters y getters
    public void setCVV(int CVV){
        this.CVV = CVV;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaVto(LocalDate fecha){
        this.fechaVto = fecha;
    }

    public int getCVV(){
        return this.CVV;
    }

    public int getNumero(){
        return this.numero;
    }

    public String nombre(){
        return this.nombre;
    }

    public LocalDate getFechaVto(){
        return this.fechaVto;
    }

    //métodos
    public void pagar(Reserva reserva){
        reserva.setEstado(new Pagada(reserva));
        Factura factura = reserva.crearFactura();
    }



}
