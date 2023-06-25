package test.EstadoReserva;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto.Medios;
import main.EstadoReserva.Cancelada;

import main.Habitacion.Comun;
import main.MedioDePago.Transferencia;

import main.Reservas.Reserva;
import main.Reservas.Extras.Extra;

public class testCancelada {

    private Reserva reserva;
    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Nombre", "Apellido", "12345678", "11-12345678", "mail@gmail.com", Medios.SMS);

        Comun habitacionReserva2 = new Comun(1, 417, 9584.5);

        Extra extra1 = new Extra(001, "TV", 500.0);
        Extra extra2 = new Extra(002, "Frigobar", 1500.0);

        ArrayList<Extra> extrasReserva1 = new ArrayList<Extra>();

        extrasReserva1.add(extra1);
        extrasReserva1.add(extra2);

        reserva = new Reserva(LocalDate.of(2023, 6, 25), LocalDate.of(2023, 6, 29), cliente, new ArrayList<Cliente>(),
                new Transferencia("458754781", 001), habitacionReserva2, extrasReserva1);

        reserva.setEstado(new Cancelada(reserva));

    }

    @Test
    public void testPagarReserva() {
        assertTrue(reserva.getEstado() instanceof Cancelada);

        reserva.getEstado().pagarReserva();

        assertTrue(reserva.getEstado() instanceof Cancelada);
    }

    @Test
    public void testCancelarReserva() {
        assertTrue(reserva.getEstado() instanceof Cancelada);

        reserva.getEstado().cancelarReserva();

        assertTrue(reserva.getEstado() instanceof Cancelada);

    }

}
