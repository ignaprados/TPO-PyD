package main.Clientes;

public class MedioDeContacto {
    private Medios medioDeContacto;

    public enum Medios {
        SMS,
        WHATSAPP,
        EMAIL
    }

    // constructor
    public MedioDeContacto(Medios medioDeContacto) {
        this.medioDeContacto = medioDeContacto;
    }

    // getters
    public Medios getMedioDeContacto() {
        return medioDeContacto;
    }

    // setters
    public void setMedioDeContacto(Medios medioDeContacto) {
        this.medioDeContacto = medioDeContacto;
    }

    public void enviarMensaje(String mensaje, Medios medio) {

        String texto = medio.toString();
        System.out.println("ENVIANDO POR " + texto + " EL SIGUIENTE MENSAJE: " + mensaje);
    }

}
