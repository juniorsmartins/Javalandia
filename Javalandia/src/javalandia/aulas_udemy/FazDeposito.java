package javalandia.aulas_udemy;

import javalandia.aulas_udemy.Conta;

public class FazDeposito implements Runnable
{
    private Conta conta;
    
    public FazDeposito(Conta conta)
    {
        this.conta = conta;
    }
    
    @Override
    public void run()
    {
        this.conta.depositar(55);
    }
}