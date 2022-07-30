package br.com.dio.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.jwt.model.User;
import br.com.dio.jwt.service.UserService;

@RestController
@RequestMapping( "/users" )
public class UserController
{
    @Autowired
    private UserService service;

    @PostMapping
    public void postUser(
        @RequestBody final User user )
    {
        service.createUser( user );
    }
}