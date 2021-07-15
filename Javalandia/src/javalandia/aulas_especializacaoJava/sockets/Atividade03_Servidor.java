package javalandia.aulas_especializacaoJava.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public final class Atividade03_Servidor extends Thread 
{
    // Conexao como atributo de instancia para cada objeto thread
    public Socket connection;
    
    // Construtor parametrizado em conexao
    public Atividade03_Servidor(Socket conn)
    {connection = conn;}
    
    // Metodo sobreescrito especifico de Threads
    @Override
    public void run()
    {
        try
        {
            // Estabelece canal de entrada de dados
            ObjectInputStream channelIn = new ObjectInputStream(connection.getInputStream());

            // Recebe o objeto, mas precisa de casting para converter
            Atividade03_ModeloPessoa pessoaServer = (Atividade03_ModeloPessoa) channelIn.readObject();

            // Processa as informacoes (transforma nome em maiúsculo e insere mensagem)
            pessoaServer.setNome(pessoaServer.getNome().toUpperCase());
            String frase = "\nServicor conectado com sucesso!\nNome: " + pessoaServer.getNome() 
                    + "\nIdade: " + pessoaServer.getIdade() + "\nPode enviar mais!";
            pessoaServer.setMensagem(frase);

            // Estabelece canal de saida de dados
            ObjectOutputStream channelOut = new ObjectOutputStream(connection.getOutputStream());
            
            // Reenvia objeto processado
            channelOut.writeObject(pessoaServer);
            
            // Fecha canais de entrada e saida e conexao
            channelIn.close();
            channelOut.close();
            connection.close();
        }
        catch (ClassNotFoundException ex)
        {ex.toString();}
        catch(IOException iee)
        {iee.toString();}
    }

    public static void main(String[] args) throws IOException
    {
        try
        {
            // Estabelece porta de acesso ao servidor
            ServerSocket server = new ServerSocket(53321);
            
            // Cria loop infinito para manter o servidor apto a receber conexoes ininterruptamente
            while(true)
            {
                // Metodo accept bloquea o fluxo continuo do software ate estabelecer conexao com cliente (aguarda ate firmar)
                Socket connection = server.accept();
                
                // Imprime aviso no console do servidor
                System.out.println("\nConexão estabelecida com cliente!");
                
                // Instancia o servidor com conexao estabelecida
                Atividade03_Servidor servidor = new Atividade03_Servidor(connection);
                              
                // Inicializa o método run do servidor
                servidor.start();
            }
        }
        catch(IOException ioe)
        {}
    }
}