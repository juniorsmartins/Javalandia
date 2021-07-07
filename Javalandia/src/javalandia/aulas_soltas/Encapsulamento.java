package javalandia.aulas_soltas;

import javalandia.aulas_soltas.TesteEncapsulamento;

public class Encapsulamento extends TesteEncapsulamento
{
    private String nomeCompleto;
    
    public String getNomeCompleto()
    {
        return this.nomeCompleto = this.getNome() + " " + this.getSobre();
    }
}