package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
        final static double COSTEMILLA = 1.35;
        final static double COSTEMINUTO = 0.35;
        final static double COSTEMINIMO = 5.0;
        final static double PORCENTAJECOMISION = 0.2;

        public static double getCosteDistancia(double distancia){
            return COSTEMILLA * distancia;
        }


        public static double getCosteTiempo(int tiempoEsperadoMinutos){
            return COSTEMINUTO * tiempoEsperadoMinutos;
        }



        public static double getCosteTotalEsperado(Carrera carrera){
            double total = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
            double comision = total * PORCENTAJECOMISION;
            if (total < COSTEMINIMO){
                return COSTEMINIMO;
            }else{
                return total + comision;
            }
        }
}
