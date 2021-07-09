package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;

public final class Socket_Cliente_3 
{
    private static Socket connection;
    private static DataInputStream receive;
    private static DataOutputStream forward;
    
    public static void main(String[] args) throws IOException
    {
        try
        {   
            String sentence = "";
            while(true)
            {
                // Define endereço de conexao com o servidor e porta
                connection = new Socket("127.0.0.1", 51111);
                // Instacia fluxo de entrada de dados
                receive = new DataInputStream(connection.getInputStream());
                // Instancia fluxo de saida de dados
                forward = new DataOutputStream(connection.getOutputStream());

                // Leitor de teclado
                BufferedReader readerKeyboard = new BufferedReader(new InputStreamReader(in));

                // Imprime mensagem na tela do servidor
                out.print("\nType a sentence: ");
                // Recebe uma frase digitada no teclado do usuario
                sentence = readerKeyboard.readLine();
                // Envia a frase para o servidor
                forward.writeUTF(sentence);
                // Recebe resposta do servidor
                String newSentence = receive.readUTF();
                // Imprime mensagem resposta do servidor
                out.println(newSentence);
                
                if(sentence.equalsIgnoreCase("sair"))
                    break;
            }
            
            connection.close();
        }
        catch(IOException e)
        {}
    }
}