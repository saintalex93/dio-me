package br.com.dio.jwt.dtos;

public class Sessao
{
    private String login;
    private String token;

    public String getLogin()
    {
        return login;
    }

    public void setLogin(
        final String login )
    {
        this.login = login;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(
        final String token )
    {
        this.token = token;
    }
}