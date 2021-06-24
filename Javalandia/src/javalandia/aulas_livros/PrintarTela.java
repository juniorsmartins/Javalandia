package javalandia.aulas_livros;

public class PrintarTela 
{
    public static void main(String[] args) 
    {
        String nome = "Mário";
        int idade = 30;
        System.out.printf("Nome: %s Idade: %d \n\n", nome, idade);

        System.out.format("Imprime na tela formatado com %s e %d!\n", nome, idade);
        
        System.out.println("Imprime e o cursos é conduzido para o início da próxima linha");
        System.out.print("Imprime e o cursor fica ao fim da linha");
        
        System.out.println("\n");

        // %s recebe a String e %n gera quebra de linha
        System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!");
    }
}