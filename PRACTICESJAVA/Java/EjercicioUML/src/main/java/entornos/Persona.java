package entornos;

public class Persona {

    //Atributos

    private String dni = null;
    private String nombre = null;
    private String primerApellios = null;
    private String segundoApellido = null;

    //Setters

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellios(String primerApellios) {
        this.primerApellios = primerApellios;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    //Getters

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellios() {
        return primerApellios;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
}
