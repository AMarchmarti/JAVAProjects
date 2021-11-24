package org.lasencinas.CotxoxSpringBoot.service;

import org.lasencinas.CotxoxSpringBoot.domain.Conductor;
import org.lasencinas.CotxoxSpringBoot.repository.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConductorServiceImpl implements ConductorService{
    @Autowired
    private ConductorRepo conductorRepo;

    private List<Conductor> poolConductores;

    @PostConstruct
    public void init(){
        poolConductores = new ArrayList<>();
        String[] nombres = {"Sabrina", "Cici"};
        String[] matricula = {"5DHJ444", "7JKK555"};
        String[] modelos = {"Toyota Prius", "Mercedes A"};
        String[] tarjetas = {"2222222222222222","3333333333333333"};

        for (String tarjeta : tarjetas) {
            Conductor conductor = new Conductor(tarjeta);
            poolConductores.add(conductor);
        }

        int index = 0;
        for (Conductor conductora : poolConductores) {
            conductora.setNombre(nombres[index]);
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            conductora.setValoracion((byte) 4);
            index++;
        }
    }

    @Override
    public Conductor recuperarConductor(String tarjeta) {
        return conductorRepo.findById(tarjeta).get();
    }

    @Override
    @Transactional
    public void crearConductor(Conductor conductor) {
        conductorRepo.save(conductor);
    }

    @Override
    public Conductor recuperarConductorLibre() {
        return conductorRepo.findByOcupado(0).get(0);
    }

    @Override
    public Conductor añadirValoracion(Conductor conductor, byte valoracion) {
        conductor.setValoracion(valoracion);
        return conductorRepo.save(conductor);
    }

    @Override
    public void guardarConductores() {
        poolConductores.stream().forEach(conductor -> conductorRepo.save(conductor));
    }
}
