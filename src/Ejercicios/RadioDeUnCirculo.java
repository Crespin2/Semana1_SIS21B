package Ejercicios;

public class RadioDeUnCirculo {
    public static void main(String[] args) {
        //Declarar Variables
        double area, radio;
        final double pi=3.1416; //la palabra FINAL significa que el valor de l avariable no cambiara
        
        //Inicializacion de Variables
        area=145;
        
        //Uso de Variables
        radio=Math.sqrt(area/pi);//calcular la raiz cuadrada con la funcion Math.Sqrt
        System.out.println("Radio: "+radio+ " cm");
    } 
}
