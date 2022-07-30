package br.com.dio.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.dio.jwt.model.User;
import br.com.dio.jwt.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    public void createUser(
        final User user )
    {
        final String pass = user.getPassword();
        // criptografando antes de salvar no banco
        user.setPassword( encoder.encode( pass ) );
        repository.save( user );
    }
}