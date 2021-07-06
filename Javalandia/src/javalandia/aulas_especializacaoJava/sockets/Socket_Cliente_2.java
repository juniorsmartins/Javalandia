/*
    Cliente
*/
package javalandia.aulas_especializacaoJava.sockets;

import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;

public final class Socket_Cliente_2 
{
    private static Socket conexao;
    private static DataInputStream entrada;
    private static DataOutputStream saida;

    public static void main(String[] args) throws IOException
    {
        try
        {
            conexao = new Socket("127.0.0.1", 54321);

            // Criar canais de comunicacao - criar fluxos de entrada e saida 
            entrada = new DataInputStream(conexao.getInputStream());
            saida = new DataOutputStream(conexao.getOutputStream());

            // Entrada de dados pelo console
            BufferedReader bufRed = new BufferedReader(new InputStreamReader(in));
            out.print("\nDigite CPF: ");
            String mensagem = bufRed.readLine();
            out.print("\n");

            // valor enviado ao servidor
            saida.writeUTF(mensagem);
            
            // valor recebido do servidor
            String resultado = entrada.readUTF();
            
            // mostrar resultado na tela
            out.println("\n" + resultado);

            // Fechar streams e conexao
            saida.close();
            conexao.close();
            
        }catch(IOException excIO)
        {/*sem tratamento*/}
    }
}