package javalandia.aulas_especializacaoJava.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.*;

public class Aula_03_FileOut_Binarios1 
{
    public static void main(String[] args) throws IOException
    {
        int i = 9;
        double d = 1032.65;
        boolean b = true;
        
        try(DataOutputStream diceOut = 
                new DataOutputStream(new FileOutputStream("d:/javista.txt")))
        {
            out.println("Writing: " + i);
            diceOut.writeInt(i);
            
            out.printf("Writing: %s\n", d);
            diceOut.writeDouble(d);
            
            out.format("Writing: %s", b);
            diceOut.writeBoolean(b);
            
            out.print("\nWriting: " + 12.2 * 7.4);
            diceOut.writeDouble(12.2 * 7.4);
        }
        catch(IOException ioe)
        {err.format("\nError - File Not Found!");}
        
        out.println("\n");
        
        try(DataInputStream diceIn = 
                new DataInputStream(new FileInputStream("d:/javista.txt")))
        {
            i = diceIn.readInt();
            out.println("Reading: " + i);
            
            d = diceIn.readDouble();
            out.println("Reading: " + d);
            
            b = diceIn.readBoolean();
            out.println("Reading: " + b);
        }
        catch(IOException eo)
        {err.println(eo);}
    }
}