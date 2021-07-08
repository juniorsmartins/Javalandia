package javalandia.aulas_udemy;

import AulasUdemy.VagaoTrem;

public class Trem 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static int totalVagoes = 0;
    
    // Atributos de Instância
    private VagaoTrem cauda;
    private VagaoTrem cabeca;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Trem (Object carga, VagaoTrem anterior, VagaoTrem posterior)
    {
        if (Trem.getTotalVagoes() == 0)
        {
            VagaoTrem novo = new VagaoTrem(carga, anterior, posterior);
            this.cauda = novo;
            this.cabeca = novo;
        }
        else
        {
            VagaoTrem novo = new VagaoTrem(carga, anterior, posterior);
            
            
        }
    }

    // Métodos de Classe
    public static void setTotalVagoes ()
    {
        Trem.totalVagoes += 1;
    }
    public static int getTotalVagoes ()
    {
        return Trem.totalVagoes;
    }
    
    // Métodos de Instância
    // Métodos Abstratos
    // Métodos Setters e Getters
}