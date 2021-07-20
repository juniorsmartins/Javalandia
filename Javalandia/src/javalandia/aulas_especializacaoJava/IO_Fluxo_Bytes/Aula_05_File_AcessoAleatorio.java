package javalandia.aulas_especializacaoJava.IO_Fluxo_Bytes;

import static java.lang.System.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Aula_05_File_AcessoAleatorio 
{
    public static void main(String[] args) throws IOException
    {
        out.println("\n\bAula 05 - Arquivos de acesso aleatório!\n");
        
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        
        try(RandomAccessFile ranFile = 
                new RandomAccessFile("d:/javista.txt", "rw");)
        {
            // Grava valores no arquivo.
            for(int i = 0; i < data.length; i++)
            {ranFile.writeDouble(data[i]);}
            
            // Agora, lê valores específicos
            ranFile.seek(0); // busca o primeiro double - Usa seek( ) para configurar o ponteiro do arquivo
            d = ranFile.readDouble();
            out.printf("First value is: %s\n", d);
            
            ranFile.seek(8);
            d = ranFile.readDouble();
            out.format("Second value is: %s\n", d);
            
            ranFile.seek(8 * 3);
            d = ranFile.readDouble();
            out.println("Fourth value is: " + d);
            
            out.println("");
            
            // Agora, lê os valores alternadamente
            out.println("Here is every other value!");
            for(int i = 0; i < data.length; i+=2)
            {
                ranFile.seek(8 * i);
                d = ranFile.readDouble();
                out.println(d + " ");
            }
        }
        catch(IOException ioe)
        {err.println("Error - File Not Found!");}
    }
}