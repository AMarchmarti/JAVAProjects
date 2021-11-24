package org.lasencinas;

import java.util.*;


public enum Planeta {

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);


    //Atributos
    private double masa = 0d;
    private double radio = 0d;
    private final double CONSTANTEGRAVITACIONAL = 6.67300e-11;
    private List<Double> planetas = null;

    //Constructor
    Planeta(Double masa, Double radio){
        this.masa = masa;
        this.radio = radio;
    }

    Planeta(Double ... planets){
        this.planetas = Arrays.asList(planets);
    }


    //Getters
    public double getMasa() {
        return this.masa;
    }

    public double getRadio() {
        return this.radio;
    }

    public double getCONSTANTEGRAVITACIONAL() {
        return CONSTANTEGRAVITACIONAL;
    }

    public List<Double> getPlanetas() {
        return planetas;
    }


    //Lógica

    public Double gravedadPlaneta(){
        return getCONSTANTEGRAVITACIONAL() * getMasa() / (Math.pow(getRadio(),2));
    }


    public Double pesoSuperficie(Double peso){
        return (peso * gravedadPlaneta()) / EARTH.gravedadPlaneta();
    }

    public static EnumSet<Planeta> getPlanetasTerrestres(){
        return EnumSet.range(MERCURY,MARS);
    }

    public static EnumSet<Planeta> getGigantesGaseosos(){
        return EnumSet.range(JUPITER, NEPTUNE);
    }

}
