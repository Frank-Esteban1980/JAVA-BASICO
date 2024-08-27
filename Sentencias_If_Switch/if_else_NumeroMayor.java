/*89
Programa que pida dos número y luego comparar, indicando cuál es el mayor 
*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_NumeroMayor {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Di un número: ");
        int numero1 = sc.nextInt();
        
        System.out.println("Di otro número: ");
        int numero2 = sc.nextInt();
        
        if (numero1>numero2){
            System.out.println("El número "+numero1+" es el mayor");
       
        }else{
            System.out.println("El número "+numero2+" es el mayor");
        }
    }
    
}
