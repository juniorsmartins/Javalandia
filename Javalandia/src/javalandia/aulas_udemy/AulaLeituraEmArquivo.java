package javalandia.aulas_udemy;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AulaLeituraEmArquivo 
{
    // Programa para ler arquivo de texto
    public static void main(String[] args) 
    {
        try
        {
            Scanner ler = new Scanner(new FileInputStream("saida.txt"));
            
            while (ler.hasNextLine())
            {
                String linha = ler.nextLine();
                System.out.println(linha);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
