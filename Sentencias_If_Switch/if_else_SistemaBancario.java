/*83
 En un sistema bancario, solicitar al usaurio si desea continuar en el sistema
- Usar el operador NOT para aplicar la lógica inversa cumpliendo las siguientes condiciones:
-- si no se quiere salir del sistema, imprimir "Continuamos dentro del sistema"
-- si queremos salir del sistema, imprimir "Saliendo del sistema"
*/
package Sentencias_If_Switch;

import java.util.Scanner;

public class if_else_SistemaBancario {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Para salir en el sistema pulsa 0");
        int salir = sc.nextInt();
        
        if (salir != 0){
            System.out.println("Continuamos dentro del sistema");
        }else{
            System.out.println("Saliendo del sistema");
        }
        
        System.out.println("*** SISTEMA BANCARIO ***");
        
        System.out.println("Salir del sistema true/false");
        Boolean salirSistema = sc.nextBoolean();
        
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        }else{
            System.out.println("Saliendo del sistema");
        }
        
    }
    
}
