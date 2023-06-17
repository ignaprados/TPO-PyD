package test.Clientes;

// Import Junit
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

// Import Assert
import static org.junit.Assert.*;

// Import clases
import main.Clientes.Cliente;
import main.Clientes.ControllerCliente;


public class testControllerCliente {

    private ControllerCliente controller;
    private Cliente cliente1;
    private Cliente cliente2;

    @Before
    public void setUp() {
        controller = new ControllerCliente();

        cliente1 = new Cliente("Nombre1", "Apellido1", "12345678", "11-12345678", "mail1@gmail.com", "SMS");
        cliente2 = new Cliente("Nombre2", "Apellido2", "32324111", "11-12341234", "mail2@gmail.com", "WhatsApp");

        controller.agregarCliente(cliente1);
        controller.agregarCliente(cliente2);
    }

    @Test
    public void testAgregarCliente() {
        ArrayList<Cliente> listaClientes = controller.getListaClientes();
        Cliente cliente3 = new Cliente("Nombre3", "Apellido3", "32234221", "11-12345678", "mail3@gmail.com", "SMS");

        controller.agregarCliente(cliente3);

        assertTrue(listaClientes.contains(cliente3));
        assertEquals(listaClientes.size(), 3);
    }

    @Test
    public void testEliminarCliente() {
        ArrayList<Cliente> listaClientes = controller.getListaClientes();

        controller.eliminarCliente(cliente1);

        assertFalse(listaClientes.contains(cliente1));
        assertTrue(listaClientes.contains(cliente2));
    }

    @Test
    public void testCrearCliente() {
        controller.setListaClientes(new ArrayList<Cliente>());
        controller.crearCliente("nombre", "apellido", "DNI", "telefono", "mail", "medio de contacto");

        Cliente nuevo_cliente = controller.getListaClientes().get(0);

        assertEquals(nuevo_cliente.getNombre(), "nombre");
        assertEquals(nuevo_cliente.getApellido(), "apellido");
        assertEquals(nuevo_cliente.getDNI(), "DNI");
        assertEquals(nuevo_cliente.getTelefono(), "telefono");
        assertEquals(nuevo_cliente.getMail(), "mail");
        assertEquals(nuevo_cliente.getContacto(), "medio de contacto");
    }

    @Test
    public void testCrearClienteRepetido() {
        controller.setListaClientes(new ArrayList<Cliente>());
        controller.crearCliente("nombre", "apellido", "DNI", "telefono", "mail", "medio de contacto");

        controller.crearCliente("nombre2", "apellido2", "DNI", "telefono2", "mail2", "medio de contacto2");

        assertEquals(controller.getListaClientes().size(), 1);
    }

    @Test
    public void testClienteExiste() {
        boolean existeCliente = controller.clienteExiste("12345678");
        assertTrue(existeCliente);
    }

    @Test
    public void testClienteExisteFalso() {
        boolean existeCliente = controller.clienteExiste("dniRandom");
        assertFalse(existeCliente);
    }

}
