package dni;

public class Tests {

    public static void main(String[] args) {

        AssignationTable tabla = new AssignationTable();

        String Dni = "43180005";
        char letter = tabla.findLetter(Dni);
        char healthyletter = 'N';
        if (letter == healthyletter) {
            System.out.println("Este DNI es correcto");
        }

        String Dni2 = "43215351";
        if (tabla.findLetter(Dni2) == 'F') {
            System.out.println("Este DNI es correcto");
        }

        /* Incorrect Test Case */
        if (tabla.findLetter(Dni2) == 'J') {
            System.out.println("Este DNI es correcto");
        } else {
            System.out.println("Este DNI no es correcto");
        }
    }
}
