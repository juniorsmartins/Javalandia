package javalandia.aulas_especializacaoJava.generics;

import static java.lang.System.out;

public class Generics_4<T extends Number>
{
    private T valor;
    
    Generics_4(T valor){this.valor = valor;};
    
    public void setValor(T valor){this.valor = valor;};
    public T getValor(){return valor;};
    
    public void showType()
    {
        out.println("Nome: " + valor.getClass().getName());
    };
    
    public boolean absEquals(Generics_4<?> valor)
    {
        if(Math.abs(this.valor.doubleValue()) == Math.abs(valor.valor.doubleValue())) 
        {
            return true;
        }
        return false;
    };

    @Override
    public String toString()
    {
        return "" + this.valor + "";
    }
}