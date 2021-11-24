package org.lasencinas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LoteryExercise {
    public static void main( String[] args ) {
        /* Creación del número ganador y del reintrego */
        List<Integer> numeros = new ArrayList<Integer>();
        List<Integer> reintrego = new ArrayList<Integer>();
        /*Vemos que definimos la lista que todo lo que va a contener seran objetos de Integer */

        for (int i = 1; i <= 49; i++) {
            numeros.add(i);
        }
        /* Creamos la lista de numeros permitidos y ahora la lista de numeros del reintrego */

        for (int i = 1; i <= 9; i++) {
            reintrego.add(i);
        }

        /* Ahora vamos a hacer la logica del programa, dónde elegirimos aleatoriamente
        5 dígitos de numeros y 1 numero de reintrgo
         */

        for (int i = 0; i < 5; i++) {
            Collections.shuffle(numeros);
            Collections.shuffle(reintrego);
            System.out.println("Combinación " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.println(numeros.get(j) + ",");
            }
            System.out.println(numeros.get(5));
            System.out.println("    Complementario: " + numeros.get(6));
            System.out.println("\t Reintrego: " + reintrego.get(0));
        }
    }

}

