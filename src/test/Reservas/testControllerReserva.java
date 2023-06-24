package test.Reservas;

// Import Junit
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

// Import Assert
import static org.junit.Assert.*;

// Import clases
import main.Reservas.Reserva;
import main.Reservas.ControllerReserva;
import main.Reservas.Factura;
import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto.Medios;
import main.EstadoReserva.Cancelada;
import main.EstadoReserva.PendienteDePago;
import main.MedioDePago.TarjetaCredito;
import main.Habitacion.Comun;
import main.Reservas.Extras.Extra;

public class testControllerReserva {

    private ControllerReserva controller;
    private Reserva reserva;
    private Cliente cliente;
    private ArrayList<Cliente> listaClientes;
    private TarjetaCredito tarjetaCredito;
    private Comun habitacion;
    private ArrayList<Extra> listaExtras;
    private LocalDate checkIn;
    private LocalDate checkOut;

    @Before
    public void setUp() {
        checkIn = LocalDate.of(2023, 6, 4);
        checkOut = LocalDate.of(2023, 6, 8);

        controller = ControllerReserva.getInstance();

        cliente = new Cliente("Nombre", "Apellido", "DNI", "tel", "mail@gmail.com", Medios.SMS);
        listaClientes = new ArrayList<Cliente>();
        listaClientes.add(cliente);

        tarjetaCredito = new TarjetaCredito(123, 123456, "Tarjetita Anonima", LocalDate.of(2027, 04, 30));
        habitacion = new Comun(2, 1, 99.99);

        listaExtras = new ArrayList<Extra>();

        reserva = new Reserva(checkIn, checkOut, cliente, listaClientes, tarjetaCredito, 100, habitacion, listaExtras);
    }

    @Test
    public void testAgregarReserva() {
        ArrayList<Reserva> listaReservas = controller.getListaReservas();

        controller.agregarReserva(reserva);

        assertTrue(listaReservas.contains(reserva));
        assertEquals(listaReservas.size(), 1);
    }

    @Test
    public void testEliminarReserva() {
        ArrayList<Reserva> listaReservas = controller.getListaReservas();

        controller.eliminarReserva(reserva);

        assertFalse(listaReservas.contains(reserva));
        assertEquals(listaReservas.size(), 0);
    }

    @Test
    public void testCrearReserva() {
        controller.setListaReservas(new ArrayList<Reserva>());

        controller.crearReserva(checkIn, checkOut, cliente, listaClientes, tarjetaCredito, 100, habitacion,
                listaExtras);

        Reserva nueva_reserva = controller.getListaReservas().get(0);

        assertEquals(nueva_reserva.getCheckIn(), checkIn);
        assertEquals(nueva_reserva.getCheckOut(), checkOut);
        assertEquals(nueva_reserva.getCliente(), cliente);
        assertEquals(nueva_reserva.getListaCliente(), listaClientes);
        assertEquals(nueva_reserva.getFormaDePago(), tarjetaCredito);
        assertTrue(nueva_reserva.getEstado() instanceof PendienteDePago);
        assertEquals(nueva_reserva.getMontoTotal(), 100);
        assertEquals(nueva_reserva.getHabitacion(), habitacion);
        assertTrue(nueva_reserva.getHabitacion().isOcupada());
        assertEquals(nueva_reserva.getExtras(), listaExtras);
    }

    @Test
    public void testCancelarReserva() {
        controller.cancelarReserva(reserva);
        assertTrue(reserva.getEstado() instanceof Cancelada);
    }

    @Test
    public void testAgregarFactura() {
        controller.agregarFactura(new Factura(100, 300));
        controller.agregarFactura(new Factura(101, 500));
        assertEquals(controller.getListaFacturas().size(), 2);
    }

    @Test
    public void testEliminarFactura() {
        Factura factura1 = new Factura(102, 400);
        controller.agregarFactura(new Factura(100, 300));
        controller.agregarFactura(new Factura(101, 500));
        controller.agregarFactura(factura1);
        controller.eliminarFactura(factura1);
        assertEquals(controller.getListaFacturas().size(), 2);
    }
}