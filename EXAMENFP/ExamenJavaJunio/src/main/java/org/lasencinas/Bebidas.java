package org.lasencinas;

public abstract class Bebidas implements Item{

    private String nombre;

    private Float pvp;

    public Bebidas(){}

    public Bebidas(String nombre, Float pvp){
        this.nombre = nombre;
        this.pvp = pvp;
    }

    @Override
    public String nombre(){
        return nombre;
    }

    @Override
    public Packing empaquetado() {
        return new Tubo("Tubo");
    }

    @Override
    public Float pvp(){
        return pvp;
    }
}
