package com.brujula.ereservation.modelo.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ClienteDto {

    private String nombreCli;

    private String apellidoCli;

    private String identificacionCli;

    private String direccionCli;

    private String telefonoCli;

    private String emailCli;
}
