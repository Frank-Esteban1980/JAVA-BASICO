/* UNIVERSIDAD JAVA 114 UDEMY
Protrama que muestre un menú de Abrir cuenta, Eliminar cuenta, Salir de la cuenta.
- 
  */
package bucles_for_y_while;

import java.util.Scanner;


public class MenuIterativo {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var salir = false;
        
        //Iteración del menú
        
        while(!salir){
            System.out.println("""
                               *** Sistema de Administración de Cuenta ***
                               Menu:
                               1. Crear cuenta
                               2. Eliminar cuenta
                               3. Salir  
                               
                               Seleccione una opción \s
                               """);
            var opcion =sc.nextInt();

            //Evaluar las opciones
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta ...\n");
                case 2 -> System.out.println("Eliminando tu cuenta ...\n");
                case 3 -> {
                    System.out.println("Saliendo ...\n");
                    salir=true;
                }
                default -> System.out.println("Opción erronea.");
            }
            
            System.out.println("Fin de la sesión.");
        }
        
    }
    
}
