package javalandia.aulas_especializacaoJava.sockets;

import java.io.Serializable;

public final class Socket_Pessoa_4 implements Serializable
{
    private String nome;
    private Integer idade;
    
    Socket_Pessoa_4(){};
    Socket_Pessoa_4(String nome, Integer idade)
    {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome)
    {this.nome = nome;}
    public void setIdade(Integer idade)
    {this.idade = idade;}
    public String getNome()
    {return nome;}
    public Integer getIdade()
    {return idade;}
}