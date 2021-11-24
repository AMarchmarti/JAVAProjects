import java.util.Scanner;


public class VerifyDNI {

    public void verifyDni(){

        String readKeyboard = readKeyboard();
        verify(readKeyboard);


    }

    public String readKeyboard(){

        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        return read;
    }


    private boolean checkLength(String read){

        if (read.length() == 9) {
            return true;
        }
        else{
            return false;
        }
    }

    private boolean dniNumbers (String read){
        try {
            int num = Integer.parseInt(read.substring(0,7));
            return true;
        } catch (NumberFormatException num) {
            return false;
        }

    }


    private boolean dniLetters (String read){

        String dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newstring = read.substring(8);
        if (dic.indexOf(newstring) != -1){
            return true;
        }else{
        return true;}
    }

    private boolean verify(String read) {

        if (checkLength(read) && dniNumbers(read) && dniLetters(read)) {
            System.out.println("DNI correcto!");
            return true;
        } else {
            System.out.println("Este DNI no es correcto");
            return false;
        }
    }



}
