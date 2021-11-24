package org.lasencinas;

public abstract class Cereales implements Item {

    private String nombre = null;

    private Float pvp = null;

    public Cereales(){

    }

    public Cereales(String nombre, Float pvp){
        this.nombre = nombre;
        this.pvp = pvp;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Float pvp() {
        return pvp;
    }

    @Override
    public abstract String toString();

    @Override
    public Packing empaquetado() {
        return new Caja("Caja");
    }

}
