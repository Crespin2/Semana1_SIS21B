package Ejercicios;

public class Empleado_AFP {
    public static void main(String[] args) {
        //Declarar Variable
        double desEmpleado, desEmpleador,TPagar;
        
        //Inicializar varibles
        desEmpleado=500*0.06;
        desEmpleador=500*0.065;
        TPagar=desEmpleado+desEmpleador;
        
        //Imprimir resultado
        System.out.println("El trabajor estara pagando: $"+TPagar+" a la AFP en concepto de Empleado y de Empleador");
        
    }
    
}
