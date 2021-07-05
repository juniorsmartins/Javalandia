package javalandia.aulas_especializacaoJava.generics;

import static java.lang.System.out;

public class Generics_Teste_6 
{
    public static void main(String[] args)
    {
        Integer x[] = {1, 2, 3};
        
        Generics_6_1<Integer> ob = new Generics_6_1<Integer>(x);
        
        if(ob.contains(2))
        {
            out.println("2 está em ob");
        }
        else
        {
            out.println("2 não está em ob");
        }
        
        if(ob.contains(5))
            out.println("5 está em ob");
        else
            out.println("5 não está em ob");
    };
};