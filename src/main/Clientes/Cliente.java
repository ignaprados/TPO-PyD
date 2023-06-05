package main.Clientes;

public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String mail;
    private String contacto;


    //constructor
    public Cliente(String nombre, String apellido, String DNI, String telefono, String mail, String contacto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.mail = mail;
        this.contacto = contacto;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDNI(){
        return this.DNI;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getMail(){
        return this.mail;
    }

    public String getContacto(){
        return this.contacto;
    }


}
