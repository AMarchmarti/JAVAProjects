package org.lasencinas.CotxoxSpringBoot;


import org.junit.Assert;
import org.junit.Test;
import org.lasencinas.CotxoxSpringBoot.domain.Carrera;
import org.lasencinas.CotxoxSpringBoot.domain.Tarifa;

public class TarifaTest {

    @Test
    public void getDistanciaTest(){
        Tarifa tarifa = new Tarifa();
        double distancia = 7.75;
        double distanci = 10.2;
        double delta = 0.01;
        Assert.assertEquals(10.4625, Tarifa.getCosteDistancia(distancia), delta);
        Assert.assertEquals(13.77, Tarifa.getCosteDistancia(distanci), delta);
    }


    @Test
    public void getTiempoTest(){
        Tarifa tarifa = new Tarifa();
        int tiempo = 10;
        int temps = 15;
        double delta = 0.01;
        Assert.assertEquals(3.5, Tarifa.getCosteTiempo(tiempo), delta);
        Assert.assertEquals(5.25, Tarifa.getCosteTiempo(temps), delta);
    }

    @Test
    public void getTotal(){
        String tarjeta = "4916119711304546";
        Tarifa tarifa = new Tarifa();
        Carrera carrera = new Carrera(tarjeta);
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        double delta = 0.01;
        Assert.assertEquals(16.755, tarifa.getCosteTotalEsperado(carrera), delta);
       // Assert.assertEquals(5, Tarifa.getCosteTotalEsperado(), delta);
    }
}
