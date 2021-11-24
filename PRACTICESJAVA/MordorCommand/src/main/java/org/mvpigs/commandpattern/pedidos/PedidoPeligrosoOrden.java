package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements Pedido, PedidoPeligroso {

    private String destino = null;

    private Integer peso = null;

    private String instrucciones = null;

    public PedidoPeligrosoOrden(String lugar, String instrucciones){
        this.destino = lugar;
        this.instrucciones = instrucciones;
    }


    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String instrucciones() {
        return instrucciones;
    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return destino;
    }
}
