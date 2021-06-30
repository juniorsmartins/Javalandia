package javalandia.aulas_posJava;

import static java.lang.System.out;

public class Generics_Teste_1 
{
    public static void main(String[] argumentos)
    {
        Generics_1<Integer> num1 = new Generics_1<>(3);
        int soma1 = num1.getAtributo() + 2;
        out.println("Soma1: " + soma1);
        
        Generics_1<Double> num2 = new Generics_1<>(3.5);
        double soma2 = num2.getAtributo() + 1.6;
        out.println("Soma2: " + soma2);
        
        Generics_1<String> num3 = new Generics_1<>("Paulo");
        String soma3 = num3.getAtributo() + " " + "Cesar";
        out.println("Soma3: " + soma3);
    };
}