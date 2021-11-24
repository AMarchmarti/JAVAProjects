package com.brujula.ereservation.service;

import com.brujula.ereservation.modelo.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    void delete(Cliente cliente);

    Cliente findByIdentificacion(String id);

    List<Cliente> findAll();
}
