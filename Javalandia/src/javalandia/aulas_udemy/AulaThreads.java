package javalandia.aulas_udemy;

import AulasUdemy.BarraDeProgresso;
import javalandia.aulas_udemy.GeraRelatorio;

public class AulaThreads 
{
    public static void main(String[] args) 
    {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread tread1 = new Thread(barra);
        tread1.start();
        
        GeraRelatorio relatorio = new GeraRelatorio();
        Thread tread2 = new Thread(relatorio);
        tread2.start();
        
    }
}