package br.com.dio.model;
import java.util.List;

public class Bank
{

    private String name;
    private List<Account> account;

    public String getNome()
    {
        return name;
    }

    public void setNome(
        final String nome )
    {
        this.name = nome;
    }

    public List<Account> getAccounts()
    {
        return account;
    }

    public void setAccounts(
        final List<Account> account )
    {
        this.account = account;
    }

}
