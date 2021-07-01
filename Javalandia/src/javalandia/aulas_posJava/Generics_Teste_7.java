package javalandia.aulas_posJava;

import static java.lang.System.out;

public class Generics_Teste_7 
{
    public static void main(String[] args)
    {
        Generics_7<Integer, String, Double, Double> func = new Generics_7<>(2, "Alfredo", 3502.4, 1350.5);
        
        double resultadoRenda = func.calculaRenda();
        out.println("Renda: " + resultadoRenda);
    };
}