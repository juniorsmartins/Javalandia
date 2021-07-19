package javalandia.aulas_soltas;

import java.io.IOException;

public class IO_Read2 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("teste de read\n");
        byte[] bau = new byte[8];
        System.in.read(bau);
        for(int i = 0; i < bau.length; i++)
            System.out.println((char) bau[i]);

    }
}