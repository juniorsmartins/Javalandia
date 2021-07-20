package javalandia.aulas_especializacaoJava.IO;

import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.System.*;

public class Aula_04_File_Comparacao 
{
    public static void main(String[] args) 
    {
        int i = 0, j = 0;
        
        String[] nameFiles = {"d:/javista.txt", "d:/chapeu.txt"};
        
        if(nameFiles.length != 2)
        {out.println("File Not Found!");}
        else
        {
            try(FileInputStream file1 = new FileInputStream(nameFiles[0]);
                    FileInputStream file2 = new FileInputStream(nameFiles[1]))
            {
                do
                {
                    i = file1.read();
                    j = file2.read();
                    if(i != j)
                        break;
                }while(i != -1 && j != -1);

                if(i != j)
                {out.format("Files differ!\n");}
                else
                {out.println("Files are the same!");}
            }
            catch(IOException ioe)
            {err.printf("Error - %s\n", ioe);}
        }
        
    }
}