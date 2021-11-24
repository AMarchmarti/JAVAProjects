package org.mvpigs.cotxox.domain;
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

	/**
	 * Getters y setters
	 */

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValoracion() {
		return this.valoracionMedia;
	}

	public int getNumeroValoraciones(){
		return this.valoraciones.size();
	}

	public void setValoracion(byte valoracion) {
		this.valoraciones.add((double) valoracion);
		this.calcularValoracionMedia();
	}

	/**
	 * Lógica de la clase
	 */

	private double calcularValoracionMedia(){
		int sumaValoraciones = 0;
		for(Double valoracion : this.valoraciones){
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
		return this.valoracionMedia;
	}

	public void setOcupado(boolean ocupado) {
		if (ocupado) {
			this.ocupado = 1;
		} else {
			this.ocupado = 0;
		}
	}

	public Boolean isOcupado() {
		return this.ocupado != 0;
	}

}
