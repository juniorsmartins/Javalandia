package javalandia.aulas_soltas;

// Importação de classes do Java
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Driver 
{
    public static List<Livro> listaLivros = new LinkedList<>();
    public static List<Cd> listaCds = new LinkedList<>();
    public static List<Cadastro> listaCadastros = new LinkedList<>();

    // Método principal
    public static void main(String[] args) 
    {
        menuPrincipal();
    }
    
    private static void menuPrincipal()
    {
        // Apresentação das opções do Menu Principal
        pulaLinha(2);
        System.out.println("**********************");
        System.out.println("*******  MENU  *******");
        System.out.println("**********************");
        System.out.println("*** Cadastrar - 1  ***");
        System.out.println("***  Comprar - 2   ***");
        System.out.println("***    Sair - 3    ***");
        System.out.println("**********************");

        // Entrada da escolha do usuário
        int opcao = escolherOpcao();

        // Direcionamento para a escolha do usuário
        switch(opcao)
        {
            case 1:
                menuCadastrar();
                break;
            case 2:
                System.out.println("Vender");
                break;
            case 3:
                sair();
            default:
                tratarErro();
                break;
        }
        
        tecleEnter();
        menuPrincipal();
    }

    private static void menuCadastrar()
    {
        // Apresentação das opções do Menu Cadastrar
        pulaLinha(2);
        System.out.println("**********************");
        System.out.println("*****  CADASTRAR  ****");
        System.out.println("**********************");
        System.out.println("***   Cliente - 1  ***");
        System.out.println("***   Produto - 2  ***");
        System.out.println("***   Voltar - 3   ***");
        System.out.println("**********************");

        // Entrada da escolha do usuário
        int opcao = escolherOpcao();

        // Direcionamento para a escolha do usuário
        switch(opcao)
        {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                menuProduto();
                break;
            case 3:
                menuPrincipal();
            default:
                tratarErro();
                break;
        }
        
        tecleEnter();
        menuCadastrar();        
    }
    
    private static void cadastrarCliente()
    {
        Scanner teclar = new Scanner(System.in);
        System.out.print("\nDigite nome: ");
        String nome = teclar.nextLine();
        System.out.print("Digite telefone: ");
        Long telefone = Long.parseLong(teclar.nextLine());
        System.out.print("Digite E-mail: ");
        String mail = teclar.nextLine();
        System.out.print("Digite tipo: ");
        String tipo = teclar.nextLine();
        Cadastro cadastrado = new Cadastro(nome, telefone, mail, tipo);
        listaCadastros.add(cadastrado);
        cadSucesso();
    }
    
    private static void menuProduto()
    {
        // Apresentação das opções do Menu Produto
        pulaLinha(2);
        System.out.println("**********************");
        System.out.println("*****  PRODUTO   *****");
        System.out.println("**********************");
        System.out.println("***    Livro - 1   ***");
        System.out.println("***     CD - 2     ***");
        System.out.println("***   Voltar - 3   ***");
        System.out.println("***    Sair - 4    ***");
        System.out.println("**********************");

        // Entrada da escolha do usuário
        int opcao = escolherOpcao();

        // Direcionamento para a escolha do usuário
        switch(opcao)
        {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarCd();
                break;
            case 3:
                menuCadastrar();
            case 4:
                sair();
            default:
                tratarErro();
                break;
        }
        
        tecleEnter();
        menuProduto();
    }
    
    public static void cadastrarLivro()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite Código de Barras: ");
        String codigo = entrada.nextLine();
        System.out.print("Digite título: ");
        String titulo = entrada.nextLine();
        System.out.print("Digite valor: ");
        Double valor = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite número de páginas: ");
        int paginas = Integer.parseInt(entrada.nextLine());
        Livro livreto = new Livro(codigo, titulo, valor, paginas);
        listaLivros.add(livreto);
        cadSucesso();        
    }
    
    public static void cadastrarCd()
    {
        Scanner entra = new Scanner(System.in);
        System.out.print("\nDigite Código de Barras: ");
        String codigo = entra.nextLine();
        System.out.print("Digite título: ");
        String titulo = entra.nextLine();
        System.out.print("Digite valor: ");
        Double valor = Double.parseDouble(entra.nextLine());
        System.out.print("Digite número de faixas: ");
        int faixas = Integer.parseInt(entra.nextLine());
        Cd Cdzinho = new Cd(codigo, titulo, valor, faixas);
        listaCds.add(Cdzinho);
        cadSucesso();
    }
    
    private static int escolherOpcao()
    {
        Scanner escrever = new Scanner(System.in);
        System.out.print("*** Digite (1, 2 ou 3): ");
        int opcao = Integer.parseInt(escrever.nextLine());
        return opcao;
    }

    private static void sair()
    {
        pulaLinha(2);
        System.out.println("Programa encerrado!");
        System.out.println("Que a força esteja contigo!");
        pulaLinha(1);
        System.exit(0);
    }

    private static void tratarErro()
    {
        pulaLinha(2);
        System.out.println("Opcao invalida!");
        pulaLinha(1);
    }

}