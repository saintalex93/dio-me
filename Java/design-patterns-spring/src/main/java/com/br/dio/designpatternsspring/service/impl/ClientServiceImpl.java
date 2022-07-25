package com.br.dio.designpatternsspring.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dio.designpatternsspring.model.Address;
import com.br.dio.designpatternsspring.model.AddressRepository;
import com.br.dio.designpatternsspring.model.Client;
import com.br.dio.designpatternsspring.model.ClientRepository;
import com.br.dio.designpatternsspring.service.ClientService;
import com.br.dio.designpatternsspring.service.ViaCepService;

@Service
public class ClientServiceImpl
    implements
        ClientService
{

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public ArrayList<Client> findAll()
    {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(
        final Long id )
    {
        final Optional<Client> cliente = clientRepository.findById( id );
        return cliente.get();
    }

    @Override
    public Client save(
        final Client client )
    {
        return saveClient( client );
    }

    @Override
    public Client update(
        final Long id,
        final Client client )
    {
        return Optional.of( clientRepository.findById( id ) ).orElse( null ).get();
    }

    @Override
    public void delete(
        final Long id )
    {
        clientRepository.deleteById( id );
    }

    private Client saveClient(
        final Client client )
    {
        final String zipCode = client.getAddress().getZipCode();
        final Address address = addressRepository.findById( zipCode ).orElseGet( () -> {
            final Address newAddress = viaCepService.findByZipCode( zipCode );
            addressRepository.save( newAddress );
            return newAddress;
        } );
        client.setAddress( address );
        return clientRepository.save( client );
    }

}
