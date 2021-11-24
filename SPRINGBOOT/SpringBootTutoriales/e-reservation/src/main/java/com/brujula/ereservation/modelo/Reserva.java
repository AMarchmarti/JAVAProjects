package com.brujula.ereservation.modelo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private String idRes;

    @Temporal(TemporalType.DATE)
    private Date fechaIngresoRes;

    @Temporal(TemporalType.DATE)
    private Date fechaSalidasRes;

    private Integer cantidadPersonasRes;

    private String descripcionRes;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

}
