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
        Aula_01_Interface varLambda3;
        Aula_01_Interface varLambda4;
        Aula_01_Interface varLambda5;

        // Uso de lambda em operações matemáticas
        varLambda1 = () -> (98.4 + 1.6) * random();
        varLambda2 = () -> 2.3 + 2.2;
        
        
        
        // Impressão do valor da variável lambda
        out.println("Resultado: " + varLambda1.metodoLambda());
        out.println(varLambda2.metodoLambda());
    }

}