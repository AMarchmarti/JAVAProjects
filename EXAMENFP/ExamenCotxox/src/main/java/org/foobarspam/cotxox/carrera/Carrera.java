package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {

    private int tiempoEsperadoMinutos = 0;
    private int tiempoCarreraMinutos = 0;
    private Conductor conductor = null;
    private double costeTotal = 0;
    private double distancia = 0;
    private String origen = null;
    private String destino = null;
    private String tarjetaCredito = null;
    private int propina = 0;



    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }
    /*-------------------Setters--------------------------------------------*/
    public void setOrigen(String origen){
        this.origen = origen;
    }


    public void setDestino(String destino){
        this.destino = destino;
    }


    public void setDistancia(double distancia){
        this.distancia = distancia;
    }


    public void setTiempoEsperado(int tiempo){
        this.tiempoEsperadoMinutos = tiempo;
    }


    public void recibirPropina(int propina){
        this.propina = propina;
    }


    public void realizarPago(double pago){
        this.costeTotal = pago;
    }


    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }


    public void liberarConductor(){
        getConductor().setOcupado(false);
    }


    public void asignarConductor(PoolConductores conductores){
        setConductor(conductores.asignarConductor());
    }

    /*--------------------------------Getters----------------------------------------*/

    public String getOrigen(){
        return this.origen;
    }


    public String getDestino(){
        return this.destino;
    }


    public Double getDistancia(){
        return this.distancia;
    }


    public Integer getTiempoEsperado(){
        return this.tiempoEsperadoMinutos;
    }


    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }


    public Double getCosteEsperado(){

        return Tarifa.getCosteTotalEsperado(this);
    }


    public int getPropina(){
        return this.propina;
    }


    public Double getCosteTotal(){
        return this.costeTotal;
    }


    public Conductor getConductor(){
        return this.conductor;
    }



}
