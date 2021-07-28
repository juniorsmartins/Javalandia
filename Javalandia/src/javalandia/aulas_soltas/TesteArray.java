package javalandia.aulas_soltas;

import java.lang.String;

public class TesteArray 
{
    public static void main(String[] args) 
    {
        TesteArray objTeste = new TesteArray();
        
        int[] arrayInicial = {25, 2, 3, 57, 38, 41};
        
        int[] resposta = objTeste.digitosMaisFrequentes(arrayInicial);
    }
    
    int[] digitosMaisFrequentes(int[] a) 
    {
        char guarda[] = {};
        for(int aa: a)
        {
            String repositorio = String.valueOf(aa);
            guarda = repositorio.toCharArray();
            for(int i = 0; i < guarda.length; i++)
            {    
                System.out.println(guarda[i]);
            }
        }

        return a;
    }
    
}