package javalandia.aulas_especializacaoJava.sockets;

// Controle Cliente - mvC
public class Atividade03_ControleCliente implements Atividade03_Interface_TelaControle
{
    @Override
    public String acionarControle(String nome, String tx_idade)
    {
        int idade;

        // Tratamento de exceção na conversão do string/texto em inteiro
        try
        {idade = Integer.parseInt(tx_idade);}
        catch(NumberFormatException nfe)
        {return "Idade Inválida! Tente novamente.";}
        
        Atividade03_ModeloPessoa pessoa = new Atividade03_ModeloPessoa(nome, idade);
        
        
        
        return "Deu certo!";
    };
}