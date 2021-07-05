package javalandia.aulas_especializacaoJava.generics;
import static java.lang.System.out;

public class Generics_Teste_9 
{
    public static void main(String[] args)
    {
        Generics_9_A a = new Generics_9_A();
        Generics_9_B b = new Generics_9_B();
        Generics_9_C c = new Generics_9_C();
        Generics_9_D d = new Generics_9_D();
        
        Generics_9<Generics_9_A> wa = new Generics_9<>(a);
        Generics_9<Generics_9_B> wb = new Generics_9<>(b);
        Generics_9<Generics_9_C> wc = new Generics_9<>(c);
        Generics_9<Generics_9_D> wd = new Generics_9<>(d);
        
        testeParam(wa);
        testeParam(wb);
        testeParam(wc);
//      testeParam(wd); // Este parâmetro não corresponde ao limite do curinga
    }
    
    public static void testeParam(Generics_9<? extends Generics_9_A> obj)
    {out.println("Parâmetro testado ok!");};
}