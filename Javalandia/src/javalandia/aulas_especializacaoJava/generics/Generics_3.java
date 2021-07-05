package javalandia.aulas_especializacaoJava.generics;

import static java.lang.System.out;

public class Generics_3<T extends Number>
{
    private T valor;
    
    Generics_3(T val){valor = val;};
    
    public void setValor(T val){valor = val;};
    public T getValor(){return valor;};
    
    public void showType()
    {
        out.println("Nome: " + getValor().getClass().getName() + "\n");
    }
}