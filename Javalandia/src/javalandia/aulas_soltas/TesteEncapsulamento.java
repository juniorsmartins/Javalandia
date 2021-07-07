package javalandia.aulas_soltas;

public class TesteEncapsulamento 
{
    private String nome = "Mario";
    protected String sobre = "Silva";
    
    public String getNome()
    {
        return this.nome;
    }
    protected String getSobre()
    {
        return this.sobre;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    protected void setSobre(String sobre)
    {
        this.sobre = sobre;
    }
}