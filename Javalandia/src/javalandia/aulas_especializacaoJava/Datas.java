package javalandia.aulas_especializacaoJava;

import java.util.GregorianCalendar;

public class Datas 
{
    public static void main(String[] args) 
    {
        GregorianCalendar data = new GregorianCalendar();
        int dia = data.get(data.DAY_OF_MONTH);
        int mes = data.get(data.MONTH)+1;
        int ano = data.get(data.YEAR);
        int hora = data.get(data.HOUR);
        int min = data.get(data.MINUTE);
        int sec = data.get(data.SECOND);
        
        
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + min);
        System.out.println("Segundo: " + sec);
    }
}