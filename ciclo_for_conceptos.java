/* UDEMY 110 - 111 UNIVERSIDAD JAVA

CICLO FOR

Se utiliza para ejecutar un bloque de código un número específico de veces 
Es útil cuando sabemos cuántas veces ser reptirá la acción

--- Sintaxis

for (inicializacion; condición; actualización){
    bloque de código a ejecutar
}

 */
package bucles_for_y_while;

import java.util.Scanner;


public class ciclo_for_conceptos {

    
    public static void main(String[] args) {
        
        System.out.println("--- Números del 1 al 10  ---");
        // inicia en 1 y terminará cuando llegue a 10
        for (int num=1; num<=10; num++){
            //en cada ciclo imprimi el número y un espacio
            System.out.print(num+" ");
        }
        
        //inicia en uno hasta el 20 aumentando 1 en cada ciclo
        
        System.out.println("\n*** Números impares ***");
        for (int i = 1; i <=20; i++){
            
            //En cada ciclo comprueba si es impar
            if (i%2!=0){
                //imprime solo los impares
            System.out.print(" "+i);
            }
        }
        
        System.out.println("\n*** Números Pares ***");
        //inicia en 1, termina en 20, aumentando 1 en cada ciclo
        for (int a = 1; a < 20; a++) {
            //verifica si es par cada número e imprime los pares
            if (a%2==0){
                System.out.print(" "+a);
            }
            
        }
        
        
        //Crear tablas de multiplicar según quiera el usuario
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nTabla del número ? \n");
        int numero = sc.nextInt();
        
        System.out.println("***Tabla multiplicar del "+numero+"  ***");
        
        for(int i = 1; i<=12; i++){
            int producto =i*numero;
            System.out.println(numero+" * "+i+" = "+producto);
        }
        
        
    }
    
}
