package org.lasencinas.CotxoxSpringBoot.domain;

public class Tarifa {
        private static double costeMilla = 1.35;
        private static double costeMinuto = 0.35;
        private static double costeMinimo = 5.0;
        private static double porcentajeComision = 0.2;

        public static double getCosteDistancia(double distancia){
            return costeMilla * distancia;
        }


        public static double getCosteTiempo(int tiempoEsperadoMinutos){
            return costeMinuto * tiempoEsperadoMinutos;
        }

        //Recordamos que hay que poner la clase carrera pero para comprobar que la clase funciona ponemos distancia y tiempo.

        public static double getCosteTotalEsperado(Carrera carrera){
            double total = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
            double comision = total * porcentajeComision;
            if (total < costeMinimo){
                return costeMinimo;
            }else{
                return total + comision;
            }
        }
}
