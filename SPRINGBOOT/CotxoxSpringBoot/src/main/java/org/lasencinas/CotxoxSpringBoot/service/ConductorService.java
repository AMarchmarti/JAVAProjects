package org.lasencinas.CotxoxSpringBoot.service;

import org.lasencinas.CotxoxSpringBoot.domain.Conductor;

public interface ConductorService {

    Conductor recuperarConductor(String tarjeta);

    void crearConductor(Conductor conductor);

    void guardarConductores();

    void init();

    Conductor recuperarConductorLibre();

    Conductor añadirValoracion(Conductor conductor, byte valoracion);
}
