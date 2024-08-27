/*
 76
Verificar si es mayor de edad, mayor de 18 años*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class If_mayorEdad {

    
    public static void main(String[] args) {
       //Pedimos la edad al usuario con Scanner y la guardamos en la variable int edad
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime tu edad: ");
       int edad = sc.nextInt();
        System.out.println("Tu edad es de " + edad + " años." );
       
        // validamdos si edad es mayor de 18 imprime eres mayor de edad
       if (edad >= 18){
        System.out.println("Eres mayor de edad.");
        //sino else imprime no eres menor de edad
       }else{
        System.out.println("Eres menor de edad.");}
       
    }
    
}
