/*
 Programa que da las opciones de realizar las funciones CRUD de SQL
CREATE
READ
UPDATE
DELETE*/
package bucles_for_y_while;

import java.util.Scanner;


public class Menu_crud {

  
    public static void main(String[] args) {
        // El usuario da la orden por consola
        
        Scanner sc = new Scanner (System.in);
        //Creamos una variable que termine con las acciones
        var delete = false;
        
        //Iniciamos el bucle, mientras el no se elija delete, el usuario podrá crear, actualizar o leer la BD
        //Es decir el bucle continuará mientras delte sea false
        
        while (!delete){
            System.out.println("""
                                *** Opciones SQL ***\n
                                Qué desea hacer con sus datos

                                1. Crear una tabla
                                2. Actualizar una tabla
                                3. Leer una tabla
                                4. Borrar una tabla\n                            

                                """);
        int comando = sc.nextInt();
        
        /*El usuario elege el comando que quiere utilizar y se verifica para dar la orden de salida
        
        */
        switch(comando){
            case 1 -> System.out.println("Creando tabla\n");
            case 2 -> System.out.println("Actualizando tabla\n");
            case 3 -> System.out.println("Lectura de tabla\n");
            case 4 -> {  //en este último caso delete se hace verdad, terminando el bucle
                System.out.println("Borrando tabla\n");
                delete = true;
            }
        }}
        
    }
    
}
