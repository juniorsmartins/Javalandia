package javalandia.aulas_soltas;

public class PedidoItem 
{
    // ÁREA DE ATRIBUTOS
    private int id;
    private Double quantidade;
    private Double valorVenda;
    private Double valorTotal;
    
    
    // ÁREA DE MÉTODOS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}