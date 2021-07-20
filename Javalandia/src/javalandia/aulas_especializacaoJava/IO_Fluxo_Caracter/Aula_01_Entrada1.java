package javalandia.aulas_especializacaoJava.IO_Fluxo_Caracter;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;

// Usa um BufferedReader para ler caracteres do console.
public class Aula_01_Entrada1 
{
    public static void main(String[] args) throws IOException
    {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
        out.println("Enter characters, period to quit");
        
        do
        {
            c = (char) br.read();
            out.format("\n%s", c);
        }while(c != '.');
    }
}