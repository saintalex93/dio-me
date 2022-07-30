package br.com.dio.jwt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.jwt.dtos.Login;
import br.com.dio.jwt.dtos.Sessao;
import br.com.dio.jwt.model.User;
import br.com.dio.jwt.repository.UserRepository;
import br.com.dio.jwt.security.JWTCreator;
import br.com.dio.jwt.security.JWTObject;
import br.com.dio.jwt.security.SecurityConfig;

@RestController
public class LoginController
{
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private UserRepository repository;

    @PostMapping( "/login" )
    public Sessao logar(
        @RequestBody final Login login )
    {
        final User user = repository.findByUsername( login.getUsername() );
        if( user != null ) {
            final boolean passwordOk = encoder.matches( login.getPassword(), user.getPassword() );
            if( ! passwordOk ) {
                throw new RuntimeException( "Senha inválida para o login: " + login.getUsername() );
            }
            // Estamos enviando um objeto Sessão para retornar mais informações
            // do usuário
            final Sessao sessao = new Sessao();
            sessao.setLogin( user.getUsername() );

            final JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt( new Date( System.currentTimeMillis() ) );
            jwtObject.setExpiration( new Date( System.currentTimeMillis() + SecurityConfig.EXPIRATION ) );
            jwtObject.setRoles( user.getRoles() );
            sessao.setToken( JWTCreator.create( SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject ) );
            return sessao;
        } else {
            throw new RuntimeException( "Erro ao tentar fazer login" );
        }
    }
}