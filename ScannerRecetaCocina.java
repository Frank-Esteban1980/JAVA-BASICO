/*
 ingresar el nombre del plato,  los ingredites, tiempo de cocción, difuculta (facil, media alta*/
package Operadores_Format;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class ScannerRecetaCocina {

    
    public static void main(String[] args) {
        System.out.println(" *** RECETA DE COCINA ***");
        
        var consola = new Scanner(System.in);
        
        System.out.println("Indicar el nombre del plato: ");
        String nombrePlato = consola.nextLine();
        
        System.out.println("Indicar los ingredientes principales: ");
        String ingrediente1 = consola.nextLine();
        String ingrediente2 = consola.nextLine();
        String ingrediente3 = consola.nextLine();
        
        System.out.println("Tiempo de preparación en minutos: ");
        int minutos = Integer.parseInt(consola.nextLine());
        
        System.out.println("Difucultad (Fácil, Medio, Difícil: ");
        String dificultad = consola.nextLine();
        
        System.out.println("  ****  RECETA DE "+ nombrePlato +" ***  ");
        System.out.println("\tIngredientes: "+ingrediente1 + " - "+ ingrediente2 +"-"+ingrediente3);
        System.out.println("\tTiempo Preparación: "+minutos+ " minutos.");
        System.out.println("\tDificulatad: "+dificultad);
        
        
        
    }
    
}
