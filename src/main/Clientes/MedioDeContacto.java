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

    public final void enviarMensaje(String mensaje, MedioDeContacto medio){
        switch (medio) {
            case SMS:
                System.out.println("Enviando por SMS el siguiente mensaje:" + mensaje);
                break;
            
            case WHATSAPP:
                System.out.println("Enviando por Whatsapp el siguiente mensaje:" + mensaje);
                break;

            case EMAIL:
                System.out.println("Enviando por email el siguiente mensaje:" + mensaje);
                break;
            default:
                break;
        }
    }

}
