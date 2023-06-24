package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Sistema;
import main.Habitacion.*;

public class testSistema {

    private Sistema sistema;
    private Comun habitacionComun;
    private Suite habitacionSuite;

    @Before
    public void setUp() {
        sistema = Sistema.getInstance();

        habitacionComun = new Comun(2, 100, 499.99);
        habitacionSuite = new Suite(2, 101, 499.99);

        sistema.agregarHabitacion(habitacionComun);
        sistema.agregarHabitacion(habitacionSuite);
    }

    @Test
    public void testHabitacionExiste() {
        boolean existeHabitacion = sistema.habitacionExiste(100);
        assertTrue(existeHabitacion);
    }

    @Test
    public void testHabitacionExisteFalso() {
        boolean existeHabitacion = sistema.habitacionExiste(513);
        assertFalse(existeHabitacion);
    }

    @Test
    public void testCrearHabitacionComun() {
        sistema.crearHabitacionComun(5, 102, 500.00);
        assertEquals(sistema.getListaHabitaciones().size(), 3);
        assertTrue(sistema.habitacionExiste(102));
    }

    @Test
    public void testCrearHabitacionComunRepetido() {
        sistema.crearHabitacionComun(2, 100, 100.00);
        assertEquals(sistema.getListaHabitaciones().size(), 2);
    }

    @Test
    public void testCrearHabitacionSuite() {
        sistema.crearHabitacionSuite(5, 103, 500.00);
        assertEquals(sistema.getListaHabitaciones().size(), 3);
        assertTrue(sistema.habitacionExiste(103));
    }

    @Test
    public void testCrearHabitacionSuiteRepetido() {
        sistema.crearHabitacionSuite(2, 101, 100.00);
        assertEquals(sistema.getListaHabitaciones().size(), 2);
    }

    @Test
    public void testAgregarHabitacion() {
        sistema.agregarHabitacion(new Comun(2, 105, 100.00));
        assertEquals(sistema.getListaHabitaciones().size(), 3);
    }

    @Test
    public void testGenerarReporteOcupadas() {
        sistema.agregarHabitacion(new Comun(2, 105, 100.00));
        sistema.getListaHabitaciones().get(0).setOcupada(true);
        sistema.getListaHabitaciones().get(1).setOcupada(true);
        ArrayList<String> reporte = sistema.generarReporteOcupadas();
        assertEquals(reporte.size(), 2);
    }

    @Test
    public void testGenerarReporteLibres() {
        ArrayList<String> reporte = sistema.generarReporteLibres();
        assertEquals(reporte.size(), 2);
    }

    @Test
    public void testActualizarParametroFacturacion() {
        int horas = 30;
        sistema.actualizarParametroFacturacion(horas);
        assertEquals(sistema.getCronJobPagoExpirado().getHorasMax(), horas);
    }

    @Test
    public void testBuscarHabitacionEncontrada() {
        Habitacion habitacion = sistema.buscarHabitacion(100);
        assertEquals(habitacion.getNroHabitacion(), 100);
    }

    @Test
    public void testBuscarHabitacionNoEncontrada() {
        Habitacion habitacion = sistema.buscarHabitacion(231);
        assertEquals(habitacion, null);
    }

}