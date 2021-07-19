package javalandia.aulas_soltas;

import java.util.Scanner;

public class Scanner01 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        boolean valBol;
        byte valByte;
        char valChar;
        short valShort;
        int valInt;
        long valLong;
        float valFloat;
        double valDouble;
        
        System.out.format("\nDigite boleano: ");
        valBol = in.nextBoolean();
        System.out.format("O valor boleano é: %s", valBol, "\n\n");
        
        System.out.format("\nDigite byte: ");
        valByte = in.nextByte();
        System.out.format("O valor byte é: %s", valByte, "\n\n");
        
        System.out.format("\nDigite char: ");
        valChar = in.next().charAt(0);
        System.out.format("O valor char é: %s", valChar, "\n\n");

        System.out.format("\nDigite short: ");
        valShort = in.nextShort();
        System.out.format("O valor short é: %s", valShort, "\n\n");

        System.out.format("\nDigite int: ");
        valInt = in.nextInt();
        System.out.format("O valor int é: %s", valInt, "\n\n");

        System.out.format("\nDigite long: ");
        valLong = in.nextLong();
        System.out.format("O valor long é: %s", valLong, "\n\n");

        System.out.format("\nDigite float: ");
        valFloat = in.nextFloat();
        System.out.format("O valor float é: %s", valFloat, "\n\n");

        System.out.format("\nDigite double: ");
        valDouble = in.nextDouble();
        System.out.format("O valor double é: %s", valDouble, "\n\n");
        
        in.close();
    }
}