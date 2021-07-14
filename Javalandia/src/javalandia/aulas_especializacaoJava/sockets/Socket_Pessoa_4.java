package javalandia.aulas_especializacaoJava.sockets;

import java.io.Serializable;

public final class Socket_Pessoa_4 implements Serializable
{
    private String nome;
    private int idade;
    
    Socket_Pessoa_4(){};
    Socket_Pessoa_4(String nome, int idade)
    {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome)
    {this.nome = nome;}
    public void setIdade(int idade)
    {this.idade = idade;}
    public String getNome()
    {return nome;}
    public int getIdade()
    {return idade;}
}