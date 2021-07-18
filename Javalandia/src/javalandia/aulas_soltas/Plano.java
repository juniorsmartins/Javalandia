package javalandia.aulas_soltas;

public final class Plano 
{
    // Atributo de Instância
    private String plano;
    private String beneficios;
    private double valor;
    
    // Métodos Construtores
    public Plano(){}
    public Plano(String plano, String beneficios, double valor)
    {
        this.setPlano(plano);
        this.setBeneficios(beneficios);
        this.setValor(valor);
    }

    // Métodos Getters
    public String getPlano()
    {
        return this.plano;
    }
    public String getBeneficios()
    {
        return this.beneficios;
    }
    public double getValor()
    {
        return this.valor;
    }
    
    // Métodos Setters
    public void setPlano(String plano)
    {
        this.plano = plano;
    }
    public void setBeneficios(String beneficios)
    {
        this.beneficios = beneficios;
    }
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    // Métodos em  Sobreescrição
    @Override
    public String toString()
    {
        return ("Plano: " + this.getPlano() + "\nBenefícios: " + this.getBeneficios() + "\nValor: " + this.getValor());
    }
    
}