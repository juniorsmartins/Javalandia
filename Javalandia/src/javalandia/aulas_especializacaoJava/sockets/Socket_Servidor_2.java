package javalandia.aulas_especializacaoJava.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import static java.lang.System.out;

public final class Socket_Servidor_2 
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
            
            // Limpa o CPF ao retirar caracteres excedentes
            String cpfTratado = retirarCaracteres(cpfRecebido);
            // Verificar a quantidade correta de digitos no CPF
            boolean tamanhoChecado = verificarTamanhoValido(cpfTratado);
            if(tamanhoChecado == true)
            {
                
            }
            else
            {cpfTratado = "CPF Invalido!";}
         
            
            // Retornar resultado da operacao
            saida.writeUTF(cpfTratado);

            // Fechar streams e conexao
            entrada.close();
            conexao.close();
            
        }catch(IOException ioe)
        {}
    };

    private static String retirarCaracteres(String cpfRecebido)
    {  
       // O metodo replace substitui o primeiro argumento pelo segundo
       String cpfTratado = cpfRecebido.replace("-","");
       cpfTratado = cpfTratado.replace(".","");    
       return cpfTratado;
    };
    
    private static boolean verificarTamanhoValido(String cpfTratado)
    {
        // O metodo verifica se o tamanho do CPF é maior ou menor que 11
        if(cpfTratado.length() != 11 )
            return true;    
        return false;
    }
};