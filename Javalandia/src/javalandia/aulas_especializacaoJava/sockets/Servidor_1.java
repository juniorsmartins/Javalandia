package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Servidor_1 
{
    private static Socket socket;
    private static ServerSocket server;
    private static DataInputStream entrada;
    private static DataOutputStream saida;
    
    public static void main(String[] args) 
    {
        try
        {
            // criar porta de recepcao
            server = new ServerSocket(47000);
            socket = server.accept();
    
            // criar fluxos de entrada e saida 
            entrada = new DataInputStream(socket.getInputStream());
            saida = new DataOutputStream(socket.getOutputStream());
        
            // recebimento de valor inteiro
            int valor = entrada.readInt();

            // processamento do valor
            String resultado = "";
            if(valor > 0)
            {resultado = "Valor maior de zero!";}
            else
            {resultado = "Valor menor de zero!";}

            // envio dos dados de resultado
            saida.writeUTF(resultado);
            
            socket.close();
            server.close();
        }
        catch(IOException e)
        {
            //TODO
        }
    }


    
}