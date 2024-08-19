/* video 66
Verificar si un varlo está fuera de rango*/
package Operadores_Format;

import java.util.Scanner;


public class OperadorfueraRango {

   
    public static void main(String[] args) {
        System.out.println("*** VERIFICAR SI UN OPERADOR ESTÁ FUERA DE RANGO *** ");
        
        //Marcamos un limite del rango
        
        final int INICIO = 1;
        final int FINAL = 10;
        
        //Pedimos el valor a verificar
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Indica tu número: ");
        int valor = escaneo.nextInt();
        
        //Verficar que está fuera  del rengo
        
        var fueraRango = (INICIO > valor && valor > FINAL);
        System.out.println("Valor:  "+ valor +" está fuera de rango ("+INICIO+ " - "+ FINAL +") ==>> "+ fueraRango );
        
        
        var dentroRango = !(valor < INICIO && valor > FINAL);
        System.out.println("Valor:  "+ valor +" está dentro de rango ("+INICIO+ " - "+ FINAL +") ==>> "+ dentroRango );
        
        
    }
    
}
