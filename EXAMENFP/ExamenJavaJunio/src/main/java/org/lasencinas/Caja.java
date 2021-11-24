package org.lasencinas;

public class Caja implements Packing{

    private String envoltorio;

    public Caja(String envoltorio){
        this.envoltorio = envoltorio;
    }

    @Override
    public String envoltorio() {
        return envoltorio;
    }
}
