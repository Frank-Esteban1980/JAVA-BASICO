
/* 96 
Programa con switch para dado un número de mes indique que estación es 
*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class switch_EstacionAño {

   
    public static void main(String[] args) {
        // pedimos número mes
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número de mes: ");
        int nummes = sc.nextInt();
        //Declaramos la salida
        String mes;
        mes = switch (nummes) {
        case 1, 2 ,3 -> "INVIERNO";
        case 4, 5 , 6 -> "PRIMAVERA";
        case 7, 8, 9 -> "VERANO";
        case 10, 11, 12 -> "OTOÑO";
        
        default -> "Mes inválido";
        };
        System.out.println(mes);
    }
    
}
