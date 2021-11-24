package org.htlinking;

import static org.junit.Assert.*;

import org.htlinking.Offers.Offers;
import org.htlinking.Users.Login;
import org.htlinking.Users.Register;
import org.htlinking.Users.User;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{
    private User user = null;
    private Register regis = null;

    @Before
    public void __init__()
    {
        user = new User();
        regis = new Register();
        user.setName("Edu");
        user.setEmail("Toni");
        user.setPassword("12345678");

    }



    @Test
    public void getTest(){
        assertNotNull(user.getName());
        assertNotNull(user.getEmail());
        assertNotNull(user.getPassword());
    }

    @Test
    public void regisTest(){
        String pass = "12345678";
        user.validateUser(pass);
        //Caso test v{alido pasado
        String word = "12345634";
        user.validateUser(word);
        //Pasa los casos perfectamente
        user.registerUser(pass,regis);
        assertNotNull(regis);
    }

    @Test
    public void loginTest(){
        regis.register(user);
        assertTrue(Login.login(user.getEmail(), user.getPassword(), user));}

    @Test
    public void promoTest(){
        Offers offers = new Offers();
        offers.setPrefix("VKG");
        offers.setOferta("Fiordos y la Aurora boreal: \nCanjeando este cupón obtendrás un 30% de " +
                "descuento en un viaje preparado para poder sentir en tus pieles la tierra de los vikingos. \n" +
                "Con este viaje entra el vuelo, la estancia y además una visita guiada por las tierras del norte.  " +
                "Abriguense bien!");
        offers.addDataBase(offers.getPrefix(), offers.getOferta());
        System.out.println(user.promocionalCode("VKG", offers));
        user.saveOffers("VKG", offers);
        assertNotNull(user.getRegistrOfertas());
    }
}
