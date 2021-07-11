package javalandia.aulas_udemy;

import AulasUdemy.AulaDefaultMethods;
import javalandia.aulas_udemy.InterfaceDefaultMethods;

public class AulaDefaultMethodsMain 
{
    public static void main(String[] args) 
    {
        InterfaceDefaultMethods variavel = new AulaDefaultMethods();
        
        System.out.println(variavel.mensagem());
        
        variavel.meu_metodo();
    }
}