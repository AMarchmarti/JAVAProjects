package com.brujula.ereservation.resources.converter;

import com.brujula.ereservation.modelo.Cliente;
import com.brujula.ereservation.modelo.Dto.ClienteDto;


public class ClienteConverter {

    public Cliente apiModel (ClienteDto clienteDto){
        Cliente cliente = new Cliente();
        cliente.setNombreCli(clienteDto.getNombreCli());
        cliente.setApellidoCli(clienteDto.getApellidoCli());
        cliente.setTelefonoCli(clienteDto.getTelefonoCli());
        cliente.setDireccionCli(clienteDto.getDireccionCli());
        cliente.setEmailCli(clienteDto.getEmailCli());
        return cliente;
    }
}
