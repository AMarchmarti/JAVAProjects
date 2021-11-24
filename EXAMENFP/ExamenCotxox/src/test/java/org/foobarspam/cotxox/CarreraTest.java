package org.foobarspam.cotxox;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Assert;
import org.junit.Test;

public class CarreraTest {

    @Test
    public void getTarjetaTest(){
        String tarjeta = "4916119711304546";
        Carrera carrera = new Carrera(tarjeta);
        Assert.assertEquals("4916119711304546", carrera.getTarjetaCredito());
    }

    @Test
    public void getOrigenTest(){
        String tarjeta = "4916119711304546";
        Carrera carrera = new Carrera(tarjeta);
        String origen = "Aeropuerto Son Sant Joan";
        carrera.setOrigen(origen);
        Assert.assertEquals("Aeropuerto Son Sant Joan", carrera.getOrigen());
    }

    @Test
    public void getDestinoTest(){
        String tarjeta = "4916119711304546";
        Carrera carrera = new Carrera(tarjeta);
        String destino = "Magaluf";
        carrera.setDestino(destino);
        Assert.assertEquals("Magaluf", carrera.getDestino());
    }


    @Test
    public void getPropinaTest(){
        String tarjeta = "4916119711304546";
        Carrera carrera = new Carrera(tarjeta);
        carrera.recibirPropina(5);
        Assert.assertEquals(5, carrera.getPropina());
    }


    @Test
    public void costeTotalTest(){
        String tarjeta = "4916119711304546";
        Carrera carrera = new Carrera(tarjeta);
        carrera.realizarPago(10.25);
        double delta = 0.01;
        Assert.assertEquals(10.25, carrera.getCosteTotal(), delta);
    }

}
