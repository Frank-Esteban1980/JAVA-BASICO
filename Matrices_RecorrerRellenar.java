/*138 UNIVERSIDAD JAVA
UDEMY
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class Matrices_RecorrerRellenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Introducir elemantos en una matriz con for
        int filas, columnas;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica las filas de la matriz: ");
        filas = sc.nextInt();
        
        System.out.println("Indica las columnas de la matriz: ");
        columnas = sc.nextInt();
        
        var paises = new String[filas][columnas];
        
        for (int f = 0; f <filas; f++){
            for(int c = 0; c < columnas; c++){
                System.out.println("Indica un país: ["+f+"]["+c+"] = ");
                //Cuando el usuario indique el elemento se introduce en la matriz
                paises[f][c]=sc.nextLine();
            }
        }
        
        // Mostrar todos los valores de la matriz ya rellena
        for (int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                System.out.println("País "+paises[f][c]);
            }
        }
                
        
        
    }
    
}
