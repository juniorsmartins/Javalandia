package javalandia.aulas_certificacaoOCA;

public class MainComArgumentos_1 
{
    public static void main(String[] args) 
    {
        System.out.println(args); // A
        System.out.println(args.length); // B
        System.out.println(args[0]); // C

        // Ao rodar sem argumentos, ocorre uma ArrayIndexOutOfBoundsException na linha C
    }
}