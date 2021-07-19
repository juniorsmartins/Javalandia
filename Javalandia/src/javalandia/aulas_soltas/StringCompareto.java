package javalandia.aulas_soltas;

public class StringCompareto 
{
    public static void main(String[] args)
    {
        String a1 = "Olá, ";
        String a2 = "Mundo!";
        String a3 = "Olá, ";
        String a4 = "MUNDO!";
        
        System.out.println("a1 é igual a a2? " + a1.compareTo(a2));
        System.out.println("a1 é igual a a3? " + a1.compareTo(a3));
        System.out.println("a2 é igual a a4? " + a2.compareTo(a4));
        System.out.println("a2 é igual a a4? " + a2.compareToIgnoreCase(a4));
        System.out.println("a1 é igual a a3? " + a1.equals(a3));
        System.out.println("a2 é igual a a4? " + a2.equalsIgnoreCase(a4));
    }
}