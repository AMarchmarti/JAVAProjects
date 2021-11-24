package org.mvpigs.cotxox.service;


import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Tarifa;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

@Service
public class CarreraServiceImpl implements CarreraService{

    @Autowired
    private CarreraRepo carreraRepo;

    @Override
    @Transactional
    public Long crearCarrera(String tarjeta, String origen, String destino, Integer distancia, Integer tiempo) {
        Carrera carrera = new Carrera(tarjeta);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempo);
        Double pagoEsperado = Tarifa.getCosteTotalEsperado(carrera);
        carrera.realizarPago(pagoEsperado);

        carreraRepo.save(carrera);

        return carreraRepo.findByTarjetaCredito(tarjeta).getId();
    }

    @Override
    public Carrera recuperaCarrera(Long id) {
        return carreraRepo.findById(id).get();
    }

    @Override
    public void updateCarrera(Carrera carrera) {
        carreraRepo.save(carrera);

    }
}