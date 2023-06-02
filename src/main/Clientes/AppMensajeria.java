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
    public void setMedio(MedioDeContacto medio) {
        this.medio = medio;
    }

}
