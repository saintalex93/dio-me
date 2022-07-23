package br.com.dio.model;

public interface AccountInterface
{

    void withDraw(
        double value );

    void deposit(
        double value );

    void shifting(
        double value,
        AccountInterface destinyAccount );

    void printStatment();
}
