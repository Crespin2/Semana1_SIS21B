package Ejercicios;

public class TrabajadorHorasExtras {
    public static void main(String[] args) {
        //Declarar variables
        double PDiario, HExtras,pJornadaN,PHExtras,salarioB,Renta,salarioF;
        
        //Inicilizacion de variables
        PDiario=10;
        HExtras=50;
        //Formula para sacar el total del pago de las horas extras
        PHExtras=(PDiario*0.10)*50;
        //Formula para el pago de salario mensual
        pJornadaN=PDiario*30;
        //Formula para el pago mensual de la jornada normal + horas extras
        salarioB=pJornadaN+HExtras;
        Renta=salarioB*0.10;
        salarioF=salarioB-Renta;
        
        //Imprimir resultado
        System.out.println("Horas extras: $"+PHExtras);
        System.out.println("Salario base jornada normal: $"+pJornadaN);
        System.out.println("Salario mensual + horas extras: $"+salarioB);
        System.out.println("Renta: $"+Renta);
        System.out.println("Salario Final: $"+salarioF);
    }
}
