package javalandia.aulas_especializacaoJava.lambda;

@FunctionalInterface
public interface Aula_01_Interface4 
{
    void sei_la();
    
    default void sei_aqui()
    {System.out.println("Teste");};
}