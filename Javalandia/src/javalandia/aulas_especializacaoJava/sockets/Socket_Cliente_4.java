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
                // Cria canal de fluxo de saida
                channelOut = new ObjectOutputStream(conn.getOutputStream());

                // Captar informacoes
                Scanner entrance = new Scanner(in);        
                out.print("\nType name: ");
                nameEntrance = entrance.nextLine();
                if(nameEntrance.equalsIgnoreCase("sair"))
                    break;
                out.print("Type age: ");
                Integer ageEntrance = Integer.parseInt(entrance.nextLine());

                // Criar objeto
                Socket_Pessoa_4 people = new Socket_Pessoa_4(nameEntrance, ageEntrance);

                // Enviar objeto ao servidor
                channelOut.writeObject(people);

                // Criar canal de fluxo de entrada
                channelIn = new ObjectInputStream(conn.getInputStream());
                
                // Receber resposta do servidor
                Socket_Pessoa_4 people2 = new Socket_Pessoa_4();
                people2 = (Socket_Pessoa_4) channelIn.readObject();

                // Imprime resposta
                out.println("\nNome: " + people2.getNome());
                out.printf("Idade: %s \n", people2.getIdade());
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