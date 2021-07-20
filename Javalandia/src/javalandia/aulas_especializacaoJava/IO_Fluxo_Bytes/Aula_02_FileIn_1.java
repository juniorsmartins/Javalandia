package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aula_02_FileIn_1 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String[] argumento = {"d:/chapeu.txt"};
        int i;
        FileInputStream arquivo;
        
        // Primeiro verifica se um arquivo foi especificado
        if(argumento.length != 1)
        {
            System.out.println("Arquivo indefinido!");
            return;
        }
        
        try
        {
            arquivo = new FileInputStream(argumento[0]); // abre o arquivo
        }
        catch(FileNotFoundException fnfe)
        {
            System.err.println("Arquivo não encontrado!");
            return;
        }

        try
        {
            // lê bytes até o EOF ser alcançado
            do
            {
                i = arquivo.read(); // Lê o arquivo
                if(i != -1)
                    System.out.println((char) i);
            }while(i != -1); // Quando i for igual a –1, o fim do arquivo foi alcançado
        }
        catch(IOException exc)
        {System.err.println("Erros reading file!");}
        
        try
        {
            arquivo.close(); // Fecha o arquivo
        }
        catch(IOException iex)
        {System.err.println("Error closing file!");}
    }
}