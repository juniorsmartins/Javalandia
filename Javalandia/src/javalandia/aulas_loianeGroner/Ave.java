package javalandia.aulas_loianeGroner;

import javalandia.aulas_loianeGroner.Animal;

public abstract class Ave extends Animal
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // Constantes
    // Atributos de Classe
    private static int totalAves;
    
    // Atributos de Instância

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Ave()
    {
        Ave.setTotalAves();
    }
    
    // Métodos Especiais de Classe
    private static void setTotalAves()
    {
        Ave.totalAves += 1;        
    }
    public static int getTotalAves()
    {
        return Ave.totalAves;
    }
    
    // Métodos Especiais de Instância
    public abstract void voar();
    
    // Métodos Setters e Getters
}
