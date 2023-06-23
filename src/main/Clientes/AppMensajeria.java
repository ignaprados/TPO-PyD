package main.Clientes;

public class AppMensajeria {
    private MedioDeContacto medio;


    //constructor
    public AppMensajeria(MedioDeContacto medio){
        this.medio = medio;
    }


    //getters
    public MedioDeContacto getMedio() {
        return medio;
    }


    //setters
    public void setMedioDeContacto(MedioDeContacto medio) {
        this.medio = medio;
    }

    public void enviarNotificacion(String mensaje, Cliente cliente){
        MedioDeContacto.enviarNotificacion(mensaje, cliente.getMedioDeContacto())
    }

}
