package org.lasencinas;

public class Cuadrado extends FiguraGeometrica {

        private double lado = 0d;

/*------------Constructor-------------------*/
        public Cuadrado(){
            super();
        }

        public Cuadrado(Double lado){
            super();
            this.lado = lado;
        }

        public Cuadrado(String nombre, Double lado){
            super(nombre);
            this.lado = lado;
        }

/*------------Getters-----------------------*/

        public Double getLado(){
            return this.lado;
        }

/*-----------Lógica--------------------------*/

        @Override
        public Double area(){
            return Math.pow(getLado(),2);
        }
}
