package javalandia.aulas_udemy;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PessoaFisica 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static double totalClientes;
    
    // Atributos de Instância
    private String dataCadastroCliente;
    private String registroCliente;
    private String nomeCliente;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public PessoaFisica(String nome)
    {
        PessoaFisica.setTotalClientes();
        this.setDataCadastroCliente();
        this.setRegistroCliente();
        this.setNomeCliente(nome);
    }

    // Métodos Abstratos

    // Métodos de Classe
    public static double getTotalClientes()
    {
        return PessoaFisica.totalClientes;
    }
    private static void setTotalClientes()
    {
        PessoaFisica.totalClientes += 1;
    }

    // Métodos de Instância
    // Métodos de Polimorfismo

    // Métodos Getters e Setters
    public String getDataCadastroCliente()
    {
        return this.dataCadastroCliente;
    }
    private void setDataCadastroCliente()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataCadastroCliente = formatar.format(data);
    }
    
    public String getRegistroCliente()
    {
        return this.registroCliente;
    }
    private void setRegistroCliente()
    {
        this.registroCliente = (this.getDataCadastroCliente() + " - " + PessoaFisica.getTotalClientes());
    }

    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    private void setNomeCliente(String nome)
    {
        this.nomeCliente = nome;
    }
}