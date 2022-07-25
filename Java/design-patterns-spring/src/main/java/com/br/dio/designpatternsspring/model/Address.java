package com.br.dio.designpatternsspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Address
{

    @Id
    @JsonProperty( "cep" )
    private String zipCode;
    @JsonProperty( "logradouro" )
    private String street;
    @JsonProperty( "bairro" )
    private String district;
    @JsonProperty( "localidade" )
    private String city;
    @JsonProperty( "uf" )
    private String state;

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(
        final String cep )
    {
        this.zipCode = cep;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(
        final String logradouro )
    {
        this.street = logradouro;
    }

    public String getDistrict()
    {
        return district;
    }

    public void setDistrict(
        final String bairro )
    {
        this.district = bairro;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(
        final String localidade )
    {
        this.city = localidade;
    }

    public String getState()
    {
        return state;
    }

    public void setState(
        final String uf )
    {
        this.state = uf;
    }

}
