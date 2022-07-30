package br.com.dio.jwt.security;

import java.security.SignatureException;
import java.util.List;
import java.util.stream.Collectors;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;

public class JWTCreator
{
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(
        final String prefix,
        final String key,
        final JWTObject jwtObject )
    {
        final String token = Jwts.builder().setSubject( jwtObject.getSubject() ).setIssuedAt( jwtObject.getIssuedAt() ).setExpiration(
            jwtObject.getExpiration() )
            .claim( ROLES_AUTHORITIES, checkRoles( jwtObject.getRoles() ) ).signWith( SignatureAlgorithm.HS512, key ).compact();
        return prefix + " " + token;
    }

    public static JWTObject create(
        String token,
        final String prefix,
        final String key )
        throws UnsupportedJwtException,
            MalformedJwtException,
            SignatureException
    {
        final JWTObject object = new JWTObject();
        token = token.replace( prefix, "" );
        final Claims claims = Jwts.parser().setSigningKey( key ).parseClaimsJws( token ).getBody();
        object.setSubject( claims.getSubject() );
        object.setExpiration( claims.getExpiration() );
        object.setIssuedAt( claims.getIssuedAt() );
        object.setRoles( (List) claims.get( ROLES_AUTHORITIES ) );
        return object;

    }

    private static List<String> checkRoles(
        final List<String> roles )
    {
        return roles.stream().map( s -> "ROLE_".concat( s.replaceAll( "ROLE_", "" ) ) ).collect( Collectors.toList() );
    }

}