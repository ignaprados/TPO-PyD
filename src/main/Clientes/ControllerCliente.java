package main.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.Clientes.MedioDeContacto.Medios;

public class ControllerCliente {

    private ArrayList<Cliente> listaClientes;

    private static ControllerCliente instancia;

    // constructor
    private ControllerCliente() {
        listaClientes = new ArrayList<Cliente>();
    }

    // singleton
    public static ControllerCliente getInstance() {
        if (instancia == null) {
            instancia = new ControllerCliente();
        }

        return instancia;
    }

    // setters
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    // getters
    public ArrayList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    // CRUD clientes
    public void agregarCliente(Cliente nuevoCliente) {
        if (!(clienteExiste(nuevoCliente.getDNI())))
            listaClientes.add(nuevoCliente);
        else
            System.out.println("Ya existe un cliente con ese nro de documento.");
    }

    public void eliminarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    // methods
    public void crearCliente(String nombre, String apellido, String dni, String telefono, String mail,
            Medios medioContacto) {
        Cliente nuevoCliente = new Cliente(nombre, apellido, dni, telefono, mail, medioContacto);
        agregarCliente(nuevoCliente);
    }

    public boolean clienteExiste(String DNI) {
        List<Cliente> listaClienteFiltrada = listaClientes.stream()
                .filter(c -> c.getDNI() == DNI)
                .collect(Collectors.toList());
        if (listaClienteFiltrada.size() > 0)
            return true;
        return false;

    }
}
