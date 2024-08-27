/* 85
El operador ternario se forma de:
condición: expresión booleana que se evalua true o false
expresión1, si es true devuelve un resultado
expresión 2, si es false devuelve otro resultado

sintaxis:
condición ? expresión1 : expresión2

*/
package Sentencias_If_Switch;

import java.util.Scanner;

public class OperadorTernario {

    
    public static void main(String[] args) {
        // 1. verificar si uno números son pares o impares
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número: ");
        int numero = sc.nextInt();
        
            //operado ternario:
        var Tipo= (numero%2 == 0)? "Par": "Impar";
        System.out.println("Tipo de número = " + Tipo);
        
        // 2. verificar si es mayor de edad
        
        System.out.println("Di tu edad: ");
        int edad = sc.nextInt();
            //operado ternario:
        
        var mayorEdad = (edad>=18)? "Mayor de Edad" : "Menor de Edad";
        System.out.println("Tienes "+edad+ " años, eres "+mayorEdad);
        
        
        // 3. Verificar si un numero es positivo noegativo o 0. Se anida el operador ternario
        
        System.out.println("Di un número: ");
        int num = sc.nextInt();
        
        var positivo = (num>0)? "Positivo" : (num<0)? "Negativo" : "Cero";
        System.out.println("El numero es "+positivo);
        
        
        //4. MAYOR DE DOS NÚMEROS
        var num1 = 10;
        var num2 = 20;
        var mayor = (num1 > num2) ? num1 : num2;
        System.out.println("El mayor de " + num1 + " y " + num2 + " es " + mayor);
        
        //5. ASIGNAR UN DESUENTO A UN SOCIO 10% SINO 5%
        
        var esSocio = true;
        var descuento = esSocio ? 0.1: 0.05;
        System.out.println("Tienes un descuento del "+(descuento*100)+"%");
    }
    
}
