package javalandia.aulas_soltas;

import javalandia.aulas_soltas.Encapsulamento;

public class testeEncap 
{
    public static void main(String[] args) 
    {
      Encapsulamento teste = new Encapsulamento();
      System.out.println(teste.getNome());
      System.out.println(teste.getNomeCompleto());
    }
}