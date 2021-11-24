package org.lasencinas.CotxoxSpringBoot.repository;

import org.lasencinas.CotxoxSpringBoot.domain.Conductor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import java.util.List;

public interface ConductorRepo extends CrudRepository<Conductor, String> {

    List<Conductor> findByOcupado(Integer i);

    @Query("SELECT conductor.valoracionMedia FROM Conductor conductor WHERE conductor = ?1")
    double getValoracionMedia(Conductor conductor);
}
