package org.lasencinas.CotxoxSpringBoot.domain;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "t_conductores")
public class Conductor {
    @Id
    @Column(name = "co_tarjeta_credito")
    private String tarjetaCredito;

    @Column(name = "co_nombre")
    private String nombre;

    @Column(name = "co_matricula")
    private String matricula;

    @Column(name = "co_modelo")
    private String modelo;

    @Column(name = "co_valoracion_media")
    private double valoracionMedia;

    @Column(name = "co_ocupado")
    private Integer ocupado = 0;

    @Transient
    private ArrayList<Double> valoraciones = new ArrayList<>();



    /*---------- Constructores-----------------*/
    public Conductor(){}

    public Conductor(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    /*-------------------Setters---------------------------------------*/

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setOcupado(boolean ocupado) {
        if (ocupado) {
            this.ocupado = 1;
        } else {
            this.ocupado = 0;
        }
    }


    public void setValoracion(double valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularMedia();
    }

    /*-----------------------Getters-----------------------------------------------*/

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getNombre() {
        return this.nombre;
    }


    public String getMatricula() {
        return this.matricula;
    }


    public String getModelo() {
        return this.modelo;
    }


    public Boolean isOcupado() {
        return this.ocupado != 0;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public Double getValoracion() {
        return this.valoracionMedia;
    }
    /*---------------Lógica---------------------------------------------------------*/

    private Double calcularMedia() {
        double sum = 0;
        for (Double valoracion : this.valoraciones) {
            sum += valoracion;
        }
        this.valoracionMedia = sum / this.valoraciones.size();
        return this.valoracionMedia;
    }
}
