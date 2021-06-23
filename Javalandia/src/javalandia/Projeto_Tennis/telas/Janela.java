package javalandia.Projeto_Tennis.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 * @author Junior Martins
 */
public class Janela 
{
// --------------- AREA DE ATRIBUTOS --------------- //
    // ATRIBUTOS DE CLASSE
    // ATRIBUTOS DE INSTANCIA
    JFrame janela;
    JPanel areaConteudo;
    JLabel rot_bemVindo;
    JLabel rot_login;
    JTextField txt_login;
    JLabel rot_senha;
    JPasswordField jpf_senha;
    JButton btn_logar;

// ---------------  AREA DE METODOS  --------------- //
    // METODOS CONSTRUTORES
    Janela()
    {
        initComponentes();
        initEventos();
    }

    // METODOS FUNCIONAIS
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Janela();
            }
        });
    } 

    private void initComponentes()
    {
        // Cria conteiner superior
        janela = new JFrame("iTennis - Gestao Esportiva");

        // Cria conteiner inferior
        areaConteudo = new JPanel();

        // Define caracteristicas dos conteineres
        janela.setLayout(null);
        areaConteudo.setLayout(null);
        areaConteudo.setBackground(Color.LIGHT_GRAY);

        // Cria componentes 
        rot_bemVindo = new JLabel("iTENNIS");
        rot_login = new JLabel("LOGIN");
        txt_login = new JTextField();
        rot_senha = new JLabel("SENHA");
        jpf_senha = new JPasswordField();
        btn_logar = new JButton("Acessar");

        // Adiciona componentes
        janela.add(areaConteudo);
        areaConteudo.add(rot_bemVindo);
        areaConteudo.add(rot_login);
        areaConteudo.add(txt_login);
        areaConteudo.add(rot_senha);
        areaConteudo.add(jpf_senha);
        areaConteudo.add(btn_logar);
        
        // Dimensiona tamanhos e posições de conteineres e componentes
        janela.setSize(1200, 600);
        areaConteudo.setBounds(350, 125, 500, 300);
        rot_bemVindo.setBounds(225, 25, 50, 30);
        rot_login.setBounds(100, 80, 300, 30);
        txt_login.setBounds(100, 115, 300, 30);
        rot_senha.setBounds(100, 150, 300, 30);
        jpf_senha.setBounds(100, 185, 300, 30);
        btn_logar.setBounds(200, 260, 100, 30);
       
        // centralizar frame no monitor do cliente
	Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize(); // capitar dimensoes do monitor
	janela.setLocation((monitor.width - janela.getSize().width) / 2, (monitor.height - janela.getSize().height) / 2);

        // Torna visivel a tela principal
        janela.setVisible(true);

        // Determina o tipo de resposta ao fechamento da tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initEventos() 
    {
        btn_logar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent logar)
            {
                // capturar infos e consultar compatibilidade de login e senha
                String digitado = jpf_senha.getText();
                txt_login.setText("Botao pressionado! " + digitado);
                jpf_senha.setText("");
            }
        });
    }
}