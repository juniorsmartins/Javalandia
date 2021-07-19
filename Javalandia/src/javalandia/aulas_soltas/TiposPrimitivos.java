package javalandia.aulas_soltas;

public class TiposPrimitivos 
{
    public static void main(String[] args) 
    {
        int a = 130;
        byte b = 2;
        char c = 'A';
        System.out.println(a + b + c); // transformou 'A' em 65
        System.out.println(a + " " + b + " " + c);
        
        String str1 = "Olá,";
        String str2 = "Junior";
        String str3 = str1 + " " + str2;
        
        System.out.println("Bem-vindo! " + str3 + ".");
        System.out.println("tamanho 1: " + str1.length());
        System.out.println("tamanho 3: " + str3.length());
        System.out.println("Substring: " + str3.substring(0, (str3.length() - 4)));
        System.out.println("Substring: " + str3.substring(0, 7));
        System.out.println("Maiúsculas: " + str3.toUpperCase());                
    }
}