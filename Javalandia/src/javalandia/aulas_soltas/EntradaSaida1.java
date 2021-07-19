package javalandia.aulas_soltas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaSaida1 
{
    public static void main(String[] args) 
    {
        System.out.println("Entre com um valor: ");
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";

        try
        {
                s = cd.readLine();
        }
        catch(IOException e)
        {
                System.out.println("Erro de entrada");
        }

        System.out.println("O valor de entradada foi: " + s);
    }
}