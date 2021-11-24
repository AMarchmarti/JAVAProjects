package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ConductorRepo extends CrudRepository<Conductor, String> {

   Optional<Conductor> findByTarjetaCredito(String tarjeta);

   List<Conductor> findByOcupado(Integer i);

   @Query("SELECT conductor.valoracionMedia FROM Conductor conductor WHERE conductor = ?1")
   double getValoracionMedia(Conductor conductor);
}
