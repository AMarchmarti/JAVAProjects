package org.lasencinas;


import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

    @Test
    public void test_simple() {

        ProcesadorTextoSimple procesador = new ProcesadorTextoSimple();

        procesador.nueva("No");
        procesador.nueva("himporta");
        procesador.nueva("la");
        procesador.nueva("hortografia");

        assertEquals("No himporta la hortografia", procesador.textoToString());
    }

    @Test
    public void test_con_idioma() {

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.nueva("Tengo");
        procesador.nueva("hambre");

        assertEquals("Tengo hambre", procesador.textoToString());

        assertTrue(procesador.correcto(Idioma.ES));
    }
}
