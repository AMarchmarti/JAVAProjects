package org.lasencinas;

public class Rectangulo extends FiguraGeometrica {

        private double altura = 0d;
        private double largo = 0d;
/*---------------Constructor----------------*/
        public Rectangulo(){
            super();
        }

        public Rectangulo(Double altura, Double largo){
            super();
            this.altura = altura;
            this.largo = largo;
        }


        public Rectangulo(String nombre, Double altura, Double largo){
            super(nombre);
            this.altura = altura;
            this.largo = largo;
        }

 /*---------------------Getters-----------------------------*/
        public double getAltura() {
            return this.altura;
        }

        public double getLargo() {
            return this.largo;
        }

/*------------Lógica------------------------------------------*/
        @Override
        public Double area(){
            return getAltura() * getLargo();
        }
}
