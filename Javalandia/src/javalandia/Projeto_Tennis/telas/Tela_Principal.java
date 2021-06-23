/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalandia.Projeto_Tennis.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * @author Junior Martins
 */
public class Tela_Principal 
{
// --------------- AREA DE ATRIBUTOS --------------- //
    // ATRIBUTOS DE CLASSE
    // ATRIBUTOS DE INSTANCIA

// ---------------  AREA DE METODOS  --------------- //
    // METODOS CONSTRUTORES
    Tela_Principal()
    {
        initComponente();
    }

    // METODOS GETTERS E SETTERS
    // METODOS FUNCIONAIS
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Tela_Principal();
            }
        });
    }

    private void initComponente()
    {
        // Cria conteiners superior
        JFrame telaPrincipal = new JFrame("iTennis - Gestao Esportiva");
        
        // Dimensiona o tamanho do conteiner superior
        telaPrincipal.setSize(1000, 600);
        
        // Determina o tipo de resposta ao fechamento da tela
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria componente rotulo
        JLabel rot_login = new JLabel("LOGIN");
        
        // Adiciona componente rotulo ao painel de conteudo da tela principal
        telaPrincipal.add(rot_login);
        
        // Torna visivel a tela principal
        telaPrincipal.setVisible(true);
    }

    // METODOS ABSTRATOS E POLIMORFICOS
}

// --------------- AREA DE ATRIBUTOS --------------- //
	// ATRIBUTOS DE CLASSE
	// ATRIBUTOS DE INSTANCIA

	// ---------------  AREA DE METODOS  --------------- //
	// METODOS CONSTRUTORES
	// METODOS GETTERS E SETTERS
	// METODOS FUNCIONAIS
	// METODOS ABSTRATOS E POLIMORFICOS

	// ---------- Check List ----------
	// Escrever codigo 
	// Comentar codigo
	// Documentar codigo
	// Testar coidog
	// Incluir mapeamento Objeto-relacional
