package org.lasencinas;

public class Tubo implements Packing {

    private String envoltorio;

    public Tubo(String envoltorio){
        this.envoltorio = envoltorio;
    }

    @Override
    public String envoltorio() {
        return envoltorio;
    }
}
