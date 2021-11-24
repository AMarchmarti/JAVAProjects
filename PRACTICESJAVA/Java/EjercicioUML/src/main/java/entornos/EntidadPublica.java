package entornos;

public class EntidadPublica {
    //Atributos

    private String code = null;
    private String nombre = null;
    private String direccion = null;

    //Constructor

    public EntidadPublica() {
    }

    //Seters

    public void setCode(String code) {
        this.code = code;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Geters

    public String getCode() {
        return this.code;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }
}
