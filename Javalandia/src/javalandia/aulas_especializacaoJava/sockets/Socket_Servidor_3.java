/*
 * Servidor para multiplas conexões
 */
package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import static java.lang.System.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

// Herdar da classe Thread para poder receber multiplas conexoes
public final class Socket_Servidor_3 extends Thread //A heranca permite realizar multiplos fluxos de conexao
{
    // Nao é atributo estático como no cliente. É de instancia para armazenar a conexao de cada thread
    private Socket connection;
    // Construtor - receberá uma conexao como parâmetro
    public Socket_Servidor_3(Socket connection)
    {this.connection = connection;}
    
    @Override // Metodo sobreescrito de Thread
    public void run()
    {
        try
        {
            // Instacia fluxo de entrada de dados
            DataInputStream received = new DataInputStream(connection.getInputStream());
            // recebe a frase do cliente
            String sentence = received.readUTF();
            // Imprime a mensagem na tela do servidor
            out.println("Sentence of cliente: " + sentence);
            // converte a frase para letras maiúsculas
            String newSentence = sentence.toUpperCase();
            // Instacia fluxo de saida de dados
            DataOutputStream forward = new DataOutputStream(connection.getOutputStream());
            // envia a frase convertida para o cliente
            forward.writeUTF(newSentence);
            
            received.close();
            forward.close();
            connection.close();
        }
        catch(IOException ee)
        {}
    }
    
    public static void main(String[] argumentos)
    {
        try
        {
            // Porta de recepcao de servidor socket 
            ServerSocket server = new ServerSocket(51111);
            // Loop infinito
            while(true)
            {
                // Metodo accept para aguardar conexao com o cliente (dentro de um loop infinito)
                Socket connection = server.accept();
                Socket_Servidor_3 sThread = new Socket_Servidor_3(connection);
                // Mensagem para informar conexao de cliente
                out.println("\nConnected Client!");
                // sThread inicializado - linkara no metodo run
                sThread.start();
            }
        }
        catch(IOException ioe)
        {}
    }
}