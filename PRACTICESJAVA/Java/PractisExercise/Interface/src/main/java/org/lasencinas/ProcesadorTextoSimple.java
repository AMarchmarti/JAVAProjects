package org.lasencinas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTextoSimple implements Processable {

    private List<String> texto = new ArrayList<>();

    public void nueva (String palabra) {
        texto.add(palabra);
    }

    public String textoToString () {
        return texto.stream().collect(Collectors.joining(" "));
    }
}
