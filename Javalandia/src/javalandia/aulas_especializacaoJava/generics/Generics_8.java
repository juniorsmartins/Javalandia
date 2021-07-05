package javalandia.aulas_especializacaoJava.generics;

import static java.lang.Math.abs;
import static java.lang.System.out;

public final class Generics_8<T extends Number> 
{
    private T numero;
    
    public Generics_8(T numero)
    {
        setNumero(numero);
    };
    
    public void setNumero(T numero){this.numero = numero;};
    public T getNumero(){return numero;};
    
    public void absEquals(Generics_8<?> num)
    {
        if(abs(getNumero().doubleValue()) == abs(num.getNumero().doubleValue()))
        {out.println("Resultado verdadeiro!");}
        else
        {out.println("Resultado falso!");}
    };
}