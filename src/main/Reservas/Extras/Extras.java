package main.Reservas.Extras;
import java.util.ArrayList;

public class Extras {

    private ArrayList<Extra> listaExtras;

    // Constructor
    public Extras() {
        listaExtras = new ArrayList<Extra>();
    }

    //getters
    public ArrayList<Extra> getListaExtra() {
        return listaExtras;
    }

    // CRUD Extras
    public void agregarExtra(Extra nuevoExtra) {
        listaExtras.add(nuevoExtra);
    }

    public void eliminarExtra(Extra extra) {
        listaExtras.remove(extra);
    }

}
