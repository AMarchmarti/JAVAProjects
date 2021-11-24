package entornosdedesarrollo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BusquedaBinaria {

        private Integer[] numeros = null;

    public void setArray(Integer[] numeros) {
        this.numeros = numeros;
    }

    public Integer[] getArray() {
        return this.numeros;
    }

    public boolean busquedaBinaria(Integer numero){
            int posIzq = 0;
            int posDer = getArray().length - 1;
            int posCentral = (posIzq + posDer)/2;
            while (posIzq < posDer && numero != this.numeros[posCentral]){
                if (numero > this.numeros[posCentral]){
                    posDer = posCentral - 1;
                }else{
                    posIzq = posCentral + 1;
                }
                posCentral = (posIzq + posDer) / 2;
            }
            if (numero == getArray()[posCentral]){
                return true;
            }else{
                return false;
            }
        }


}
