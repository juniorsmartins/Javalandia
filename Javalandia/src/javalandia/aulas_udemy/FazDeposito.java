package javalandia.aulas_udemy;

import javalandia.aulas_udemy.ContaCorrente;

public class FazDeposito implements Runnable
{
    private ContaCorrente conta;
    
    public FazDeposito(ContaCorrente conta)
    {
        this.conta = conta;
    }
    
    @Override
    public void run()
    {
        this.conta.depositar(55);
    }
}