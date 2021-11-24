package org.lasencinas;

import static java.lang.Math.PI;

public class Circulo extends FiguraGeometrica{

        private double radio = 0d;
 /*--------------------Constructor-----------------*/

        public Circulo(){
            super();
        }

        public Circulo(Double radio){
            super();
            this.radio = radio;
        }

        public Circulo(String nombre, Double radio){
            super(nombre);
            this.radio = radio;
        }

/*---------------------Getters----------------------*/

    public double getRadio() {
        return radio;
    }

/*--------------------Lógica-----------------------------*/
    @Override
    public Double area(){
        return Math.pow(getRadio(), 2) * PI;
    }
}
