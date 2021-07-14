package javalandia.aulas_especializacaoJava.sockets;

// Modelo Cliente - Mvc
public final class Atividade03_Cliente 
{
    // Atributos de Instância
    private String nome;
    private int idade;
    
    // Construtores
    Atividade03_Cliente(){}; // Default
    Atividade03_Cliente(String nome, int idade) // Parametrizado
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

    // Métodos Getters(acesso)
    public String getNome()
    {return nome;}
    public int getIdade()
    {return idade;}
}