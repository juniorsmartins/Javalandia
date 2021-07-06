package javalandia.aulas_especializacaoJava.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import static java.lang.System.out;

public class Socket_Servidor_2 
{
    private static ServerSocket servidor;
    private static Socket conexao;
    private static DataInputStream entrada;
    private static DataOutputStream saida;
    
    public static void main(String[] args) throws IOException
    {
        try
        {
            // Implementacao basica de servidor de socket - porta de recepcao
            servidor = new ServerSocket(54321);

            out.println("Porta 54321 aberta!");

            // Metodo accept para aceitar conexao de cliente
            conexao = servidor.accept();

            // Criar canais de comunicacao - criar fluxos de entrada e saida 
            entrada = new DataInputStream(conexao.getInputStream());
            saida = new DataOutputStream(conexao.getOutputStream());

            // Receber o valor
            String cpfRecebido = entrada.readUTF();
            
            // Processar o valor
            String cpfTratado = "";
            
            // Retornar resultado da operacao
            saida.writeUTF(cpfTratado);

            // Fechar streams e conexao
            entrada.close();
            conexao.close();
        }catch(IOException ioe)
        {}
    }
}