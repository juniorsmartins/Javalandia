package javalandia.aulas_udemy;

public class TiposPrimitivosII 
{
    public static void main(String[] args) 
    {
        char letra = 'A';
        String palavra = "palavra";
        boolean valor;
        
        System.out.println("Char A: " + Character.SIZE + " bits");
        System.out.println("String " + palavra + ": " + (Character.SIZE * palavra.length()) + " bits");
        
    }
}
