package javalandia.aulas_especializacaoJava.lambda;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Aula_01 
{
    public static void main(String[] args) 
    {
        double n = 2.0;
        Aula_01_Interface varLambda; 
        varLambda = () -> (98.4 + 1.6) * random();
        
        out.println("Resultado: " + varLambda.metodoLambda() + "\n");
    }

}