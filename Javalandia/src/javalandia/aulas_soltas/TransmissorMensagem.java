package javalandia.aulas_soltas;

import java.util.Date;

public abstract class TransmissorMensagem 
{
    // ÁREA DE ATRIBUTOS
    private Date data;
    
    
    // ÁREA DE MÉTODOS
    public abstract void enviar(String mensagem);
}