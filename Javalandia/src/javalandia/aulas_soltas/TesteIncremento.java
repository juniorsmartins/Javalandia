package javalandia.aulas_soltas;

public class TesteIncremento 
{
    public static void main(String[] args) 
    {
        int a = 1;
        int b = 1;
        a = a + b++;
        System.out.format("\nA: %s  -----  B: %s\n\n", a, b);
        double x = (double)9/2;
        System.out.println("X: " + x);
        double z = 9;
        double p = 2;
        double m = z/p;
        System.out.println("M: " + m);
    }
}