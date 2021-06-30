package javalandia.aulas_posJava;

public class Generics_5 
{
    private int sum;
    
    <T extends Number> Generics_5(T arg)
    {
        sum = 0;
        for(int i=0; i <= arg.intValue(); i++)
        {
            sum += i;
        }
    };
    
    public int getSum()
    {return sum;};
}