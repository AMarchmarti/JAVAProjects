package org.lasencinas;

import static java.lang.Math.PI;

public class Elipse extends FiguraGeometrica {

        private double radioMayor = 0d;
        private double radioMenor = 0d;

/*--------------Constructor----------------------*/

        public Elipse(){
            super();
        }

        public Elipse(Double radioMayor, Double radioMenor){
            super();
            this.radioMayor = radioMayor;
            this.radioMenor = radioMenor;
        }

        public Elipse(String nombre, Double radioMayor, Double radioMenor){
            super(nombre);
            this.radioMayor = radioMayor;
            this.radioMenor = radioMenor;
        }

/*--------------------Getters-----------*/

        public double getRadioMayor() {
            return radioMayor;
        }

        public double getRadioMenor() {
            return radioMenor;
        }

/*-------------------------Lógica----------------------*/

        @Override
        public Double area(){
            return getRadioMayor() * getRadioMenor() * PI;
        }
}
