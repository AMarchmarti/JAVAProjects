package entornos;

import java.util.ArrayList;
import java.util.List;

public class Personal extends Persona{

    //Atributos

    private String codeEmpleado = null;
    private Biblioteca biblioteca = null;
    private Libros [] copiasLibros = new Libros[2];
    private List<Copias> listaCopias = new ArrayList<>();

    //constructor

    public Personal(String codeEmpleado, Biblioteca biblioteca) {
        this.codeEmpleado = codeEmpleado;
        this.biblioteca = biblioteca;
    }

    //Setters

    public void setCodeEmpleado(String codeEmpleado) {
        this.codeEmpleado = codeEmpleado;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    //Getters

    public String getCodeEmpleado() {
        return codeEmpleado;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    //Lógica
    public void añadirLibro(Libros libros){
        for (int i = 0; i < this.copiasLibros.length; i++) {
            if (this.copiasLibros[i] == null) {
                this.copiasLibros[i] = libros;
            }
        }
    }

    public void añadirCopias(Copias copia){
        this.listaCopias.add(copia);
    }
}

