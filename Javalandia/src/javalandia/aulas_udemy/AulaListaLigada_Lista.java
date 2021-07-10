package javalandia.aulas_udemy;

public class AulaListaLigada_Lista 
{
    private AulaListaLigada_Celula primeira = null;
    private AulaListaLigada_Celula ultima = null;
    private int total = 0;
    
    /**
     * Método que adiciiona um objeto no começo da lista
     * @param elemento 
     */
    public void adicionaNoComeco (Object elemento)
    {
        AulaListaLigada_Celula nova = new AulaListaLigada_Celula (elemento, this.primeira);
        this.primeira = nova;
        
        if (this.total == 0)
        {
            this.ultima = this.primeira;
        }

        this.total = this.total + 1;
    }

    /**
     * Método que adiciona um objeto no final da lista
     * @param elemento 
     */
    public void adiciona (Object elemento)
    {
        AulaListaLigada_Celula nova = new AulaListaLigada_Celula(elemento, null);
        this.ultima.setProximo(nova);
        this.ultima = nova;
        this.total = this.total + 1;
    }
    
    /**
     * Método que adiciona um elemento no meio da lista conforme posição determinada
     * @param posicao
     * @param elemento 
     */
    public void adiciona (int posicao, Object elemento)
    {
        if (posicao == 0)
        {
            this.adicionaNoComeco(elemento);
        }
        else if (posicao == this.total)
        {
            this.adiciona(elemento);
        }
        else
        {
            AulaListaLigada_Celula anterior = this.pegaCelula(posicao - 1);
            AulaListaLigada_Celula nova = new AulaListaLigada_Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            this.total = this.total + 1;
        }
    }

    public Object pega (int posicao)
    {
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove (int posicao)
    {
        //TODO
    }
    
    public void removeDoComeco ()
    {
        if (this.total == 0)
        {
            throw new IllegalArgumentException("Lista Vazia!");
        }
        this.primeira = this.primeira.getProximo();
        this.total = this.total - 1;
        
        if (this.total == 0)
        {
            this.ultima = null;
        }
    }
    
    public int tamanho ()
    {
        return this.total;
    }
    
    public boolean contem (Object obj)
    {
        //TODO
        return false;
    }
    
    @Override
    public String toString ()
    {
        if (total == 0) 
        {
            return "[]";
        }
        AulaListaLigada_Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < total; i++)
        {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
    
    private boolean posicaoOcupada (int posicao)
    {
        return (posicao >= 0 && posicao < this.total);
    }
    
    private AulaListaLigada_Celula pegaCelula (int posicao)
    {
        if (!posicaoOcupada(posicao))
        {
            throw new IllegalArgumentException("Posição Inexistente!");
        }

        AulaListaLigada_Celula atual = this.primeira;
        
        for (int i = 0; i < posicao; i++)
        {
            atual = atual.getProximo();
        }
        return atual;
    }
}