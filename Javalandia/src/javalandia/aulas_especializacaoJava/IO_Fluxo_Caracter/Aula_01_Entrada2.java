package javalandia.aulas_especializacaoJava.IO_Fluxo_Caracter;

import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Lê um string no console usando um BufferedReader
public class Aula_01_Entrada2 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader repos = new BufferedReader(new InputStreamReader(in));
        
        String str;
        
        out.println("Enter lines of text!");
        out.println("Enter 'stop' to quit!\n");
        
        do
        {
            str = repos.readLine(); // Usa o método readLine( ) de BufferedReade para ler uma linha de texto
            out.format("Digitado: %s\n\n", str);
        }while(!str.equalsIgnoreCase("stop"));
    }
}