package javalandia.aulas_udemy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils 
{
    static SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    static NumberFormat formatarValor = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String dateParaString(Date data)
    {
        return Utils.formatarData.format(data);
    }
    
    public static Date stringParaData(String data)
    {
        try
        {
            return Utils.formatarData.parse(data);
        }
        catch(ParseException e)
        {
            return null;
        }
    }
    
    public static String doubleParaString(Double valor)
    {
        return Utils.formatarValor.format(valor);
    }

    public static Double stringParaDouble(String valor)
    {
        try
        {
            return (Double)Utils.formatarValor.parse(valor);
        }
        catch(ParseException e)
        {
            return null;
        }
    }
    
    public static void pausar(int segundos)
    {
        try
        {
            TimeUnit.SECONDS.sleep(segundos);
        }
        catch(InterruptedException e)
        {
            System.out.println("Erro ao pausar por " + segundos + " segundos.");
        }
    }
    
    public static void pulaLinha(int linha)
    {
        for(int i = 1; i <= linha; i++)
        {
            System.out.print("\n");
        }
    }
}