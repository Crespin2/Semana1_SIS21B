package Ejercicios;

public class CalculoInteresSimple {
    public static void main(String[] args) {
        //Declarar Variables
        double interes, capitalPrestado, tiempo, tasaDeInteres, tiempoEnMeses;
        
        //Inicializar Variables
        interes=144;
        capitalPrestado=1200.00;
        tasaDeInteres=0.08;
        
        //Uso de variables
        tiempo=interes/(capitalPrestado * tasaDeInteres);
        tiempoEnMeses=tiempo*12;
        
        System.out.println("Tiempo: "+tiempo+ " años.");
        System.out.println("Tiempo: "+tiempoEnMeses+ " meses.");
    }
}
