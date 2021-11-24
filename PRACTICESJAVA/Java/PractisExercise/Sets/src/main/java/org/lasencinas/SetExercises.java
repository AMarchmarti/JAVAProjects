package org.lasencinas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SetExercises
{
    public static void main( String[] args )
    {
        /*
        Escribe un programa en el que se generen de manera
        aleatoria 8 valores comprendidos entre 1 y 10 sin que
        haya números repetidos.
        Almacena los números en un conjunto (TreeSet).
         */

        /* Creación de los datos del objeto */
        TreeSet <Integer> tree = new TreeSet<Integer>();
        List <Integer> numeros = new ArrayList<Integer>();

        /* Creación de la lista de numeros */
        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }

        /* Ahora creamos el conjunto ordenado y
        que no se repiten
         */

        Collections.shuffle(numeros);
        for (Integer numero: numeros){
            if (tree.size() < 8){
                tree.add(numero);
            }
        }
        System.out.println(tree);

        /* Dado el siguiente String, escribe en pantalla los
        caracteres por los que está formado, y sólo una
        vez los caracteres repetidos.
         */
        String nombre = "dabalearrozalazorraelabad";
        TreeSet<Character> caracteres = new TreeSet<Character>();

        for (int i = 0; i < nombre.length(); i++){
            caracteres.add(nombre.charAt(i));
        }

        for (Character letra:caracteres){
            System.out.println(letra + " ");

        }
        /* En este ejercicio vemos que letras estan dentro del String
        aunque se repitan sólo cogera una vez su valor.
        También será de forma ordenada.
         */
    }
}
