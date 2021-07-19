package javalandia.aulas_especializacaoJava.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.System.*;

public class Aula_02_FileIn_3 
{
    public static void main(String[] args) 
    {
        String[] nameFile = {"d:/chapeu.txt"};
        int i;
        FileInputStream file = null;
        
        // Confirmar se arquivo foi especificado
        if(nameFile.length != 1)
        {
            out.println("Arquivo indefinido!");
            return;
        }

        // O código a seguir abre um arquivo, lê caracteres até EOF    
        // ser alcançado e então fecha o arquivo via um bloco finally        
        try
        {
            file = new FileInputStream(nameFile[0]);
            
            do
            {
                i = file.read();
                if(i != -1)
                {out.println((char) i);}
            }while(i != -1);
        }
        catch(FileNotFoundException fnfe)
        {
            err.println("Erro - Arquivo não encontrado!");
            return;
        }
        catch(IOException ioe)
        {
            err.println("Erro - Leitura de arquivo!");
            return;
        }
        finally
        {
            // Fecha arquivo em todos os casos - por isso dentro do finally
            try
            {
                if(file != null)
                    file.close(); // Só fecha arquivo se não for null
            }
            catch(IOException e)
            {err.println("Erro - Fechar arquivo!");}
        }
    }
}