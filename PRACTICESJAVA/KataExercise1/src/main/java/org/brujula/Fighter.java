package org.brujula;

public class Fighter {

    //Atributos
    private String name = null;
    private Integer health = 0;
    private Integer attack = 0;

    //Constructor
    public Fighter(String name, Integer health, Integer attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    //Setters

    public void setHealth(Integer health) {
        this.health -= health;
    }

    //Getters
    public Integer getAttack() {
        return attack;
    }

    public Integer getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    //Lógica
    public Integer combat(Integer damage){
        setHealth(damage);
        return getHealth();
    }
}
