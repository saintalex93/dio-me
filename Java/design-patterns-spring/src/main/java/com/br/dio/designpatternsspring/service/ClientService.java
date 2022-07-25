package com.br.dio.designpatternsspring.service;

import com.br.dio.designpatternsspring.model.Client;

public interface ClientService
{

    Iterable<Client> findAll();

    Client findById(
        Long id );

    Client save(
        Client client );

    Client update(
        Long id,
        Client client );

    void delete(
        Long id );

}
