package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private PedidoPeligroso pedidoPeligroso;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido){
        this.pedidoPeligroso = pedido;
    }

    @Override
    public boolean tratar() {
        if (!pedidoPeligroso.instrucciones().equals("no ponerselo en el dedo")){
            return true;
        }
        return false;
    }
}
