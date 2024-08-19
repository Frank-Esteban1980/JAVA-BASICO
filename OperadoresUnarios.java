/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores_Format;

public class OperadoresUnarios {

    
    public static void main(String[] args) {
        
        System.out.println("Operadores Unarios");
        
        int a=3, b = -2, resultado;
        var c = true;
        
        //operador unario positivo
        
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        
        resultado = a++;
        System.out.println("resultado a++ = " + resultado);
        
        
        //operador unario negativo
        
        resultado = -a;
        System.out.println("resultado -a  = " + resultado );
        
        // operacores unarios de incremento o decremento
        
        var x = 5;
        resultado = ++x;   //primero se incrementa el valor
        System.out.println("resultado ++x = " + resultado);
        
        resultado =--x;
        System.out.println("resultado --x = " + resultado);
        
        resultado = x--;
        System.out.println("resultado x-- = " + resultado);
    }
    
}
