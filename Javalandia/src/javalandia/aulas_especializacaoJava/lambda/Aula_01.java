package javalandia.aulas_especializacaoJava.lambda;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Aula_01 
{
    public static void main(String[] args) 
    {
        double n = 2.0;

        // Declaração de variável lambda
        Aula_01_Interface varLambda1;
        Aula_01_Interface varLambda2;
        Aula_01_Interface2 varLambda3;
        Aula_01_Interface varLambda4;
        
        // Uso de lambda em operações matemáticas
        varLambda1 = (v) -> (1 + v) * random();
        varLambda2 = (v) -> 2.3 + 2.2 + v;
        varLambda3 = () -> 2 + 2;
        varLambda4 = (z) -> z + z + 2;
        
        // Lambdas  
        Aula_01_Interface3 varLambda5 = (val1, val2) -> (2 + val1 % val2) == 3;
        
        // Impressão do valor da variável lambda
        out.println("Resultado: " + varLambda1.metodoLambda(10));
        out.println(varLambda2.metodoLambda(100));
        out.println(varLambda3.mLamb());
        out.println(varLambda4.metodoLambda(4));
        out.println(varLambda5.teste(5, 2));
    }
}