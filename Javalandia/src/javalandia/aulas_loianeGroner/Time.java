package javalandia.aulas_loianeGroner;

import javalandia.aulas_loianeGroner.ClassAbsPessoaJuridica_01;

public class Time extends ClassAbsPessoaJuridica_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalTimes;

    // Atributos de Instância

    
    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected Time()
    {
        Time.totalTimes += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters    
}