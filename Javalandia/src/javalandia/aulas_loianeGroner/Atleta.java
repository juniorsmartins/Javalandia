package javalandia.aulas_loianeGroner;

import AulasLoianeGroner.ClassAbsPessoaFisica_01;

public class Atleta extends ClassAbsPessoaFisica_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalAtletas;

    // Atributos de Instância

    
    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected Atleta()
    {
        Atleta.totalAtletas += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters    
}
