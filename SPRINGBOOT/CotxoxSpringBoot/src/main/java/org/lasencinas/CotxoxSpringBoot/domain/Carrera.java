package org.lasencinas.CotxoxSpringBoot.domain;

import javax.persistence.*;

@Entity
@Table(name = "t_carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;

    @Column(name = "c_tarjeta_credito", nullable = false)
    private String tarjetaCredito;

    @Column(name = "c_origen")
    private String origen;

    @Column(name = "c_destino")
    private String destino;

    @Column(name = "c_distancia")
    private Double distancia;

    @Column(name = "c_tiempo_esperado")
    private Integer tiempoEsperadoMinutos;

    @Column(name = "c_tiempo_carrera")
    private Integer tiempoCarreraMinutos;

    @Column(name = "c_coste_total")
    private Double costeTotal;

    @Column(name = "c_propina")
    private Integer propina;

    @ManyToOne
    @JoinColumn(name = "c_conductor")
    private Conductor conductor;

    /*------- Constructores----------------*/
    public Carrera() {
    }

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    /*-------------------Setters--------------------------------------------*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setPropina(Integer propina) {
        this.propina = propina;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    public void setTiempoEsperado(int tiempo) {
        this.tiempoEsperadoMinutos = tiempo;
    }

    public void setTiempoCarreraMinutos(Integer tiempoCarreraMinutos) {
        this.tiempoCarreraMinutos = tiempoCarreraMinutos;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }


    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }


    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }


    public void liberarConductor() {
        getConductor().setOcupado(false);
    }


    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    /*--------------------------------Getters----------------------------------------*/

    public String getOrigen() {
        return this.origen;
    }


    public String getDestino() {
        return this.destino;
    }


    public Double getDistancia() {
        return this.distancia;
    }


    public Integer getTiempoEsperado() {
        return this.tiempoEsperadoMinutos;
    }


    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }


    public Double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }


    public int getPropina() {
        return this.propina;
    }


    public Double getCosteTotal() {
        return this.costeTotal;
    }


    public Conductor getConductor() {
        return this.conductor;
    }

    public Long getId() {
        return id;
    }

    public Integer getTiempoCarreraMinutos() {
        return tiempoCarreraMinutos;
    }
}
