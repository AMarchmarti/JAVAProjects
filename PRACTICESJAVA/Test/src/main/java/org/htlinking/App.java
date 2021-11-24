package org.htlinking;


import org.htlinking.Offers.Offers;
import org.htlinking.Users.Login;
import org.htlinking.Users.Register;
import org.htlinking.Users.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Register registro = new Register();
        Offers offer = new Offers();
        Scanner scanner = new Scanner(System.in);


        //Base de datos de la ofertas

        offer.addDataBase("VKG", "-Fiordos y la Aurora boreal:\n Canjeando este cupón obtendrás un 30% de " +
                "descuento en un viaje preparado para poder sentir en tus pieles la tierra de los vikingos. \n" +
                "Con este viaje entra el vuelo, la estancia y además una visita guiada por las tierras del norte.  " +
                "Abriguense bien!");


        offer.addDataBase("TLotR", "-La Tierra Media:\n Canjeando este cupón obtendrás un 15% de descuento en un viaje para ver la Tierra dónde " +
                "se rodo el Señor de Los Anillos, \nademás incluye, con todos los gastos pagados, un tour por las zonas " +
                "dónde se rodaron las películas. \nImagínate estar en la Comarca o ver las praderas de Rohan. Si eres un " +
                "fan de estas magnífica saga no lo dudes, aprovecha esta oportunidad.");
        ;

        /* Primera historia de usuario: Como Usuario que quiere adquirir ofertas deseo poder registrarme*/

        Boolean enter = false;
        while (!enter) {
            System.out.println("Bienvenido a nuestra plataforma de adquisición de ofertas para fabulosos viajes, hoteles" +
                    " entre otras experiencias. \n");
            User user = new User();
                    /*+
                    "¿Desea registrarse? Si o No");

            String respuesta = scanner.nextLine();

            if (respuesta.toLowerCase().equals("si")) {
*/
            System.out.println("Nombre:");
            String name = scanner.nextLine();
            user.setName(name);

            System.out.println("Email:");
            String email = scanner.nextLine();
            user.setEmail(email);

            System.out.println("Contraseña:");
            String pass = scanner.nextLine();
            user.setPassword(pass);

            System.out.println("Repita Contraseña:");
            String rpass = scanner.nextLine();


            user.registerUser(rpass, registro);


            //} else if (respuesta.toLowerCase().equals("no")) {

            /* Segunda historia de usuario: Como usuario registrado deseo loggear para ver las ofertas*/


            System.out.println("¿Quiere loggear?");
            //String loginin = scanner.nextLine();

            //if (loginin.toLowerCase().equals("si")) {
            System.out.println("Introduzca Email:");
            String emaildos = scanner.nextLine();

            System.out.println("Introduzca Contraseña:");
            String password = scanner.nextLine();


            user.loginValid(emaildos, password);

            //enter = true;
               /* }
                else {
                    System.out.println("Pase un buen día, Adiós");
                    break;*/

            //Tercera historia de usuario: Como usuario quiero poder visualizar las ofertas existentes para poder seleccionarlas

            System.out.println("Desea ver las ofertas que tenemos? Si o No");
            if (scanner.nextLine().equals("si")) {
                user.showOffers(offer);
            } else {
                System.out.println("Muchas gracias por visitarnos vuelve cuando quiera. Adiós");
                break;
            }



        //Cuarta historia de usuario: Como usuario quiero seleccionar una oferta para poder canjearla

        System.out.println("Selecciona la oferta o ofertas que mas te gusten solo tienes que escribir su código y recibirá" +
                "su código promocional");
            System.out.println(user.promocionalCode(scanner.nextLine(),offer));
                System.out.println("Introduzca su código: ");
            //System.out.println(user.promocionalCode(scanner.nextLine(),offer));
                user.saveOffers(scanner.nextLine(),offer);
                System.out.println("¿Desea alguno más?");
            while (true){
                if (scanner.nextLine().equals("si")){
                    System.out.println("Introduzca su código: ");
                    user.promocionalCode(scanner.nextLine(),offer);
                    user.saveOffers(scanner.nextLine(),offer);
                    System.out.println("¿Desea alguno más?");
                }else{
                    System.out.println("Tus datos han sido registrados");
                    break;
                }
            }break;}

    }
}

