package javalandia.aulas_soltas;

public final class Livro extends Produto2
{
    // ÁREA DE ATRIBUTOS
    private int paginas;
    
    
    // ÁREA DE CONSTRUTORES
    public Livro(String codigo, String titulo, Double valor, int paginas)
    {
        Produto2.setIdClasse();
        this.setId();
        this.setCodigoBarras(codigo);
        this.setTitulo(titulo);
        this.setValorVenda(valor);
        this.setPaginas(paginas);
    }

    
    // ÁREA DE MÉTODOS
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}