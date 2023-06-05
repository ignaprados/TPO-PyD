package main.Clientes;

import java.util.ArrayList;
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
        listaClientes.add(nuevoCliente);
    }

    public void eliminarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    //methods
    public void crearCliente(String nombre, String apellido, String dni, String telefono, String mail, String medioContacto){
        Cliente nuevoCliente = new Cliente(nombre, apellido, dni, telefono, mail, medioContacto);
        agregarCliente(nuevoCliente);
    }

}
