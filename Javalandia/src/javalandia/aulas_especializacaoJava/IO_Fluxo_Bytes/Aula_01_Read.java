package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import static java.lang.System.*;
import java.io.IOException;

public class Aula_01_Read 
{
    public static void main(String[] args) throws IOException 
    {
        byte[] data = new byte[10];
        
        out.println("Olá, Mundo! Entre com caracteres: ");
        int valor = System.in.read(data);
        
        for(int i = 0; i < valor; i++)
        {
            out.println((char) data[i]);
        }
    }
}