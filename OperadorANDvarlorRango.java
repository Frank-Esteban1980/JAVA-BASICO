/* video 63

 *Buscar un valor dentro de un rango*/
package Operadores_Format;

import java.util.Scanner;

public class OperadorANDvarlorRango {

   
    public static void main(String[] args) {
                
        final var MINIMO = 0;
        final var MAXIMO = 10;
        
        System.out.println("El rango está entre "+MINIMO+ " "+ MAXIMO);
        
        System.out.println("Valor dentro de un rango. ");
        Scanner valor = new Scanner(System.in);
        System.out.println("Indica tu valor: ");
        //var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        int numero = valor.nextInt();
        
        //Verificar si el número está dentro del rango
        
        var dentroRango = numero>=MINIMO && MAXIMO >= numero;
        
        System.out.println("Numero está dentro de rango =>  " + dentroRango);
        
        
        var enRango = numero>=MINIMO && numero<=MAXIMO;
        
        System.out.println("Numero está dentro de rango =>  " + dentroRango);
        
        
        
        
    }
    
}
