package javalandia.aulas_posJava;

import static java.lang.System.out;

public final class Generics_1<T>
{
    private T atributo;
    
    Generics_1(T atributo)
    {
        setAtributo(atributo);
    }
    
    public void setAtributo(T atributo){this.atributo = atributo;};
    public T getAtributo(){return atributo;};
    
    public void showType()
    {
        out.println("Origem: " + atributo.getClass().getName());
    }
}