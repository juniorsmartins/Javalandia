package javalandia.aulas_soltas;

import TreinoMJV.model.Produto;

public final class Cd extends Produto
{
    // ÁREA DE ATRIBUTOS
    private int faixas;

    
    // ÁREA DE CONSTRUTORES
    public Cd(String codigo, String titulo, Double valor, int faixas)
    {
        Produto.setIdClasse();
        this.setId();
        this.setCodigoBarras(codigo);
        this.setTitulo(titulo);
        this.setValorVenda(valor);
        this.setFaixas(faixas);        
    }
    
    
    // ÁREA DE MÉTODOS
    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
    public int getFaixas() {
        return faixas;
    }    
}