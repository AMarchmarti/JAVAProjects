package com.brujula.ereservation.resources;

import com.brujula.ereservation.modelo.Cliente;
import com.brujula.ereservation.modelo.Dto.ClienteDto;
import com.brujula.ereservation.resources.converter.ClienteConverter;
import com.brujula.ereservation.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> createCliente(ClienteConverter clienteConverter, ClienteDto clienteDto){
        Cliente cliente = clienteConverter.apiModel(clienteDto);
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/{identificacion}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("identificacion") String identificacion, ClienteDto clienteDto, ClienteConverter clienteConverter){
        Cliente cliente = clienteService.findByIdentificacion(identificacion);
        if (cliente == null){
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }else{
            cliente = clienteConverter.apiModel(clienteDto);
        }
        return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{identificacion}")
    public void removeCliente(@PathVariable("identificacion") String identificacion){
        Cliente cliente = clienteService.findByIdentificacion(identificacion);
        if (cliente != null){
            clienteService.delete(cliente);}
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return ResponseEntity.ok(clienteService.findAll());
    }
}
