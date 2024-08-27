/* 91-92
Programa que reconoce el mes y asigna la estación del año, con meses enumerados de 1 a 12
  */
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_EstacionesAño {

   
    public static void main(String[] args) {
        // Pedimos un número del mes al usuario
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Di el número del mes: ");
        int mes = sc.nextInt();
        
        //con if validamos el número y pedimos que imprima la estación a la que corresponde
        if(mes==1||mes==2||mes==12){
            System.out.println("El mes "+mes+" está en INVIERNO");
        }
        if (mes==3||mes==4||mes==5){
        System.out.println("El mes "+mes+" está en PRIMAVERA");
        }
        if(mes==6||mes==7||mes==8){
            System.out.println("El mes "+mes+" está en Verano");
        }
        if(mes==9||mes==10||mes==11){
            System.out.println("El mes "+mes+" está en OTOÑO");
        }else{
            System.out.println("El número que indicas desbe ser entre el 1 a 12");
        }
        
        
    }
    
}
