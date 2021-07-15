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
public final class Atividade03_TelaCliente 
{
    // Atributos de Instância (componentes de tela)
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

    // Interface para uso com Pattern Strategy
    private Atividade03_Interface_TelaControle telaInterControl;
    
    // Construtor
    Atividade03_TelaCliente()
    {
        construirTela();
        acionarEventos();
    }
    
    public final void construirTela()
    {
        // Criar conteiner
        janela = new JFrame("Tela do Cliente");
        
        // Definir características para o conteiner
        janela.setSize(600, 367); // Largura e Altura
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
    
    // Definir ouvintes e tratadores de eventos
    public final void acionarEventos()
    {
        // Adiciona registro de ouvinte de evento (interface ActionListener)
        bt_enviar.addActionListener(new ActionListener()
        {
            // Método chamado quando botão é pressionado (tratador do eventos ActionEvent)
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                // Define o envio de nome e idade para o respectivo controle
                telaInterControl = new Atividade03_ControleCliente();
                String mensagemDoServidor = telaInterControl.acionarControle(tx_nome.getText(), tx_idade.getText());
                limparNomeIdade();
            }
        });
    }
    
    public void limparNomeIdade()
    {
        tx_nome.setText("");
        tx_idade.setText("");
    };
    
    public static void main(String[] args) 
    {
        // Cria quadro na thread de despacho de evento
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {new Atividade03_TelaCliente();}
        });
    }
}