package test.Clientes;

import main.Clientes.MedioDeContacto;

public class implementacionMedioDeContacto extends MedioDeContacto {

    public implementacionMedioDeContacto(Medios medioDeContacto) {
        super(medioDeContacto);
    }

    @Override
    public void enviarMensaje(String mensaje, Medios medio) {
        System.out.println("Implementacion de envio de mensaje:");
        super.enviarMensaje(mensaje, medio);
    }

}
