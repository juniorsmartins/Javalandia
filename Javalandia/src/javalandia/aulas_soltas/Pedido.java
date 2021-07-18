package javalandia.aulas_soltas;

import java.util.Date;

public class Pedido 
{
    // ÁREA DE ATRIBUTOS
    private int id;
    private Date data;
    private Double valorTotal;
    
    
    // ÁREA DE METODOS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}