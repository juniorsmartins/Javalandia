package javalandia.aulas_soltas;

import javax.swing.JOptionPane;

public class OptionPane 
{
    public static void main(String[] args) 
    {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2: "));
        System.out.format("A média é: %s", (valor1 + valor2)/2);
        
        
        String input = (String)JOptionPane.showInputDialog(null,"Esta é uma pergunta?",
                "Título da Caixa de Diálogo",2,null,null,"Digite algo aqui.");
        System.out.println("\n" + input);
        
        
        String[] acceptableValues = {"Choice 1","Choice 2","Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,"Esta é uma pergunta?","Título da Caixa de Diálogo",
                2,null,acceptableValues,acceptableValues[1]);
        System.out.println(input2);
        
        JOptionPane.showMessageDialog(null,"Não há uma entrada aqui; apenas uma mensagem","Título",0);
    }
}