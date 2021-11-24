package dni;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCasesDni {


    public void testCases() throws Exception {
        List<String> casos = fileToList();
        passTestCases(casos);
    }

    private ArrayList<String> fileToList() throws Exception {
        File file = new File("dnicorrectos.txt");
        Scanner test = new Scanner(file);
        ArrayList<String> casosTest = new ArrayList();
        while (test.hasNextLine()) {
            String caso = test.nextLine();
            casosTest.add(caso);
        }
        return casosTest;
    }

    private void passTestCases(List<String> casosTest) {

        for (String dni : casosTest) {
            Dni objetoDniCif = new Dni(dni);
            System.out.print(objetoDniCif.getDni());

            if (objetoDniCif.checkDniCif()) {
                System.out.println(" PASS");
            } else
                System.out.println(" FAIL");

            System.out.println("dni --> " + objetoDniCif.getNumeroSano());
            System.out.println("letra --> " + objetoDniCif.getLetraSana());
            try {
                System.out.println("La letra debería ser --> " + objetoDniCif.obtenerLetra());
            } catch (IOException ioexcepcion) {
                System.out.println("La letra es --> " + objetoDniCif.getLetters());
            }
        }

    }
}
