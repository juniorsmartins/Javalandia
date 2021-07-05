package javalandia.aulas_especializacaoJava.sockets;

import java.io.BufferedReader;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class Cliente_1 
{
    private static Socket socket;
    private static DataInputStream entrada;
    private static DataOutputStream saida;

    public static void main(String[] args) 
    {
        try
        {
            socket = new Socket("127.0.0.1", 47000);
            
            entrada = new DataInputStream(socket.getInputStream());
            saida = new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            out.print("Digite um valor numérico qualquer: ");
            int valor = Integer.parseInt(br.readLine());
            
            // valor enviado ao servidor
            saida.writeInt(valor);
            
            // recebe resultado do servidor
            String resultado = entrada.readUTF();
            
            // mostrar resultado na tela
            out.println("\n" + resultado);
            
            socket.close();
            
        }catch(IOException e)
        {
            //TODO
        }
    }
}