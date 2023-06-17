package main.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerCliente {

    private ArrayList<Cliente> listaClientes;


    //constructor
    public ControllerCliente(){
        listaClientes = new ArrayList<Cliente>();
    }
    //setters
    public void setListaClientes(ArrayList<Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }

    //getters
    public ArrayList<Cliente> getListaClientes(){
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

    //methods
    public void crearCliente(String nombre, String apellido, String dni, String telefono, String mail, String medioContacto){
        Cliente nuevoCliente = new Cliente(nombre, apellido, dni, telefono, mail, medioContacto);
        agregarCliente(nuevoCliente);
    }

    public boolean clienteExiste(String DNI){
        List<Cliente> listaClienteFiltrada = listaClientes.stream()
        .filter(c -> c.getDNI() == DNI)
        .collect(Collectors.toList());
        if (listaClienteFiltrada.size() > 0)
            return true;
        return false;

    }
}
