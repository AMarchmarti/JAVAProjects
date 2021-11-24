package org.lasencinas;

public abstract class FiguraGeometrica {
//Esta clase almenos va a tener un metodo abstracto

        private String nombre;

/*------------Constructor-----------------*/

        public FiguraGeometrica(){
            this.nombre = "desconocido";
        }

        public FiguraGeometrica(String nombre){
            this.nombre = nombre;
        }

/*----------------Setters--------------------*/
        public void setNombre(){
            this.nombre = nombre;
        }

/*------------Getters---------------------*/

        public String getNombre() {
            return this.nombre;
        }

/*-------------Lógica---------------------*/
        public abstract Double area();
}
