package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class resistencia_Equivalente {

    public static void main(String[] args) {
        //Declarar Variables
        double ResistenciaEq, r1, r2, r3, r4;
        
        //Inicializar variables
        r1=5.1;
        r2=68;
        r3=75;
        r4=82;
         NumberFormat formato = new DecimalFormat("#0.00000");
        //Uso de las variables
        ResistenciaEq=1/((r1/1)+(r2/1)+(r3/1)+(r4/1));
        
        //Imprimir resultado
        System.out.println("La resistencia equivalente es: "+formato.format(ResistenciaEq)+" ohm.");
        
    }
    
    
}
