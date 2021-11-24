package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

        private String nombre = null;
        private String matricula = null;
        private String modelo = null;
        private double valoracionMedia = 0;
        private ArrayList<Double> valoraciones = new ArrayList<>();
        private Boolean ocupado = false;

        public Conductor(String nombre){
            this.nombre = nombre;
        }
/*-------------------Setters---------------------------------------*/


        public void setMatricula(String matricula){
            this.matricula = matricula;
        }


        public void setModelo(String modelo){
            this.modelo = modelo;
        }


        public void setOcupado(boolean ocupado){
            this.ocupado = ocupado;
        }


        public void setValoracion(double valoracion){
            this.valoraciones.add(valoracion);
            this.calcularMedia();
        }

/*-----------------------Getters-----------------------------------------------*/

        public String getNombre(){
            return this.nombre;
        }


        public String getMatricula(){
            return this.matricula;
        }


        public String getModelo(){
            return this.modelo;
        }


        public Boolean isOcupado(){
            return this.ocupado;
        }


        public Double getValoracion(){
            return this.valoracionMedia;
        }
/*---------------Lógica---------------------------------------------------------*/

        private Double calcularMedia(){
            double sum = 0;
            for (Double valoracion : this.valoraciones){
                sum += valoracion;
            }
            this.valoracionMedia = sum / this.valoraciones.size();
            return this.valoracionMedia;
        }
}
