package org.lasencinas;

import javax.crypto.spec.DESedeKeySpec;

public class Juguete implements Item{

    private String nombre;

    private Float pvp;

    public Juguete(String nombre, Float pvp) {
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
    public Packing empaquetado() {
        return new Caja("Caja");
    }
}
