package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.System.*;

public class Aula_02_FileOut_TryWithResources1 
{
    public static void main(String[] args) 
    {
        int i;
        String[] fileName = {"d:/javista.txt"};
        
        if(fileName.length != 1)
        {
            out.println("Nome de arquivo indefinido!\n");
        }
        else
        {
            // Bloco try-with-resources
            try(FileInputStream fileIn = new FileInputStream(fileName[0]))
            {
                do
                {
                    i = fileIn.read();
                    if(i != -1)
                    {
                        out.format("%s", (char)i);
                    }
                }while(i != -1);
                out.printf("\n");
            }
            catch(IOException ioe)
            {err.format("Erro - Arquivo não encontrado!\n");}
        }
        
    }
}