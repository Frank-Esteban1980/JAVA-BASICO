/* 36 METODOS PARA USAR CON CADENAS
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores_Format;


public class CadenasMetodos {

    
    public static void main(String[] args) {
     
        var diario = "Vive cada día como si fuera el último...OOO";
        
        //LONGITUD de una cadena lenght()
        var logintud = diario.length();
        System.out.println("logintud = " + logintud);
        
        // REEMPLAZAR CARACTERES
        
        var reemplazarDiario = diario.replace('o', 'e');
        System.out.println("reemplazarDiario = " + reemplazarDiario); 
        
        //CONVERTIR A MAYÚSCULAS y  MINUSCULAS
        
        var mayusculas = diario.toUpperCase();
        System.out.println(mayusculas);
        
        System.out.println(diario.toLowerCase());
        
        //ELIMINAR ESPACIOS AL FINAL O INICO
        
        var cadena2 = "   LEON Y PUMBA    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
        
        
        
    }
    
}
