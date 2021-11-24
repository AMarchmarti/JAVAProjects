package entornosdedesarrollo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BusquedaBinariaTest{

    @Test
    public void testting(){
        Integer[] array = new Integer[1000];
        int j = 0;
        for (int i = (array.length - 1); i > 0; i-- ){
            array[j] = i;
            j++;
        }
        BusquedaBinaria busqueda = new BusquedaBinaria();
        busqueda.setArray(array);
        assertNotNull(array);
        assertTrue(busqueda.busquedaBinaria(8));
        assertFalse(busqueda.busquedaBinaria(-1));
    }
}
