package javalandia.aulas_especializacaoJava.sockets;

// Importação de Conteineres e Componentes
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

// Importação geral
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

// View Cliente - mVc
public class Atividade03_TelaCliente 
{
    // Atributos de Instância (características da tela)
    private JFrame janela; // Painel Superior - Conteiner
    private JPanel painelGeral;
    private JPanel painelNome; 
    private JPanel painelIdade;
    private JPanel painelRetorno;
    private JPanel painelBotao;

    private JLabel lb_nome;
    private JTextField tx_nome;
    private JLabel lb_idade;
    private JTextField tx_idade;
    private JTextArea ta_retorno;
    private JButton bt_enviar;
    
    // Construtor
    Atividade03_TelaCliente()
    {
        construirTela();
        acionarEventos();
    }
    
    public void construirTela()
    {
        // Criar conteiner
        janela = new JFrame("Tela do Cliente");
        
        // Definir características para o conteiner
        janela.setSize(600, 400); // Largura e Altura
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o programa ao fechar a janela

        // definir posicao da janela na tela do computador do cliente
        Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize(); // capitar dimensoes do monitor
        janela.setLocation((monitor.width - janela.getSize().width) / 2, // usar dimensoes do monitor p/centrar tela
            (monitor.height - janela.getSize().height) / 2); // usar dimensoes do monitor p/centrar tela        
                
        // Cria painéis leves para organizar componentes internamente
        painelGeral = new JPanel();
        painelNome = new JPanel();
        painelIdade = new JPanel();
        painelRetorno = new JPanel();
        painelBotao = new JPanel();
        
        // Cria conteúdo para painéis
        lb_nome = new JLabel("Nome: ");
        tx_nome = new JTextField(50);
        lb_idade = new JLabel("Idade: ");
        tx_idade = new JTextField(50);
        ta_retorno = new JTextArea("Área de feedback ao cliente!", 12, 55);
        bt_enviar = new JButton("Enviar");
        
        // Definir características aos painéis e componentes
        ta_retorno.setEditable(false);

        // Definir posicionamento e dimensões
//        painelNome.setBounds(10, 0, 500, 60);
//        painelIdade.setBounds(80, 0, 500, 60);
//        painelRetorno.setBounds(150, 0, 500, 100);
//        painelBotao.setBounds(260, 0, 50, 30);
//        lb_nome.setBounds(10, 0, 500, 50);
//        tx_nome.setBounds(10, 0, 500, 50);

        // Agrupa componentes
        painelNome.add(lb_nome);
        painelNome.add(tx_nome);
        painelGeral.add(painelNome);
        painelIdade.add(lb_idade);
        painelIdade.add(tx_idade);
        painelGeral.add(painelIdade);
        painelRetorno.add(ta_retorno);
        painelGeral.add(painelRetorno);
        painelBotao.add(bt_enviar);
        painelGeral.add(painelBotao);
        janela.add(painelGeral);

        // Determina visibilidade
        janela.setVisible(true);
    }
    
    // Definir eventos
    public void acionarEventos()
    {
        bt_enviar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {ta_retorno.setText("Teste!");
            }
        });
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