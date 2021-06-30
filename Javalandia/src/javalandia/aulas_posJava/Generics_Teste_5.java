package javalandia.aulas_posJava;

import static java.lang.System.out;

public class Generics_Teste_5 
{
    public static void main(String[] args)
    {
        Generics_5 num = new Generics_5(6.6);
        
        out.println("Resultado: " + num.getSum());
    };
}