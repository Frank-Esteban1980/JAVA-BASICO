/* UNIVERSIDAD JAVA 132 -133 UDEMY
 *Se pide crear un programa que pida las calificaciones
Callcular la media de las calificaciones recibidad
- Imprimir tanto las calificaciones
- Imprimir el promedio
*/
package Arrays_arreglos;

import java.util.Scanner;


public class Array_Calificaciones {

    
    public static void main(String[] args) {
        // Pedimos al usuario la cantidad de calificaciones que va a tener
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantas calificaiones tienes: ");
        int notas = sc.nextInt();
        //Creamos el array de libroNotas con la cantidad de notas a introducir
        int[] libroNotas = new int[notas];
        
        //Pedirmos al usuario las notas a y lo guardamos en el array
        
        for(int i=0; i<notas; i++){
            System.out.println("Introduca la nota ["+i+"]= ");
            libroNotas[i]= sc.nextInt();
        }
        
        //Imprimimos las notas facilitadas
        System.out.println("\n *** Tus Notas ***");
        for(int i=0; i<notas; i++){
            System.out.println("Nota ["+i+"] ="+libroNotas[i]);
        }
        
        //Operamos con los elementos del array para conocer el promedio
        System.out.println("\n ** Tu Promedio ***");
        Double sumaNotas =0.;
        //Iteramos con cada elemento sumándolo y guardándolo en la variable sumaNotas
        for(int i=0; i<libroNotas.length; i++){
            sumaNotas += libroNotas[i]; //suma el valor almacenado con el siguiente valor
            
        }
        
        Double promedio = 0.;
        promedio = sumaNotas/notas;
        System.out.println("Tu promedio es "+promedio);
        
    }
    
}
