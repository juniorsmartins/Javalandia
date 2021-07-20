package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import static java.lang.System.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aula_02_FileOut 
{
    public static void main(String[] args) 
    {
        String[] namesFiles = {"d:/javista.txt", "d:/chapeu.txt"};
        
        int i;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        
        if(namesFiles.length != 2)
        {
            err.format("Erro - Arquivos não encontrados!");
            return;
        }
        
        try
        {
            fileIn = new FileInputStream(namesFiles[0]);
            fileOut = new FileOutputStream(namesFiles[1]);
            
            do
            {
                i = fileIn.read();
                if(i != -1)
                {
                    fileOut.write(i);
                }
            }while(i != -1);
        }
        catch(IOException ioe)
        {
            err.format("Exceção: %s", ioe);
        }
        finally
        {
            try
            {
                if(fileIn != null)
                {fileIn.close();}
                if(fileOut != null)
                {fileOut.close();}
            }
            catch(IOException io)
            {err.format("Erro - Fechamento de arquivo!");}
        }
    }
}