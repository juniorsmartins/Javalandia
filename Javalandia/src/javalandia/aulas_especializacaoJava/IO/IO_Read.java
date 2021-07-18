package javalandia.aulas_especializacaoJava.IO;

import java.io.IOException;

public class IO_Read 
{
    public static void main(String[] args) throws IOException
    {
        byte data[] = new byte[15];
        System.out.println("Enter some characters.");    
        System.in.read(data);
        System.out.print("You entered: "); 
        for(int i=0; i < data.length; i++)
            System.out.println((char) data[i]);
    }
}