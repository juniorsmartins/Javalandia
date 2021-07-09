package javalandia.aulas_especializacaoJava.sockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import static java.lang.System.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;

public final class Socket_Servidor_4 extends Thread 
{
    // Conexao como atributo de instancia para cada objeto thread
    private Socket connection;
    // Construtor parametrizado em conexao
    Socket_Servidor_4(Socket connection)
    {setConnection(connection);}
    // Metodo setter de conexao
    public void setConnection(Socket connection)
    {this.connection = connection;}
    // Metodo sobreescrito especifico de Threads
    @Override
    public void run() 
    {
        try
        {
            // Estabelece canal de entrada de dados
            ObjectInputStream received = new ObjectInputStream(connection.getInputStream());
            // Recebe o objeto, mas precisa de casting para converter
            Socket_Pessoa_4 objPes = (Socket_Pessoa_4) received.readObject();
            // Imprime informacoes recebidas na tela do servidor
            out.println("Nome: " + objPes.getNome());
            out.format("\nIdade: %s", objPes.getIdade());
            // Processa as informacoes
            String nome = objPes.getNome();
            String novoNome = nome.toUpperCase();
            objPes.setNome(novoNome);
            Integer idade = objPes.getIdade() + 1;
            objPes.setIdade(idade);
            // Estabelece canal de saida de dados
            ObjectOutputStream forward = new ObjectOutputStream(connection.getOutputStream());
            // Reenvia objeto processado
            forward.writeObject(objPes);
            // Fecha canais de entrada e saida e conexao
            received.close();
            forward.close();
            connection.close();
        }
        catch (ClassNotFoundException ex) 
        {java.util.logging.Logger.getLogger(Socket_Servidor_4.class.getName()).log(Level.SEVERE, null, ex);}
        catch(IOException ioe)
        {ioe.toString();} 
        
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        try
        {
            // Estabelece a porta de acesso ao servidor
            ServerSocket server = new ServerSocket(52111);
            // Cria loop infinito para manter o servidor apto a receber conexoes ininterruptamente
            while(true)
            {
                // Metodo accept bloquea o fluxo continuo do software ate estabelecer conexao com um cliente (fica aguardando ate firmar)
                Socket connection = server.accept();
                Socket_Servidor_4 ssThread = new Socket_Servidor_4(connection);
                // Imprime mensagem no servidor
                out.print("Client Connected!");
                // Inicializa o metodo run do servidor
                ssThread.start();
            }
        }
        catch(IOException oe)
        {}
    }
}