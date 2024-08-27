/*97
 Programa para convertir una nota numérica (0 a 10) en una calificación (suspenso a sobresaliente
*/
package Sentencias_If_Switch;

import java.util.Scanner;

public class switch_Calificaciones {

  
    public static void main(String[] args) {
        // Pedimos la nota al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota: ");
        int nota = sc.nextInt();
        
        String Calificacion;
        
        Calificacion = switch(nota){
            
            case 0,1,2,3,4 -> " SUSPENSO ";
            case 5 -> " SUFICIENTE ";
            case 6-> " BIEN ";
            case 7-> " NOTABLE ";
            case 8-> " NOTABLE ";
            case 9,10 -> " SOBRESALIENTE ";
            default -> "La nota debe estar entre 1 y 10";
        };
        System.out.println("Tienes la nota de "+nota+ " tu calificaciónes un "+Calificacion);
        
        
    }
    
}
