package test.CronJobs;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto.Medios;
import main.CronJobs.CronJobPagoExpirado;
import main.EstadoReserva.Cancelada;
import main.Habitacion.Comun;
import main.MedioDePago.Efectivo;
import main.Reservas.ControllerReserva;
import main.Reservas.Reserva;
import main.Reservas.Extras.Extra;

public class testCronJobPagoExpirado {

    private ControllerReserva controllerReserva;
    private Reserva reserva;
    private Cliente cliente;

    @Before
    public void setUp() {

        cliente = new Cliente("Nombre1", "Apellido1", "12345678", "11-12345678", "mail1@gmail.com", Medios.SMS);
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(cliente);

        Extra extra = new Extra(001, "TV", 500.0);
        ArrayList<Extra> extras = new ArrayList<Extra>();
        extras.add(extra);

        reserva = new Reserva(LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 25), cliente, listaClientes,
                new Efectivo(), new Comun(2, 125, 100.00), extras);

        controllerReserva.agregarReserva(reserva);
    }

    @Test
    public void testCalcularHorasPasadas() {
        long horasPasadas = CronJobPagoExpirado.calcularHorasPasadas(reserva);

        assertTrue(horasPasadas < 24);
    }

    @Test
    public void testPagoExpirado() { // chequear
        CronJobPagoExpirado.pagoExpirado(reserva);

        assertTrue(reserva.getEstado() instanceof Cancelada);
    }
}
