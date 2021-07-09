package javalandia.aulas_especializacaoJava.sockets;

import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public final class Socket_Cliente_4 
{
    private static Socket conn;
    private static ObjectInputStream channelIn;
    private static ObjectOutputStream channelOut;

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        try
        {
            String nameEntrance;
            while(true)
            {
                // Define endereço de conexao com o servidor e porta
                conn = new Socket("127.0.0.1", 52111);
                // Cria canais de fluxo de entrada e saida
                channelIn = new ObjectInputStream(conn.getInputStream());
                channelOut = new ObjectOutputStream(conn.getOutputStream());

                // Captar informacoes
                Scanner entrance = new Scanner(in);        
                out.print("\nType name: ");
                nameEntrance = entrance.nextLine();
                out.print("\nType age: ");
                Integer ageEntrance = Integer.parseInt(entrance.nextLine());

                // Criar objeto
                Socket_Pessoa_4 people = new Socket_Pessoa_4(nameEntrance, ageEntrance);

                // Enviar objeto ao servidor
                channelOut.writeObject(people);

                // Receber resposta do servidor
                people = (Socket_Pessoa_4) channelIn.readObject();
                // Imprime resposta
                out.println("Nome: " + people.getNome());
                out.printf("Idade: %s \n", people.getIdade());
                
                if(nameEntrance.equalsIgnoreCase("sair"));
                    break;
            }
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