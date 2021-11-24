package org.lasencinas.bowlinGameProfessor;

import org.junit.*;

public class TarjetaTest {

    private Tarjeta tarjeta = null;

    @Before
    public void init() {
        tarjeta = new Tarjeta();
    }

/*
    @Test
    public void computarStrikeTest() {

        Assert.assertEquals(tarjeta.getStrike(), tarjeta.computarStrike('X'));
        Assert.assertEquals(0, tarjeta.computarStrike('9'));
    }

*/
    @Test
    public void computePinTest() {
        String pines = "-123456789";

        for (int i = 0; i < pines.length(); i++) {
            Assert.assertEquals(i, tarjeta.computarPines(pines.charAt(i)));
        }

    }


    @Test
    public void computarTarjetaVeinteBolasTest() {

        String puntuacion = "11111111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(20, tarjeta.computarTarjeta(puntuacion));
        String pins = "12345123451234512345";
        tarjeta = new Tarjeta(pins);
        Assert.assertEquals(60, tarjeta.computarTarjeta(pins));
        String pinsTwo = "9-9-9-9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(pinsTwo);
        Assert.assertEquals(90, tarjeta.computarTarjeta(pinsTwo));
        //Vamos a comprobar los casos con strike//
        String strikes = "X9-9-9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(strikes);
        Assert.assertEquals(100, tarjeta.computarTarjeta(strikes));
        String strikePins = "XXX9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(strikePins);
        Assert.assertEquals(141, tarjeta.computarTarjeta(strikePins));
        // Vamos a comprobar los casos con spare//
        String pinsSpare = "5/5/5/5/5/5/5/5/5/5/5";
        tarjeta = new Tarjeta(pinsSpare);
        Assert.assertEquals(150, tarjeta.computarTarjeta(pinsSpare));
        String threePins = "9-3/613/815/-/8-7/8/9";
        tarjeta = new Tarjeta(threePins);
        Assert.assertEquals(132, tarjeta.computarTarjeta(threePins));
        //Finalmente comprobaremos tiradas aleatorias para saber si el codigo funciona//
        String fullStrikes = "XXXXXXXXXXXX";
        tarjeta = new Tarjeta(fullStrikes);
        Assert.assertEquals(300, tarjeta.computarTarjeta(fullStrikes));
        String JOSE = "1/27XXX-/X3/X11";
        tarjeta = new Tarjeta(JOSE);
        Assert.assertEquals(165, tarjeta.computarTarjeta(JOSE));
    }

}