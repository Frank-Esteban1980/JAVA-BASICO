/* UNIVERSIDAD JAVA 123 UDEMY
 
Dibujar un triángulo con asteriscos (o caracter que se prefiera) usando for

*/
package bucles_for_y_while;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class for_DibujarTriangulo {

    
    public static void main(String[] args) {
        // Pedimos al uauario la cantidad de niveles
        
        System.out.println("*** DIBUJO TRIANGULO ***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicar los niveles del triánculo: ");
        int numfilas = sc.nextInt();
        
        //con for iterar en cada fila del triánculo indicado por niveles
        for (int fila = 1; fila<=numfilas; fila++ ){
            var espaciosblanco = " ".repeat(numfilas-fila);
            var asteriscos = "*".repeat(2*fila-1);
            System.out.println(espaciosblanco + asteriscos);
        }
    }
    
}
