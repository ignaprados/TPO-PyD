package main.Reservas;
import java.util.ArrayList;

public class ControllerReserva {
    private ArrayList<Reserva> listaReservas;

    //constructor
    public ControllerReserva() {
        this.listaReservas = new ArrayList<Reserva>();
    }
    //getters y setters
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

}
