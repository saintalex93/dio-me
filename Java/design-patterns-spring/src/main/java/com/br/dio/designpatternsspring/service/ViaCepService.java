package com.br.dio.designpatternsspring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.dio.designpatternsspring.model.Address;

@FeignClient( name = "viacep", url = "https://viacep.com.br/ws" )
public interface ViaCepService
{

    @GetMapping( "/{zipCode}/json/" )
    Address findByZipCode(
        @PathVariable( "zipCode" ) String zipCode );
}
