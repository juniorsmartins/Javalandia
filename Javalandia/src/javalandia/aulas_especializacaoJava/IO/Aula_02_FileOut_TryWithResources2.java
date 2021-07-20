package javalandia.aulas_especializacaoJava.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.*;

public class Aula_02_FileOut_TryWithResources2 
{
    public static void main(String[] args) 
    {
        int i;
        String[] nomeArq = {"d:/javista.txt", "d:/chapeu.txt"};
        
        if(nomeArq.length != 2)
        {out.format("Pendência de arquivo!\n");}
        else
        {
            try(FileInputStream filin = new FileInputStream(nomeArq[0]); 
                    FileOutputStream filout = new FileOutputStream(nomeArq[1]);)
            {
                do
                {
                    i = filin.read();
                    if(i != -1)
                    {
                        out.write((char) i);
                        filout.write(i);
                    }
                }while(i != -1);
            }
            catch(IOException ioe)
            {err.format("Erro - Arquivo não encontrado!");}
        }
    }
}