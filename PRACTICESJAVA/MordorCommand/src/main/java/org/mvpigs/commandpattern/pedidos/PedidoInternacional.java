package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {

    private String destino = null;

    private Integer peso = 0;

    public PedidoInternacional(String destino, Integer peso){
        this.destino = destino;
        this.peso = peso;
    }


    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String destino() {
        return destino;
    }
}
