package javalandia.aulas_especializacaoJava.generics;

import static java.lang.System.out;

public class Generics_Teste_2 
{
    public static void main(String[] argumentos)
    {
        Generics_2<Integer, Integer> valores1 = new Generics_2<>(2, 3);
        int somar1 = valores1.getAtrib1() + valores1.getAtrib2();
        out.println("Soma1: " + somar1);
        
        Generics_2<Double, Double> valores2 = new Generics_2<>(2.5, 3.2);
        double somar2 = valores2.getAtrib1() + valores2.getAtrib2();
        out.println("Soma2: " + somar2);
        
        Generics_2<String, String> valores3 = new Generics_2<>("Pedro", "Alencar");
        String somar3 = valores3.getAtrib1() + " " + valores3.getAtrib2();
        out.println("Soma3: " + somar3);
        
        valores1.showType();
        valores2.showType();
        valores3.showType();
    }
}