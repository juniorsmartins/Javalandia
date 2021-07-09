package javalandia.aulas_udemy;

public class GeraRelatorio implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            System.out.println("Gerar Relatório");
        }        
    }
}