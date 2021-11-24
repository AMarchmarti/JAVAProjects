package org.mvpigs.commandpattern.procesadores;

public enum Status {

    ACEPTADO("ACEPTADO"),
    RECHAZADO("RECHAZADO");

    private String estado;

    Status(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
