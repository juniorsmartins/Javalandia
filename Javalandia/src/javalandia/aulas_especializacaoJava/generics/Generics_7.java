package javalandia.aulas_especializacaoJava.generics;

public final class Generics_7<K extends Number, T, V extends Number, E extends V> 
{
    private K id;
    private T nome;
    private V salario;
    private E comissao;
    private double renda;
    
    public Generics_7(K id, T nome, V salario, E comissao)
    {
        this.setId(id);
        this.setNome(nome);
        this.setSalario(salario);
        this.setComissao(comissao);
    };
    
    public T getNome(){return nome;};
    public V getSalario(){return salario;};
    public E getComissao(){return comissao;};
    public void setId(K id){this.id = id;};
    public void setNome(T nome){this.nome = nome;};
    public void setSalario(V salario){this.salario = salario;};
    public void setComissao(E comissao){this.comissao = comissao;};
    
    public double calculaRenda()
    {
        double calculaRenda = getSalario().doubleValue() + getComissao().doubleValue();
        return calculaRenda;
    };
}