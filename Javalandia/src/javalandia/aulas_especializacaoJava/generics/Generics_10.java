package javalandia.aulas_especializacaoJava.generics;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Generics_10 
{
    public static void main(String[] args) 
    {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        
        int total = 0;
        for(Integer i: lista)
        {
            total += i;
        }
        
        out.println("Resultado: " + total);
    };
// sem uso do Generics
//    public static void main(String[] args)
//    {
//        List lista = new ArrayList();
//        lista.add(1);
//        lista.add(2);
//        lista.add(3);
//        
//        int total = 0;
//        for(int i = 0; i < lista.size(); i++)
//        {
//            total += (int) lista.get(i);
//        }
//        
//        out.println("Resultado: " + total);
//    };
};