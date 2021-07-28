package javalandia.aulas_especializacaoJava.IO_Fluxo_Caracter;

import java.io.*;

public class Aula_03_FileWriter1 
{
    public static void main(String[] args) throws IOException
    {
        String str;
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nEnter text ('stop' to quit).");
        
        try(FileWriter fw = new FileWriter("d:/javista.txt"))
        {
            do
            {
                System.out.print(": ");
                str = bufr.readLine();
                if(str.compareTo("stop") == 0) 
                    break;
                str = str + "\r\n"; 
                fw.write(str);
            }while(str.compareTo("stop") != 0);
        }
        catch(IOException ioe)
        {ioe.toString();}
    }
}