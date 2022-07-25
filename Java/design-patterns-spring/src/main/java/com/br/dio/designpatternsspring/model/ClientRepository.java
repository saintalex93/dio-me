package com.br.dio.designpatternsspring.model;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository
    extends
        CrudRepository<Client,Long>
{

    @Override
    ArrayList<Client> findAll();

}