package entornos;

public class Copias {

    private Revista revista = null;
    private Biblioteca bibliotecaPropietaria = null;
    private String fecha = null;
    private Miembros miembro = null;
    private Personal empleado = null;


    /* ---- Constructor ---- */
    public Copias() {

    }

    public Copias(Biblioteca biblioteca) {
        this.bibliotecaPropietaria = biblioteca;
    }

    public Copias(Revista revista, Biblioteca bibliotecaPropietaria) {
        this.revista = revista;
        this.bibliotecaPropietaria = bibliotecaPropietaria;
    }
}
