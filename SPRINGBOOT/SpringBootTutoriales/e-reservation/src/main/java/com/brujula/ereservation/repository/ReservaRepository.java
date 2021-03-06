package com.brujula.ereservation.repository;

import com.brujula.ereservation.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

    @Query("select r from Reserva r where r.fechaIngresoRes = :fechaInicio and r.fechaSalidasRes = :fechaSalida")
    List<Reserva> find(@Param("fechaInicio")Date fechaInicio, @Param("fechaSalida") Date fechaSalida);
}
