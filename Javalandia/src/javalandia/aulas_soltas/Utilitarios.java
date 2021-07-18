package javalandia.aulas_soltas;

import java.util.Scanner;

public class Utilitarios 
{
    public static void tecleEnter()
    {
        pulaLinha(1);
        Scanner scan = new Scanner(System.in);
        System.out.print("Tecle <Enter> para continuar!");
        String enter = scan.nextLine();
        pulaLinha(1);
    }

    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++)
        {
            System.out.print("\n");
        }
    }
    
    public static void cadSucesso()
    {
        pulaLinha(2);
        System.out.println("Cadastrado com sucesso!");
        pulaLinha(1);
    }
}