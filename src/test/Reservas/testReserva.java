package test.Reservas;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto.Medios;
import main.Habitacion.Comun;
import main.Habitacion.Habitacion;
import main.Habitacion.Suite;
import main.MedioDePago.MedioDePago;
import main.Reservas.Reserva;
import main.Reservas.Extras.Extra;
import test.Reservas.Extras.mockMedioDePago;

public class testReserva {

    private Reserva reserva1;
    private Reserva reserva2;
    private Cliente cliente1;
    private Cliente cliente2;
    private ArrayList<Cliente> listaClientesReserva1;
    private ArrayList<Cliente> listaClientesReserva2;
    private Habitacion habitacionReserva1;
    private Habitacion habitacionReserva2;
    private Extra extra1;
    private Extra extra2;
    private Extra extra3;
    private MedioDePago mockMedioDePago;

    /**
     * 
     */
    @Before
    public void setUp() {

        cliente1 = new Cliente("Nombre1", "Apellido1", "12345678", "11-12345678", "mail1@gmail.com", Medios.SMS);
        cliente2 = new Cliente("Nombre2", "Apellido2", "32324111", "11-12341234", "mail2@gmail.com", Medios.WHATSAPP);

        listaClientesReserva1 = new ArrayList<Cliente>();
        listaClientesReserva1.add(cliente1);
        listaClientesReserva2 = new ArrayList<Cliente>();
        listaClientesReserva2.add(cliente2);

        habitacionReserva1 = new Suite(1, 215, 15690.0);
        habitacionReserva2 = new Comun(1, 417, 9584.5);

        extra1 = new Extra(001, "TV", 500);
        extra2 = new Extra(002, "Frigobar", 1500);
        extra3 = new Extra(003, "PlayStation", 7000);

        ArrayList<Extra> extrasReserva1 = new ArrayList<Extra>();
        ArrayList<Extra> extrasReserva2 = new ArrayList<Extra>();

        extrasReserva1.add(extra1);
        extrasReserva1.add(extra3);

        extrasReserva2.add(extra2);

        mockMedioDePago = new mockMedioDePago();

        reserva1 = new Reserva(LocalDate.of(2023, 6, 25), LocalDate.of(2023, 6, 29), cliente1, listaClientesReserva1,
                mockMedioDePago, 0, habitacionReserva1, extrasReserva1);
        reserva2 = new Reserva(LocalDate.of(2023, 7, 14), LocalDate.of(2023, 8, 1), cliente2, listaClientesReserva2,
                mockMedioDePago, 0, habitacionReserva2, extrasReserva2);
    }

}
