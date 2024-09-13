/*
Programa que da las opeciones abrir un archivo, guardar un archivo y salir del archivo
  */
package bucles_for_y_while;

import java.util.Scanner;


public class Menu_Archivo {

   
    public static void main(String[] args) {
        // El usuario de be elegir las opciones
        Scanner sc = new Scanner(System.in);
        var cerrar = false;
        
        //Mientras salir no se cumpla el usuario podrá elegir las opciones de abrir el archivo o guardar
        
        while(!cerrar){
            //Pedimos al usuario que selecion una opción
            System.out.println("""
                               +++ ARCHIVO +++\n 
                               1. Nuevo archivo
                               2. Abrir archivo
                               3. Guardar archivo
                               4. Cerrar \n                              
                               """);
            
            var opcion = sc.nextInt();
            //Evaluar las opciones que el usuario elija
            switch (opcion){
                case 1 -> System.out.println("Creando archivo...\n");
                case 2 -> System.out.println("Abriendo archivo ... \n");
                case 3 -> System.out.println("Guardando archivo...\n");
                case 4 -> { //en este último caso cerrar se hace verdad, terminando el bucle
                    System.out.println("\nCerrado");
                    cerrar = true;
                }
                default -> System.out.println("Elija una opción correcta.");
            }
            
        }
    }
    
}
