package javalandia.aulas_especializacaoJava.generics;

import static java.lang.System.out;

public class Generics_Teste_4 
{
    public static void main(String[] args)
    {
        Generics_4<Integer> num1 = new Generics_4<>(2);
        Generics_4<Double> num2 = new Generics_4<>(4.5);
        Generics_4<Long> num3 = new Generics_4<>(-2L);
        Generics_4 num4 = new Generics_4(4); // Type Bruto

        if(num1.absEquals(num2))
        {
            out.println("\n" + num1 + " é igual a " + num2);
        }
        else 
        {
            out.println("\n" + num1 + " não é igual a " + num2);
        }
        
        if(num1.absEquals(num3))
        {
            out.println("\n" + num1 + " é igual a " + num3);
        }
        else
        {
            out.println("\n" + num1 + " não é igual a" + num3);
        }
    }
}