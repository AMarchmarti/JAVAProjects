package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido {

    private String destino = null;

    private Integer peso = 0;

    public PedidoNacional(String lugar, Integer cantidad){
        this.destino = lugar;
        this.peso = cantidad;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }
}
