package javalandia.aulas_udemy;

import java.util.LinkedList;
import java.util.List;

public class ClassFila 
{
    private List<String> nomes = new LinkedList<String>();
    
    public void adiciona(String nome) 
    {
        this.nomes.add(nome);
    }
    
    public String remove()
    {
        try
        {
            return nomes.remove(0);            
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("A fila já está vazia!");
            return "";
        }
    }
    
    public boolean vazia()
    {
        return this.nomes.isEmpty();            

    }
    
    @Override
    public String toString()
    {
        return this.nomes.toString();
    }
    
}