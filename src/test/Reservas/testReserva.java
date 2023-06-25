package test.Reservas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto.Medios;
import main.EstadoReserva.Cancelada;
import main.Habitacion.Habitacion;
import main.Habitacion.Suite;
import main.MedioDePago.Transferencia;
import main.Reservas.ControllerReserva;
import main.Reservas.Factura;
import main.Reservas.Reserva;
import main.Reservas.Extras.Extra;

public class testReserva {

    private Reserva reserva1;
    private Cliente cliente1;
    private Cliente cliente2;
    private ArrayList<Cliente> listaClientesReserva1;
    private ArrayList<Cliente> listaClientesReserva2;
    private Habitacion habitacionReserva1;
    private Extra extra1;
    private Extra extra2;

    @Before
    public void setUp() {

        cliente1 = new Cliente("Nombre1", "Apellido1", "12345678", "11-12345678", "mail1@gmail.com", Medios.SMS);
        cliente2 = new Cliente("Nombre2", "Apellido2", "32324111", "11-12341234", "mail2@gmail.com", Medios.WHATSAPP);

        listaClientesReserva1 = new ArrayList<Cliente>();
        listaClientesReserva1.add(cliente1);
        listaClientesReserva2 = new ArrayList<Cliente>();
        listaClientesReserva2.add(cliente2);

        habitacionReserva1 = new Suite(1, 215, 15690.0);

        extra1 = new Extra(001, "TV", 500.0);
        extra2 = new Extra(003, "PlayStation", 7000.0);

        ArrayList<Extra> extrasReserva1 = new ArrayList<Extra>();

        extrasReserva1.add(extra1);
        extrasReserva1.add(extra2);

        reserva1 = new Reserva(LocalDate.of(2023, 6, 25), LocalDate.of(2023, 6, 29), cliente1, listaClientesReserva1,
                new Transferencia("458754781", 001), habitacionReserva1, extrasReserva1);
    }

    @Test
    public void testCancelarReserva() {
        reserva1.cancelarReserva();
        assertEquals(reserva1.getActiva(), false);
        assertTrue(reserva1.getEstado() instanceof Cancelada);
    }

    @Test
    public void testCrearFactura() {
        ControllerReserva controller = ControllerReserva.getInstance();
        ArrayList<Factura> facturas = controller.getListaFacturas();

        int cantFacturasAntes = facturas.size();

        reserva1.crearFactura();

        int cantFacturasDespues = facturas.size();

        assertEquals(cantFacturasAntes + 1, cantFacturasDespues);
    }

    @Test
    public void testCalcMonto() {
        Double montoTotal = 15690.00 + 500.00 + 7000.00;
        reserva1.calcMonto();
        assertEquals(montoTotal, reserva1.getMontoTotal());
    }

}
