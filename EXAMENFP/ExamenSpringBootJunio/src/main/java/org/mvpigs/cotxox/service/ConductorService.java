package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;

public interface ConductorService {

    Conductor recuperarConductor(String tarjeta);

    void crearConductor(Conductor conductor);

    void init();

    Conductor recuperarConductorLibre();

    Conductor añadirValoracion(Conductor conductor, byte valoracion);
}