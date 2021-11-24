package org.htlinking;

import org.htlinking.Offers.Offers;
import org.htlinking.Users.Register;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OffersTest {

    private Offers offers = null;


    @Before
    public void __init__() {
        offers = new Offers();
    }


    @Test
    public void arrayTest(){
        offers.setPrefix("VKG");
        offers.setOferta("Fiordos y la Aurora boreal: \nCanjeando este cupón obtendrás un 30% de " +
                "descuento en un viaje preparado para poder sentir en tus pieles la tierra de los vikingos. \n" +
                "Con este viaje entra el vuelo, la estancia y además una visita guiada por las tierras del norte.  " +
                "Abriguense bien!");
        offers.addDataBase(offers.getPrefix(), offers.getOferta());
        assertNotNull(offers.getOferta());
        assertNotNull(offers.getDataBase());
        //System.out.println(offers.getDescription());
        System.out.println(offers.accesDB());
    }

    @Test
    public void selectTest(){
        offers.setPrefix("VKG");
        offers.setOferta("Fiordos y la Aurora boreal: \nCanjeando este cupón obtendrás un 30% de " +
                "descuento en un viaje preparado para poder sentir en tus pieles la tierra de los vikingos. \n" +
                "Con este viaje entra el vuelo, la estancia y además una visita guiada por las tierras del norte.  " +
                "Abriguense bien!");
        offers.addDataBase(offers.getPrefix(), offers.getOferta());
        offers.selectOffer("VFG");
    }
}
