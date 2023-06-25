package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.CronJobs.CronJobPagoExpirado;
import main.Habitacion.Comun;
import main.Habitacion.Suite;
import main.Reservas.ControllerReserva;
import main.Habitacion.Habitacion;

public class Sistema {
    private ArrayList<Habitacion> listaHabitaciones;
    private CronJobPagoExpirado cronJobPagoExpirado;

    private static Sistema instancia;

    // contructor
    private Sistema() {
        listaHabitaciones = new ArrayList<Habitacion>();
        cronJobPagoExpirado = new CronJobPagoExpirado(ControllerReserva.getInstance());
    }

    // singleton
    public static Sistema getInstance() {
        if (instancia == null) {
            instancia = new Sistema();
        }

        return instancia;
    }

    // getters
    public ArrayList<Habitacion> getListaHabitaciones() {
        return this.listaHabitaciones;
    }

    public CronJobPagoExpirado getCronJobPagoExpirado() {
        return this.cronJobPagoExpirado;
    }

    // metodos
    public boolean habitacionExiste(int nroHabitacion) {
        List<Habitacion> listaHabitacionFiltrada = listaHabitaciones.stream()
                .filter(h -> h.getNroHabitacion() == nroHabitacion)
                .collect(Collectors.toList());
        if (listaHabitacionFiltrada.size() > 0)
            return true;
        return false;
    }

    public void crearHabitacionComun(int cantPersonas, int nroHabitacion, Double precioBase) {
        Habitacion nuevaHabitacion = new Comun(cantPersonas, nroHabitacion, precioBase);
        if (!(habitacionExiste(nroHabitacion)))
            agregarHabitacion(nuevaHabitacion);
        else
            System.out.println("Ya existe una habitacion con ese número.");
    }

    public void crearHabitacionSuite(int cantPersonas, int nroHabitacion, Double precioBase) {
        Habitacion nuevaHabitacion = new Suite(cantPersonas, nroHabitacion, precioBase);
        if (!(habitacionExiste(nroHabitacion)))
            agregarHabitacion(nuevaHabitacion);
        else
            System.out.println("Ya existe una habitacion con ese número.");
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.listaHabitaciones.add(habitacion);
    }

    public void actualizarParametroFacturacion(int plazoHoras) {
        cronJobPagoExpirado.setHorasMax(plazoHoras);
    }

    // reportes
    public ArrayList<String> generarReporteOcupadas() {
        ArrayList<String> reporte = new ArrayList<String>();

        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.isOcupada()) {
                String mensaje = ("Número de habitación: " + habitacion.getNroHabitacion() + "LIBRE");
                reporte.add(mensaje);
            }
        }
        return reporte;
    }

    public ArrayList<String> generarReporteLibres() {
        ArrayList<String> reporte = new ArrayList<String>();

        for (Habitacion habitacion : listaHabitaciones) {
            if (!habitacion.isOcupada()) {
                String mensaje = ("Número de habitación: " + habitacion.getNroHabitacion() + "OCUPADA");
                reporte.add(mensaje);
            }
        }
        return reporte;
    }

    public void imprimirReporte(boolean habitacionesOcupadas) {

        ArrayList<String> reporte = new ArrayList<String>();

        if (habitacionesOcupadas == false) {
            reporte = generarReporteLibres();
        } else {
            reporte = generarReporteOcupadas();
        }

        for (int i = 0; i < reporte.size(); i++) {
            System.out.println(reporte.get(i));
        }
    }

    public Habitacion buscarHabitacion(int nroHabitacion) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNroHabitacion() == nroHabitacion) {
                return habitacion;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
}
