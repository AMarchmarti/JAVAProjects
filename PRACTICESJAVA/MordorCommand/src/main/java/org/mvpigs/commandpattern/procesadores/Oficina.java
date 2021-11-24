package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    @Override
    public boolean procesa(TratamientoPedido pedido) {
        if(pedido.tratar()){
            return true;
        }
        return false;
    }

    public String printarStatus(Boolean tratable, Pedido pedido){
        if (tratable){
            return pedido.destino() + " " + Status.ACEPTADO.getEstado();
        }
        return pedido.destino() + " " + Status.RECHAZADO.getEstado();
    }
}
