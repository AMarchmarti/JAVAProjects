package org.mvpigs.commandpattern.interfaces;


/**
 * La interfaz Pedido implementa los metodos:
 * <p>
 * peso
 *
 * @param void
 * @param void
 * @return el peso del pedido
 * <p>
 * destino
 * @return el destino del pedido
 */

public interface Pedido {

    public int peso();

    public String destino();

    String getId();

}