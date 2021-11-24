
package tarjetaUsuario;

public class MainTarjeta {

    public static void main(String[] args) {
            TarjetaUsuario Jhon = new TarjetaUsuario("45367221F", true);
            System.out.println(Jhon.getTarjetaId() + " " +  Jhon.getActivada());
            TarjetaUsuario Tomas = new TarjetaUsuario("@hskadña3", false);
            System.out.println(Tomas.getTarjetaId() + " " +  Tomas.getActivada());
            TarjetaUsuario Javi = new TarjetaUsuario("123456789", true);
            System.out.println(Javi.getTarjetaId() + " " +  Javi.getActivada());
    }
}
