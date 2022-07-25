package com.br.dio.designpatternsspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.dio.designpatternsspring.model.Client;
import com.br.dio.designpatternsspring.service.ClientService;

@RestController
@RequestMapping( "client" )
public class ClientController
{

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAll()
    {
        return ResponseEntity.ok( clientService.findAll() );
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Client> findById(
        @PathVariable final Long id )
    {
        return ResponseEntity.ok( clientService.findById( id ) );
    }

    @PostMapping
    public ResponseEntity<Client> save(
        @RequestBody final Client client )
    {
        return ResponseEntity.ok( clientService.save( client ) );
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Client> update(
        @PathVariable final Long id,
        @RequestBody final Client client )
    {
        return ResponseEntity.ok( clientService.update( id, client ) );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Void> delete(
        @PathVariable final Long id )
    {
        clientService.delete( id );
        return ResponseEntity.ok().build();
    }
}
