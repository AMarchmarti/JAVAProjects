package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

import java.util.HashSet;
import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private Set<Pedido> listaPedidos = new HashSet<>();

    private Integer numBultos = 0;

    private Integer pesoTotal = 0;

    private Pedido pedido = null;

    private PedidoPeligroso pedidoPeligroso = null;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos){
        this.listaPedidos = pedidos;
    }

    @Override
    public boolean tratar() {
        if (listaPedidos.size() == this.getNumBultos() && pesoTotal > 0){
            return true;
        }
        return false;
    }

    public void calcularTotalBultos(){
        this.numBultos = (int) listaPedidos.stream().count();
    }

    public Integer getNumBultos(){return this.numBultos;}

    public void calcularPesoTotal(){
        this.pesoTotal = listaPedidos.stream().map(Pedido::peso).reduce(0,Integer::sum);
    }

    public Integer getPesoTotal(){return this.pesoTotal;}
}
