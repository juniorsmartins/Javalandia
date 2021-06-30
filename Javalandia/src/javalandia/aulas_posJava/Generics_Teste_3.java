package javalandia.aulas_posJava;

import static java.lang.System.out;

public class Generics_Teste_3 
{
    public static void main(String[] argumentos)
    {
        Generics_3<Integer> nums1 = new Generics_3<>(4);
        int somar1 = nums1.getValor() + 1;
        out.println("Resultado: " + somar1);
        nums1.showType();
        
        Generics_3<Double> nums2 = new Generics_3<>(3.5);
        double somar2 = nums2.getValor() + 2;
        out.println("Resultado: " + somar2);
        nums2.showType();
        
        Generics_3<Long> nums3 = new Generics_3<>(55L);
        long somar3 = nums3.getValor() + 30;
        out.println("Resultado: " + somar3);
        nums3.showType();
    }    
}