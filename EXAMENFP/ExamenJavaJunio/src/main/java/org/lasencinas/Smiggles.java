package org.lasencinas;

public class Smiggles extends Cereales {

    public Smiggles(){super();}

    public Smiggles(String nombre, Float pvp){
        super(nombre, pvp);
    }


    @Override
    public String nombre() {
        return super.nombre();
    }

    @Override
    public Float pvp() {
        return super.pvp();
    }


    @Override
    public String toString() {
        return null;
    }
}
