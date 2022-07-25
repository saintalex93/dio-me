package br.com.dio.model;
public class SavingAccount
    extends
        Account
{

    public SavingAccount(
        final Client cliente )
    {
        super( cliente );
    }

    @Override
    public void printStatment()
    {
        System.out.println( "=== Extrato Conta Poupança ===" );
        super.printCommonInfo();
    }
}
