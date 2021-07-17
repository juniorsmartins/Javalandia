package javalandia.aulas_especializacaoJava.lambda;

import static java.lang.System.out;

public class Aula_02 
{
    public static void main(String[] args) 
    {

        Aula_02_Inter1<Integer> lambda1 = (n, m) -> (n % m) == 0;
        out.println(lambda1.teste(12, 2));
        
        Aula_02_Inter1<Double> lambda2 = (n, m) -> (n % m) == 0;
        out.println(lambda2.teste(12.9, 1.1));
        
        Aula_02_Inter1<String> lambda3 = (n, m) -> n.indexOf(m) != -1;
        out.println("O segundo está dentro do primeiro: " + 
                lambda3.teste("Abracadabra", "cad"));
        
    }
}