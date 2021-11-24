package org.brujula;


import javax.jnlp.FileContents;

public class Kata {

    public static Boolean esPrimero(Fighter luchador, String primerGolpe) {
        if (primerGolpe.equals(luchador.getName())) {
            return true;
        }
        return false;
    }

    public static String combate(Fighter luchador, Fighter contrincante) {
        while ((luchador.getHealth() > 0) || (contrincante.getHealth() > 0)) {
            contrincante.combat(luchador.getAttack());
            if (luchador.getHealth() <= 0) {
                return contrincante.getName();
            } else {
                luchador.combat(contrincante.getAttack());
            }
        }
        return luchador.getName();
    }


    public static String declareWinner(Fighter luchador, Fighter contrincante, String primerGolpe) {
        if (esPrimero(luchador, primerGolpe)) {
            return combate(luchador, contrincante);
        }
         return combate(contrincante, luchador);
    }
}
