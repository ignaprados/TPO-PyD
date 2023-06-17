package main.Clientes;

public abstract class MedioDeContacto {
    private Medios medioDeContacto;

    public enum Medios {
        SMS,
        WHATSAPP,
        EMAIL
    }
    
    //constructor
    public MedioDeContacto(Medios medioDeContacto) {
        this.medioDeContacto = medioDeContacto;
    }

    //getters
    public Medios getMedioDeContacto() {
        return medioDeContacto;
    }

    //setters
    public void setMedioDeContacto(Medios medioDeContacto) {
        this.medioDeContacto = medioDeContacto;
    }

}
