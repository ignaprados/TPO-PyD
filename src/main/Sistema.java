package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.Habitacion.Habitacion;



public class Sistema {
    private ArrayList<Habitacion> listaHabitaciones;

    //getters
    public ArrayList<Habitacion> getListaHabitaciones(){
        return this.listaHabitaciones;
    }

    public boolean habitacionExiste(int nroHabitacion){
        List<Habitacion> listaHabitacionFiltrada = listaHabitaciones.stream()
        .filter(h -> h.getNroHabitacion() == nroHabitacion)
        .collect(Collectors.toList());
        if (listaHabitacionFiltrada.size() > 0)
            return true;
        return false;

    }

    public void cargarHabitacion(int cantPersonas, int nroHabitacion, Double precioBase){
        Habitacion nuevaHabitacion = new Habitacion(cantPersonas, nroHabitacion, nroHabitacion);
        if (!(habitacionExiste(nroHabitacion)))
            this.listaHabitaciones.add(nuevaHabitacion);
        else
            System.out.println("Ya existe una habitacion con ese número.");
    }

}
