package javalandia.aulas_especializacaoJava.IO_Fluxo_Caracter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Aula_04_FileReader1 
{
    public static void main(String[] args) throws IOException 
    {
        String str;
        
        // Cria e usa um FileReader encapsulado em um BufferedReader.
        try(BufferedReader buffr = new BufferedReader(new FileReader("d:/javista.txt")))
        {
            while((str = buffr.readLine()) != null)
            {
                System.out.println(str);
            }
        }
        catch(IOException ie)
        {ie.toString();}
    }
}