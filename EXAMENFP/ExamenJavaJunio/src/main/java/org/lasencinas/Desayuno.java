package org.lasencinas;

import java.util.HashSet;
import java.util.Set;

public class Desayuno{

    private Set<Item> items = new HashSet<>();

    public Desayuno(){}

    public void setItems(Item item) {
        this.items.add(item);
    }

    public Set<Item> getItems() {
        return items;
    }

    public void mostrarItems(){
        for (Item item : getItems()){
        System.out.println("Item: " + item.nombre() + ", Empaquetado: " + item.empaquetado().envoltorio() + ", Precio: " + item.pvp());}
    }

    public Float getCoste(){
        Float total = 0f;
        for (Item item : getItems()){
            total += item.pvp();
        }
        return total;
    }

}
