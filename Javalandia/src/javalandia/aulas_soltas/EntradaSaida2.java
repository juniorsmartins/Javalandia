package javalandia.aulas_soltas;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class EntradaSaida2 
{
    public static void main(String[] args)
    {
        System.out.print("\nDigite valor 1: ");
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nDigite valor 2: ");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\nValor 1: " + a);
        System.out.println("Valor 2: " + b);
        
        
    }
    public static void menuAritmetico()
    {
        System.out.println("************************************");
        System.out.println("*****     Somar (a + b) - 1    *****");
        System.out.println("*****   Subtrair (a - b) - 2   *****");
        System.out.println("***** Multiplicar (a * b) - 3  *****");
        System.out.println("*****    Dividir (a / b) - 4   *****");
        System.out.println("************************************");
        System.out.print("*****  Digite a escolha: ");
        BufferedReader opcaoMenu = new BufferedReader(new InputStreamReader(System.in));
    }
}