package Ejercicios;

public class CalculoDeMonedas {
    public static void main(String[] args) {
        //Declarar Variables
        double MEuropa, MReinoUnido, MAustralia, MCanada, USD;
        USD=100;
        MEuropa=USD*0.70;
        MReinoUnido=USD*0.61;
        MAustralia=USD*0.95;
        MCanada=USD*0.97;
        
        //Imprimiendo resultado
        System.out.println("$100.00 equivale en Europa a: Є"+MEuropa);//Euros
        System.out.println("$100.00 equivale en el Reino Unido a: £"+MReinoUnido);//LibrasEsterlinas
        System.out.println("$100.00 equivale en Australia a: A$"+MAustralia);//Dolar Australiano
        System.out.println("$100.00 equivale en Canda a: C$"+MCanada);//Dolar Canadiense
    }
    
}
