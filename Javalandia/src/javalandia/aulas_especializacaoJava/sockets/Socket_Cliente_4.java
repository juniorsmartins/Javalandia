package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Socket_Cliente_4 
{
    Socket conn;
    ObjectInputStream received;
    ObjectOutputStream forward;

    public static void main(String[] args)
    {
        try
        {
            // Define endereço de conexao com o servidor e porta
            Socket conn = new Socket("127.0.0.1", 52111);
            // Cria canais de fluxo de entrada e saida
            ObjectInputStream channelIn = new ObjectInputStream(conn.getInputStream());
            ObjectOutputStream channelOut = new ObjectOutputStream(conn.getOutputStream());
            
            // Captar informacoes
            BufferedReader entrance = new BufferedReader(new InputStreamReader(in));
            out.format("\nType name: ");
            String nameEntrance = entrance.readLine();
            out.format("\nType age: ");
            Integer ageEntrance = Integer.parseInt(entrance.readLine());  
            // Criar objeto
            Socket_Pessoa_4 people = new Socket_Pessoa_4(nameEntrance, ageEntrance);
            // Enviar objeto ao servidor
            channelOut.writeObject(people);
            // Receber resposta do servidor
            Socket_Pessoa_4 peopleEntrance = (Socket_Pessoa_4) channelIn.readObject();
            // Imprime resposta
            out.println("Nome: " + peopleEntrance.getNome());
            out.printf("Idade: %s \n", peopleEntrance.getIdade());

            channelIn.close();
            channelOut.close();
            conn.close();
        }
        catch(ClassNotFoundException cnfe)
        {cnfe.toString();}
        catch(IOException ioe)
        {ioe.toString();}
    }
}