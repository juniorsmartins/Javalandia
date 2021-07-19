package javalandia.aulas_soltas;

public class Sobrecarga1 
{
    private int valor1;
    private int valor2;
    private int valor3;
    
    // Sobrecarga com construtor chamando construtor
    public Sobrecarga1(int valor1, int valor2)
    {
        this(valor1, valor2, 1);
    }
    public Sobrecarga1(int valor1, int valor2, int valor3)
    {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    // Sobrecarga com método chamando método
    public int calcula2(int valor1, int valor2)
    {
        return calcula3(valor1, valor2, 0);
    }
    public int calcula3(int valor1, int valor2, int valor3)
    {
        int resposta = valor1 + valor2 + valor3;
        return resposta;
    }
    
    public static void main(String[] args) 
    {
        Sobrecarga1 sobre = new Sobrecarga1(2, 2);
        System.out.println(sobre.valor1 + " " + sobre.valor2 + " " + sobre.valor3);
        int soma = sobre.calcula2(2, 5);
        System.out.println("Resposta: " + soma);
    }
}