package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RadioDeUnCirculo {
    public static void main(String[] args) {
        //Declarar Variables
        double area, radio;
        final double pi=3.1416; //la palabra FINAL significa que el valor de l avariable no cambiara
        
        NumberFormat formato = new DecimalFormat("#0.00");
        //Inicializacion de Variables
        area=145;
        
        //Uso de Variables
        radio=Math.sqrt(area/pi);//calcular la raiz cuadrada con la funcion Math.Sqrt
        System.out.println("Radio: "+formato.format(radio)+ " cm");
    } 
}
