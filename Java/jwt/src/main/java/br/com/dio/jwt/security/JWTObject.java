package br.com.dio.jwt.security;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JWTObject
{
    private String subject; // nome do usuario
    private Date issuedAt; // data de cria��o do token
    private Date expiration; // data de expira��o do token
    private List<String> roles; // perfis de acesso

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(
        final String subject )
    {
        this.subject = subject;
    }

    public Date getIssuedAt()
    {
        return issuedAt;
    }

    public void setIssuedAt(
        final Date issuedAt )
    {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(
        final Date expiration )
    {
        this.expiration = expiration;
    }

    public List<String> getRoles()
    {
        return roles;
    }

    public void setRoles(
        final List<String> roles )
    {
        this.roles = roles;
    }

    public void setRoles(
        final String... roles )
    {
        this.roles = Arrays.asList( roles );
    }
}