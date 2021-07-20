package javalandia.aulas_udemy;

public class AulaThreads2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        PessoaFisica cliente = new PessoaFisica("Roberta Zanini");
        ContaCorrente conta1 = new ContaCorrente(100);
        
        FazDeposito acao = new FazDeposito(conta1);
        Thread th1 = new Thread(acao);
        Thread th2 = new Thread(acao);
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println(conta1.getSaldoConta());
    }
}