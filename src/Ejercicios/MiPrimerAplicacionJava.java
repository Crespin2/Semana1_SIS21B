package Ejercicios;

public class MiPrimerAplicacionJava {
    public static void main(String[] args) {
        //Declarar variables (Ejemplos de algunos tipos de datos)
        String nombreCompleto, direccion, estadoCivil; //Tipo cadena de texto ejemplo Juan Perez
        int edad; //Tipo de dato entero Ejemplo 23
        double gastosDiarios; //Tipo de dato con decimales Ejemplo 12.34
        char genero; //TIpo de dato Char Ejemplo F o M
        boolean poseeVehiculo;  //Tipo boolen Ejemplo true o false
        
        //Inicializacion de Variables
        nombreCompleto = "Camila Esperanza ROsales";
        direccion = "Calle la amargura desvio la tristeza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        //Uso de variables (Mostrar en pantalla las varialbes)
        System.out.println("------MOSTRAR VARIABLES----");
        System.out.println("Nombre Completo : "+nombreCompleto);
        System.out.println("Direccion : "+direccion);
        System.out.println("Estado Civil : "+estadoCivil);
        System.out.println("Edad : "+edad);
        System.out.println("Gastos Diarios : "+gastosDiarios);
        System.out.println("Genero : "+genero);
        System.out.println("Posee Vehiculo : "+poseeVehiculo);
    }
    
}
