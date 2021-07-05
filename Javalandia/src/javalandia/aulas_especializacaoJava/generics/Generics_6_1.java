package javalandia.aulas_especializacaoJava.generics;

public class Generics_6_1<T> implements Generics_6<T> 
{
    T[] arrayT;

    Generics_6_1(T[] o)
    {
      arrayT = o;  
    };

    @Override
    public boolean contains(T o)
    {
        for(T x: arrayT)
        {
            if(x.equals(o))
            {return true;}
        }
      return false;  
    };
};