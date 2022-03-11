package Ejercicios;

public class SalarioDocente {
    public static void main(String[] args) {
        //Declarar Variable
        double HClase, HImpartidas, Renta, SalarioB, SalarioF;
        
        //Inicializacion de variable
        HClase=8.00;
        HImpartidas=36;
        //Formula para el salario Base
        SalarioB=HClase*HImpartidas;
        //Formula para la renta
        Renta=SalarioB*0.10;
        //Formula para el salario final
        SalarioF=SalarioB-Renta;
        
        //Imprimir Resultado
        System.out.println("El salario base es de: $"+SalarioB);
        System.out.println("La renta es de: $"+Renta);
        System.out.println("El salario final del docente sera de: $"+SalarioF);
    }
    
}
