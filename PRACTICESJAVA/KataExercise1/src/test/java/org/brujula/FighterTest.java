package org.brujula;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FighterTest {

    @Test
    public void fighterTest(){
        Fighter fighter = new Fighter("Toni", 10, 10);
        fighter.setHealth(5);
        assertEquals(5, fighter.getHealth(),0);
        assertEquals(10, fighter.getAttack(),0);
        assertEquals("Toni", fighter.getName());
        assertEquals(-5, fighter.combat(fighter.getAttack()), 0);
    }

    @Test
    public void basicTests() {
        assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}