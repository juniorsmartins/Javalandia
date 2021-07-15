package javalandia.aulas_especializacaoJava.sockets;

import java.io.Serializable;

// Modelo Cliente - Mvc
public final class Atividade03_ModeloPessoa implements Serializable
{
    // Atributos de Instância
    private String nome = "";
    private int idade = 0;
    private String mensagem = "";
    
    // Construtores
    Atividade03_ModeloPessoa(){}; // Default// Default// Default// Default
    Atividade03_ModeloPessoa(String nome, int idade) // Parametrizado
    {
        super();
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    // Métodos Setters(modificador)
    public void setNome(String nome)
    {this.nome = nome;}
    public void setIdade(int idade)
    {this.idade = idade;}
    public void setMensagem(String mensagem)
    {this.mensagem = mensagem;}

    // Métodos Getters(acesso)
    public String getNome()
    {return nome;}
    public int getIdade()
    {return idade;}
    public String getMensagem()
    {return mensagem;}
}