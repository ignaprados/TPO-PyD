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
import main.Clientes.Cliente;
import main.EstadoReserva.PendienteDePago;
import main.MedioDePago.TarjetaCredito;
import main.Habitacion.Comun;
import main.Reservas.Factura;
import main.Reservas.Extras.Extra;


public class testControllerReserva {

    private ControllerReserva controller;
    private Reserva reserva;
    private Cliente cliente;
    private ArrayList<Cliente> listaClientes;
    private TarjetaCredito tarjetaCredito;
    private Factura factura;
    private Comun habitacion;
    private ArrayList<Extra> listaExtras;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private LocalDate fechaReserva;


    @Before
    public void setUp() {
        LocalDate checkIn = LocalDate.of(2023, 6, 4);
        LocalDate checkOut = LocalDate.of(2023, 6, 8);
        LocalDate fechaReserva = LocalDate.of(2023, 6, 2);

        controller = new ControllerReserva();

        cliente = new Cliente ("Nombre", "Apellido", "DNI", "tel", "mail@gmail.com", "SMS");
        ArrayList<Cliente> listaClientes = new ArrayList <Cliente>();
        listaClientes.add(cliente);

        TarjetaCredito tarjetaCredito = new TarjetaCredito(123, 123456, "Tarjetita Anonima", LocalDate.of(2027, 04, 30));
        Factura factura = new Factura(1,99.99,"ConsumidorA");
        Comun habitacion = new Comun(2,1,false,99.99);

        ArrayList<Extra> listaExtras = new ArrayList<Extra>();

        Reserva reserva = new Reserva(checkIn, checkOut, cliente, listaClientes, tarjetaCredito, fechaReserva, 100, factura, habitacion, listaExtras);
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

        controller.crearReserva(checkIn, checkOut, cliente, listaClientes, tarjetaCredito, fechaReserva, 100, factura, habitacion, listaExtras);

        Reserva nueva_reserva = controller.getListaReservas().get(0);

        assertEquals(nueva_reserva.getCheckIn(), checkIn);
        assertEquals(nueva_reserva.getCheckOut(), checkOut);
        assertEquals(nueva_reserva.getCliente(), cliente);
        assertEquals(nueva_reserva.getListaCliente(), listaClientes);
        assertEquals(nueva_reserva.getFormaDePago(), tarjetaCredito);
        assertEquals(nueva_reserva.getFechaReserva(), fechaReserva);
        assertIsInstance(nueva_reserva.getEstado(), new PendienteDePago());
        assertEquals(nueva_reserva.getMontoTotal(), 100);
        assertEquals(nueva_reserva.getFactura(), factura);
        assertEquals(nueva_reserva.getHabitacion(), habitacion);
        assertEquals(nueva_reserva.getExtras(), listaExtras);
    }
}
