package javalandia.aulas_soltas;

public abstract class Produto2 
{
    // ÁREA DE ATRIBUTOS DE CLASSE
    public static int idClasse;
    
    // ÁREA DE ATRIBUTOS DE INSTÂNCIA
    private int id;
    private String codigoBarras;
    private String titulo;
    private Double valorVenda;


    // ÁREA DE MÉTODOS DE CLASSE
    public static int getIdClasse() {
        return idClasse;
    }
    public static void setIdClasse() {
        Produto2.idClasse += 1;
    }

    // ÁREA DE METODOS DE INSTÂNCIA
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Produto2.getIdClasse();
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}