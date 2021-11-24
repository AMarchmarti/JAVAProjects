package org.lasencinas;

public class PlanetaMain {

    public static void main(String[] args) {

        double peso = 175; // kg

        for (Planeta planeta : Planeta.values()) {
            System.out.printf("Your weight on %s is %f \n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the terrestrial planets: ");
        for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
            System.out.printf("Your weight on %s is %f \n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the gas giant planets: ");
        for (Planeta planeta : Planeta.getGigantesGaseosos()) {
            System.out.printf("Your weight on %s is %f \n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}
