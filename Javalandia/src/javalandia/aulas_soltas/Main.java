package javalandia.aulas_soltas;

import TreinoMJV.outros.Plano;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        parte1();
    }
    
    private static void parte1()
    {
        menuPrincipal();
        int opcao = optar();
        rotear1(opcao);
    }

    private static void menuPrincipal()
    {
        pulaLinha(1);
        System.out.println("***********************");
        System.out.println("*******  MENU  ********");
        System.out.println("***********************");
        System.out.println("** Comprar Plano - 1 **");
        System.out.println("**   Ver Planos - 2  **");
        System.out.println("**     Sair - 3      **");
        System.out.println("***********************");
    }

    private static int optar()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Escolha a opção: ");
        int opcao = Integer.parseInt(entradaTeclado.nextLine());
        return opcao;
    }

    private static void rotear1(int opcao)
    {
        switch(opcao)
        {
            case 1:
                parte2();
            case 2:
                mostrarPlanos();
                break;
            case 3:
                sair();
            default:
                opcaoInvalida();
                tecleEnter();
                parte1();
        }
        tecleEnter();
        parte1();
    }
    
    private static void sair()
    {
        pulaLinha(1);
        System.out.println("Programa Encerrado!");
        System.out.println("Que a força esteja contigo!");
        pulaLinha(1);
        System.exit(0);
    }
    
    private static void opcaoInvalida()
    {
        pulaLinha(1);
        System.out.print("Opcão Inválida! Tente novamente!");
        pulaLinha(1);
    }
    
    private static void pulaLinha(int linha)
    {
        for(int i = 0; i < linha; i++) 
            System.out.println(" ");
    }
    
    private static void tecleEnter()
    {
        pulaLinha(1);
        Scanner scan = new Scanner(System.in);
        System.out.print("Tecle <Enter> para continuar!");
        String tecle = scan.nextLine();
        pulaLinha(1);
    }
    
    private static void mostrarPlanos()
    {
        pulaLinha(2);
        System.out.println("PLANO BASIC");
        System.out.println("Benefícios: 200 minutos de ligações");
        System.out.println("Preço: R$50,00");
        pulaLinha(1);
        System.out.println("PLANO PREMIUM");
        System.out.println("Benefícios: 200 minutos de ligações + 3g Internet");
        System.out.println("Preço: R$70,00");
        pulaLinha(1);
        System.out.println("PLANO GOLD");
        System.out.println("Benefícios: 200 minutos de ligações + 3g Internet + Facebook ilimitado");
        System.out.println("Preço: R$100,00");
    }

    private static void parte2()
    {
        menuComprar();
        int opcao = optar();
        rotear2(opcao);
    }
    
    private static void menuComprar()
    {
        pulaLinha(1);
        System.out.println("***********************");
        System.out.println("****  MENU COMPRAR  ***");
        System.out.println("***********************");
        System.out.println("**  Plano Basic - 1  **");
        System.out.println("** Plano Premium - 2 **");
        System.out.println("**  Plano Gold - 3   **");
        System.out.println("**    Voltar - 4     **");
        System.out.println("**     Sair - 5      **");
        System.out.println("***********************");
    }

    private static void rotear2(int opcao)
    {
        Plano plano;
        switch(opcao)
        {
            case 1:
                plano = new Plano("Basic", "200 minutos de ligações", 50.00);
                compraEfetuada(plano);
                break;
            case 2:
                plano = new Plano("Premium", "200 minutos de ligações + 3g Internet", 70.00);
                compraEfetuada(plano);
                break;
            case 3:
                plano = new Plano("Gold", "200 minutos de ligações + 3g Internet + Facebook ilimitado", 100.00);
                compraEfetuada(plano);
                break;
            case 4:
                parte1();
            case 5:
                sair();
            default:
                opcaoInvalida();
                tecleEnter();
                parte2();
        }
        tecleEnter();
        parte2();
    }

    private static void compraEfetuada(Plano plano)
    {
        pulaLinha(1);
        System.out.println("Compra efetuada com sucesso!");
        System.out.println("Seu plano é: ");
        System.out.println(plano.toString());
        pulaLinha(1);
    }
}