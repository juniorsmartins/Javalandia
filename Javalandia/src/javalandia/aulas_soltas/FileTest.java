package javalandia.aulas_soltas;

import java.io.File;
import java.io.IOException;

public class FileTest 
{
    public static void main(String[] args) 
    {
        File file = new File("C:\\Users\\junio\\Desktop\\Mesa\\MJVer\\arquivo.txt");
        try
        {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}