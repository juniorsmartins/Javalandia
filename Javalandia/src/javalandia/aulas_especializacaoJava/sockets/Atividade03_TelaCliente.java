package javalandia.aulas_especializacaoJava.sockets;

// Importação de Conteineres e Componentes
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Importação de pacote de cores
// Importação geral
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingUtilities;

// View Cliente - mVc
public class Atividade03_TelaCliente
{
    // Atributos de Instância (características da tela)
    private JFrame janela; // Painel de vidro (Conteiner)
    private JRootPane painelPrincipal; // Painel de camada (Painel raiz - gerenciador)
    private JPanel painelNome; // Painel de conteúdo
    private JPanel painelIdade;
    private JPanel painelRetorno;
    private JPanel painelBotao;

    // Construtor
    Atividade03_TelaCliente()
    {
        construirTela();
    }
    
    public void construirTela()
    {
        // Criar conteiner
        janela = new JFrame("Tela do Cliente");
        
        // Define gerenciador de layout
        janela.setLayout(null);

        // Definir características para o conteiner
        janela.setSize(600, 400); // Largura e Altura
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o programa ao fechar a janela
           
        // Cria painéis leves para organizar componentes internamente
        painelNome = new JPanel();
        painelIdade = new JPanel();
        painelRetorno = new JPanel();
        painelBotao = new JPanel();
        
        // Cria conteúdo para painéis
        JLabel lb_nome = new JLabel("Nome: ");
        JTextField tx_nome = new JTextField();
        JLabel lb_idade = new JLabel("Idade: ");
        JTextField tx_idade = new JTextField();
        
        // Agrupa componentes
        painelNome.add(lb_nome);
        painelNome.add(tx_nome);
        janela.add(painelNome);
        painelIdade.add(lb_idade);
        painelIdade.add(tx_idade);
        janela.add(painelIdade);

        // Determina visibilidade
        janela.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() // Cria a GUI na thread de despacho de evento
            {new Atividade03_TelaCliente();}
        });
    }
}