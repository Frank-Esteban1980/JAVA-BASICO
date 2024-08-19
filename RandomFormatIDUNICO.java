/* 53 - 54 
 Programa que genere un IDUNICO para cada persona. 
el programa pide nombre, apellido y año nacimiento.
el protrama debe generar un ID aleatorio de 4 dígitos entr  1 - 9999,
se completan con 000 a la iziquierda
El resultado debe ser unir:
las dos primeras letras de nombre + las 2 del apellido + las dos ultimas de año
y el número aleatorio.
Ejempo JUPE950736*/
package Operadores_Format;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class RandomFormatIDUNICO {

    
    public static void main(String[] args) {
        
        System.out.println(" *** SISTEMA GENERADOR DE ID UNICO *** ");
       //pediomos nombre, apellido y año de nacimiento 
       Scanner escaner = new Scanner(System.in);
       
        System.out.println("Indica tu nombre: ");
        var nombre = escaner.nextLine();
        System.out.println("Indica tu apellido: ");
        var apellido = escaner.nextLine();
        System.out.println("Indica tu año de nacimiento: ");
        var nacimiento = escaner.nextLine();
        
        //calculamos un número aleatorio entre 1 - 9999
        Random aleatorio = new Random();
        var numeroAleatorioFormato = aleatorio.nextInt(9999)+1;
        
        // Normalizar o capturar los valores necesarios
        var nombreCod = nombre.trim().toUpperCase().substring(0, 2);  // limpiar espacios, a mayuscualas y usar 2 primeras posiciones
        var apellidoCod = apellido.trim().toUpperCase().substring(0,2);
        var nacimCod = nacimiento.trim().substring(2);
        
        
        // Formato de 4 digitos
        var codigoAleatorio = String.format("%04d", numeroAleatorioFormato);
        
        // Generar el ID Único
        var idUnico = nombreCod + apellidoCod + nacimCod + codigoAleatorio;
        
        // Imprimir el ID unico
        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades!
                """, nombre, idUnico);
    }
    
}
