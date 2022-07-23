package br.com.dio.model;

public class CurrentAccount
    extends
        Account
{

    public CurrentAccount(
        final Client client )
    {
        super( client );
    }

    @Override
    public void printStatment()
    {
        System.out.println( "=== Extrato Conta Corrente ===" );
        super.printCommonInfo();
    }

}
