package javalandia.aulas_especializacaoJava.IO_Fluxo_Caracter;

import java.io.PrintWriter;

public class Aula_02_PrintWriter 
{
    public static void main(String[] args) 
    {
        PrintWriter pw = new PrintWriter(System.out, true);
        
        int i = 11;
        double d = 23.3;
        
        pw.println("Frase");
        pw.println(i);
        pw.println(d);
        
        pw.println("Uau " + i + " "+ d + " " + (i + d));
    }
}