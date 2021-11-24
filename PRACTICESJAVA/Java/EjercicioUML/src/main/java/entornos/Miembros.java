package entornos;

public class Miembros extends Persona {

    //Atributos

    private String codeMiembro = null;
    private Biblioteca biblioteca = null;
    private Libros[] copiasLibros = new Libros[2];

    //constructor

    public Miembros(String codeMiembro, Biblioteca biblioteca) {
        this.codeMiembro = codeMiembro;
        this.biblioteca = biblioteca;
    }

    //Setters

    public void setCodeMiembro(String codeMiembro) {
        this.codeMiembro = codeMiembro;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    //Getters

    public String getCodeMiembro() {
        return codeMiembro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    //Lógica
    public void añadirLibro(Libros libros) {
        for (int i = 0; i < this.copiasLibros.length; i++) {
            if (this.copiasLibros[i] == null) {
                this.copiasLibros[i] = libros;
            }
        }
    }
}
