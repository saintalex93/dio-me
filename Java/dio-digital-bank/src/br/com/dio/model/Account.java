package br.com.dio.model;

public abstract class Account
    implements
        AccountInterface
{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCE = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(
        final Client client )
    {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCE++;
        this.client = client;
    }

    @Override
    public void withDraw(
        final double value )
    {
        balance -= value;
    }

    @Override
    public void deposit(
        final double value )
    {
        balance += value;
    }

    @Override
    public void shifting(
        final double value,
        final AccountInterface destinyAccount )
    {
        this.withDraw( value );
        destinyAccount.deposit( value );
    }

    public int getAgency()
    {
        return agency;
    }

    public int getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    protected void printCommonInfo()
    {
        System.out.println( String.format( "Titular: %s", this.client.getNome() ) );
        System.out.println( String.format( "Agencia: %d", this.agency ) );
        System.out.println( String.format( "Numero: %d", this.number ) );
        System.out.println( String.format( "Saldo: %.2f", this.balance ) );
    }
}
