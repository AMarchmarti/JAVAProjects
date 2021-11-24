package entornos;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca extends EntidadPublica {

        //Atributos

        private String director = null;
        private Ayuntamiento codeAyunt = null;
        private EntidadPublica entidadPublica = null;

        public Set<Personal> listaEmpleado = new HashSet<>();
        public Set<Miembros> listaMiembros = new HashSet<>();

        //Constructor

        public Biblioteca(Ayuntamiento codeAyunt, EntidadPublica entidadPublica) {
                this.codeAyunt = codeAyunt;
                this.director = director;
        }

        //Seters

        public void setDirector (String director) {
                this.director =director;
        }

        public void setCodeAyunt(Ayuntamiento codeAyunt) {
                this.codeAyunt = codeAyunt;
        }

        public void setEntidadPublica(EntidadPublica entidadPublica) {
                this.entidadPublica = entidadPublica;
        }

        //Geters

        public String getDirector() {
                return director;
        }

        public Ayuntamiento getCodeAyunt() {
                return codeAyunt;
        }

        public EntidadPublica getEntidadPublica() {
                return entidadPublica;
        }
}
