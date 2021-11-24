package com.brujula.ereservation.modelo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "cliente")
@NamedQuery(name = "Cliente.findByIdentificacion", query = "select c from Cliente c where c.identificacionCli = ?1")
@Data public class Cliente {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private String idCli;

    private String nombreCli;

    private String apellidoCli;

    private String identificacionCli;

    private String direccionCli;

    private String telefonoCli;

    private String emailCli;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private Set<Reserva> reservas;

    public Cliente(){
        //TODO Auto-generated constructor stub
    }

}
