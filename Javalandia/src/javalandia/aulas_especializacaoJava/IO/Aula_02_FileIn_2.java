package javalandia.aulas_especializacaoJava.IO;

import static java.lang.System.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aula_02_FileIn_2 
{
    public static void main(String[] args) 
    {
        String[] nomeArquivo = {"d:/chapeu.txt"};
        int i;
        FileInputStream arquivo;
        
        if(nomeArquivo.length != 1)
        {
            err.println("Arquivo indefinido!");
            return;
        }
        
        try
        {
            arquivo = new FileInputStream(nomeArquivo[0]);
        }
        catch(FileNotFoundException fnfe)
        {
            err.println("Arquivo não encontrado!");
            return;
        }
        
        try
        {
            do
            {
                i = arquivo.read();
                if(i != -1)
                {
                    out.println((char) i);
                }
            }while(i != -1);
        }
        catch(IOException ioe)
        {
            err.println("Erro na leitura do arquivo!");
            return;
        }
        finally
        {
            try
            {arquivo.close();}
            catch(IOException ioee)
            {err.println("Erro no fechamento do arquivo!");}
        }
    }
}