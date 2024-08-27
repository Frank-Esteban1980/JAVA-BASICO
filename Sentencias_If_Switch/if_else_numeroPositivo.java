/* 80 
 Verificar si un número es positivo o no */
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_numeroPositivo {

    
    public static void main(String[] args) {
        // Pedimos un número al usuario con Scanner
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número: ");
        int numero = sc.nextInt();
        
        //condicion para ser positivo, ser mayor que 0
        if (numero >0){
            System.out.println("El número "+numero+ " es positivo.");
        } else if (numero<0){
            System.out.println("El número "+numero+ " es negativo.");
        }else{
            System.out.println("El número es "+numero);
        }
    }
    
}
