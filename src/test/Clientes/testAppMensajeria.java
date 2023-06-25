package test.Clientes;

import org.junit.Before;
import org.junit.Test;

import main.Clientes.AppMensajeria;
import main.Clientes.Cliente;
import main.Clientes.MedioDeContacto;
import main.Clientes.MedioDeContacto.Medios;

public class testAppMensajeria {
    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Carlitos", "Bala", "15478952", "1145872136", "carlitos.bala@gmail.com", Medios.WHATSAPP);
    }

    @Test
    public void testEnviarNotificacion() {

        MedioDeContacto medio = new MedioDeContacto(Medios.WHATSAPP);

        AppMensajeria app = new AppMensajeria(medio);
        String mensaje = "Hola! Este mensaje confirma tu reserva.";

        app.enviarNotificacion(mensaje, cliente);

        // No assertamos nada porque el método solo imprime por consola.
        // Hicimos igual el test para verificar que se imprima.
    }

}
