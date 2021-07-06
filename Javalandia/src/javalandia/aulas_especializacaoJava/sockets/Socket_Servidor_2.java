/*
    Servidor
*/
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

            // Recebe cpf informado pelo cliente
            String cpf = entrada.readUTF();
            
            // Envia cpf para processo de verificacao 
            boolean cpfValidado = validarCpf(cpf);
            
            String cpfTratado;
            if(cpfValidado == false)
            {cpfTratado = "CPF Invalido!";}
            else
            {cpfTratado = "CPF Valido!";}

            // Retornar resultado da operacao
            saida.writeUTF(cpfTratado);

            // Fechar streams e conexao
            entrada.close();
            conexao.close();
            
        }catch(IOException ioe)
        {/*sem tratamento*/}
    };
    
    public static boolean validarCpf(String c)
    {
     
        if(c == null)
        {return false;}
        else
        {
            String cpfGerado = "";    
            
            // Limpa cpf de caractares como ponto e hifen
            c = retirarCaracteres(c);
            // Verifica quantia de digitos compativel com 11
            if(verificarTamanhoInvalido(c))
                return false;
            // Verifica se diferente de sequencia de zeros
            if(verificarSeHaSequenciaZeros(c))
                return false;
            
            // Faz calculo para gerar dois ultimos digitos e depois verificar compatibilidade
            cpfGerado = c.substring(0, 9);
            cpfGerado = cpfGerado.concat(calculoVerificadorDoCPF(cpfGerado));
            cpfGerado = cpfGerado.concat(calculoVerificadorDoCPF(cpfGerado));

            // Verifica compatibilidade
            if(!cpfGerado.equals(c))
                return false;
        }
        return true;
    }

    private static String retirarCaracteres(String cpf)
    {  
       // O metodo replace substitui o primeiro argumento pelo segundo
       cpf = cpf.replace("-","");
       cpf = cpf.replace(".","");    
       return cpf;
    };
    
    private static boolean verificarTamanhoInvalido(String cpf)
    {
        // O metodo verifica se o tamanho do CPF é diferente de 11
        if(cpf.length() != 11)
            return true;
        return false;
    }
    
    private static boolean verificarSeHaSequenciaZeros(String cpf)
    {
        // Verifica se CPF é sequencia de zeros
        //char primDig = cpf.charAt(0);
        char primeiroDig = '0';
        char[] charCpf = cpf.toCharArray();    
        for(char c: charCpf)
            if (c != primeiroDig)
                return false;        
        return true;
    }
    
    private static String calculoVerificadorDoCPF(String cpf)
    {
        int digGerado = 0;
        int mult = cpf.length()+1;
        char[] charCpf = cpf.toCharArray();
        for(int i = 0; i < cpf.length(); i++ )
            digGerado += (charCpf[i]-48) * mult--;
        if(digGerado % 11 < 2)
            digGerado = 0;
        else
            digGerado = 11 - digGerado % 11;
        return  String.valueOf(digGerado);
    }
};