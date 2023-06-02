package main.Reservas;

public class ControllerReserva {
    private Arraylist<Reserva> listaReservas;

    //constructor 
    public ControllerReserva() {
        this.listaReservas = new Arraylist<Reserva>();
    }
    //getters y setters 
    public Arraylist<Reserva> getListaReservas() {
        return listaReservas;
    }
     
}
