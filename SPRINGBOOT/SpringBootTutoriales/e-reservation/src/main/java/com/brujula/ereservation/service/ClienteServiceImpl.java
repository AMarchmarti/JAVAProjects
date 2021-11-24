package com.brujula.ereservation.service;

import com.brujula.ereservation.modelo.Cliente;
import com.brujula.ereservation.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private  ClientRepository clientRepository;

    public Cliente create(Cliente cliente){
        return clientRepository.save(cliente);
    }

    public Cliente update(Cliente cliente){
        return clientRepository.save(cliente);
    }

    public void delete(Cliente cliente){
        clientRepository.delete(cliente);
    }

    public Cliente findByIdentificacion(String id){
        return clientRepository.findByIdentificacion(id);
    }

    public List<Cliente> findAll(){
        return  clientRepository.findAll();
    }
}
