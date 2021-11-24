package org.lasencinas.CotxoxSpringBoot.repository;

import org.lasencinas.CotxoxSpringBoot.domain.Carrera;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepo extends CrudRepository<Carrera, Long> {

    Carrera findByTarjetaCredito(String tarjeta);
}
