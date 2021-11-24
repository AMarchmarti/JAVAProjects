package com.brujula.ereservation.repository;

import com.brujula.ereservation.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Cliente, String> {

    List<Cliente> findByApellidoCli(String apellido);

    Cliente findByIdentificacion(String identificacionCli);
}
