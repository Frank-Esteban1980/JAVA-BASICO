
/* 65
 
Se pide crear un sistema de préstamo de libros con dos condicones :
1. si tiene carnet de la biblioteca o
2. o si vive a menos de 3 kms a la redonda*/
package Operadores_Format;

import java.util.Scanner;


public class OperadoresPrestamoLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ... SISMTEMA PRESTAMO LIBROS ... ");
        
        //Verificamos si tiene carnet de la biblioteca
        
        Scanner consola = new Scanner (System.in);
        System.out.println("Tienes carnet de la biblioteca true / false");
        Boolean carnet = consola.nextBoolean();
        
        
        //Verificar si vive hasta 3km a la redonda
        System.out.println("La distaciona a tu domicilio es más de 3km? ");
        int distanciaKm = consola.nextInt();
        
        var Prestamo_Aceptado = carnet == true || distanciaKm<= 3;
        
        System.out.println("Prestamo_Aceptado =>> " + Prestamo_Aceptado);
        
        
        
        
        
    }
    
}
