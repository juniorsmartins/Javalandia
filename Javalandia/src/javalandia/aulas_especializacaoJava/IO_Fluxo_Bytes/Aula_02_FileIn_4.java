package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import static java.lang.System.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aula_02_FileIn_4 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String[] namArq = {"d:/chapeu.txt"};
        int i;
        FileInputStream fille = null;
        
        if(namArq.length != 1)
        {
            err.println("Erro - Arquivo indefinido!");
            return;
        }
        
        try
        {
            fille = new FileInputStream(namArq[0]);
            do
            {
                i = fille.read();
                if(i != -1)
                {
                    out.println((char) i);
                }
            }while(i != -1);
        }
        catch(IOException exc)
        {
            err.println("Erro - " + exc);
            return;
        }
        finally
        {
            try
            {
                if(fille != null)
                {fille.close();}
            }
            catch(IOException ioe)
            {err.println("Erro - Fechar arquivo!");}
        }
    }
}