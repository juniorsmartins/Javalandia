package javalandia.aulas_soltas;

import AulasOutros.ProjetoControleRemoto;

public class ControleRemoto {

    public static void main(String[] args) {
        
        ProjetoControleRemoto controleRemoto = new ProjetoControleRemoto();
        
        controleRemoto.statusCR();
        
        controleRemoto.ligar();
        controleRemoto.play();
        controleRemoto.menosVolume();

        controleRemoto.statusCR();  
        
    }


    
}
