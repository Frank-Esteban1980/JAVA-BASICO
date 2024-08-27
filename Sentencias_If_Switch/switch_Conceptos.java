/* 93 - 94
SWITCH
Permite seleccionar una opción de entre varias posibles:

SINTAXIS CLÁSICA: 

switch(condición a evaluar){
case 1 : 
    sentencia a ejecutar
    break;
case 2 : 
    sentencia a ejecutar
    break;
 case 3 : 
    sentencia a ejecutar
    break;
default:  //// es opcional
    sentencia a ejecutar
}


*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class switch_Conceptos {

   
    public static void main(String[] args) {
        //Programa que pida un número de día de la semana y devuelva el nombre del día (lunes es 1)
        Scanner sc =new Scanner(System.in);
        System.out.println("Di un número de día: ");
        int numDia = sc.nextInt();
        
        switch(numDia){
            case 1 : 
                System.out.println("El día "+numDia+" es lunes");
                break;
            case 2 : 
                System.out.println("El día "+numDia+" es martes");
                break;
            case 3 : 
                System.out.println("El día "+numDia+" es miércoles");
                break;
            case 4 : 
                System.out.println("El día "+numDia+" es jueves");
                break;
            case 5 : 
                System.out.println("El día "+numDia+" viernes");
                break;
            case 6 : 
                System.out.println("El día "+numDia+" es sábado");
                break;
            case 7 : 
                System.out.println("El día "+numDia+" es domingo");
                break;
            default:
                System.out.println("El número debe ser de 1 a 7");
        }
        
    }
    
}
