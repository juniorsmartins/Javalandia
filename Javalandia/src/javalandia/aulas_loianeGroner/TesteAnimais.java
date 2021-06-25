package javalandia.aulas_loianeGroner;

import AulasLoianeGroner.Cachorro;
import AulasLoianeGroner.Cavalo;
import AulasLoianeGroner.Papagaio;
import javalandia.aulas_loianeGroner.Gato;

public class TesteAnimais 
{

    public static void main(String[] args) 
    {
        Cavalo cavalo = new Cavalo();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Papagaio papagaio = new Papagaio();
        
        cavalo.alimentar();
        gato.alimentar();
        cachorro.amamentar();
        papagaio.emitirSom();
        cachorro.brincar();
        
    }
    
}
