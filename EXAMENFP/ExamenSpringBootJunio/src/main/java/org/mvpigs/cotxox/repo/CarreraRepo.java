package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Carrera;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CarreraRepo extends CrudRepository<Carrera, Long> {

    Carrera findByTarjetaCredito(String tarjeta);

    Optional<Carrera> findById(Long id);
}
