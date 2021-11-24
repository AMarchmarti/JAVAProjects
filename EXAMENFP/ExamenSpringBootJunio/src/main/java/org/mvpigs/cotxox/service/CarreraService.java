package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;

public interface CarreraService {

    Long crearCarrera(String tarjeta, String origen, String destino, Integer distancia, Integer tiempo);

    Carrera recuperaCarrera(Long id);

    void updateCarrera(Carrera carrera);
}