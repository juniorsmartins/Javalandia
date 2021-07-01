package javalandia.aulas_posJava;

public class Generics_Teste_8 
{
    public static void main(String[] args)
    {
        boolean resposta;

        Generics_8<Integer> valor1 = new Generics_8<>(10);
        Generics_8<Double> valor2 = new Generics_8<>(5.0);
        Generics_8<Float> valor3 = new Generics_8<>(10.0f);

        valor1.absEquals(valor2);
        valor1.absEquals(valor3);
    };
};