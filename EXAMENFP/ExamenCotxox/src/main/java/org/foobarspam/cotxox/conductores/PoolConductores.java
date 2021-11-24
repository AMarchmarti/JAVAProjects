package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.Collections;

public class PoolConductores {

        private ArrayList<Conductor> poolConductores = new ArrayList<>();

        public PoolConductores(ArrayList<Conductor> conductores){
            this.poolConductores = conductores;
        }

        public ArrayList<Conductor> getPoolConductores(){
            return this.poolConductores;
        }

        public Conductor asignarConductor(){
            Collections.shuffle(this.poolConductores);
            for (Conductor conductor : this.poolConductores){
                if (!conductor.isOcupado()){
                    conductor.setOcupado(true);
                    return conductor;
                }

            }
            return null;
        }

}
