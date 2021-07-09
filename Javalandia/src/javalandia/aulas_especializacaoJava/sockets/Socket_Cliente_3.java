package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class Socket_Cliente_3 
{
    private static Socket connection;
    private static DataInputStream receive;
    private static DataOutputStream forward;
    
    public static void main(String[] args) throws IOException
    {
        try
        {
            connection = new Socket("127.0.0.1", 51111);
            receive = new DataInputStream(connection.getInputStream());
            forward = new DataOutputStream(connection.getOutputStream());
            
            // Leitor de teclado
            BufferedReader readerKeyboard = new BufferedReader(new InputStreamReader(in));
            out.print("\nType a sentence: ");
            String sentence = readerKeyboard.readLine();
            
        }
        catch(IOException e)
        {
            
        }
    }
}