/* 78 - 79 if, else if, else
 revisar  según la edad que diga el usuario si es niño, adolecente o mayor de edad*/
package Sentencias_If_Switch;

import java.util.Scanner;

public class if_variasEdades {

    
    public static void main(String[] args) {
       
        // pedimos la edad con scanner para guardar en la variable edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica tu edad: ");
        int edad = sc.nextInt();
        
        //comprobamos que se cumpla la primera condición, si se cumple termina.
        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
        }
        //si no se ha cumplido la primera condición pasa a la segunda si es true, se ejectua, sino va a la tercera
        else if (edad >=13 && edad<18){
            System.out.println("Eres un adolecente.");
        }
        
        // como no cumple ninguna condicion anterior ejecuta al del else
        else{
            System.out.println("Eres un niño.");
        }
        
        
    }
    
}
