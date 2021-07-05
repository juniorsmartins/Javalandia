package javalandia.aulas_especializacaoJava.generics;

public final class Generics_2<T, V>
{
    private T atrib1;
    private V atrib2;
    
    Generics_2(T atrib1, V atrib2)
    {
        this.setAtrib1(atrib1);
        this.setAtrib2(atrib2);
    }
    
    public void setAtrib1(T atrib){atrib1 = atrib;};
    public void setAtrib2(V atrib){atrib2 = atrib;};
    public T getAtrib1(){return atrib1;};
    public V getAtrib2(){return atrib2;};
    
    public void showType()
    {
        System.out.println("Origem 1: " + atrib1.getClass().getName());
        System.out.println("Origem 2: " + atrib2.getClass().getName());
    }
}