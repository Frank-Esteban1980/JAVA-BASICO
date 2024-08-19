/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores_Format;

public class formatCadenas {

    
    public static void main(String[] args) {
        
        System.out.println(" *** FORMATEO DE CADENAS ***");
        var nombre = "Denis";
        var edad = 30;
        var salario = 30500.25;
        
        //STRING.FORMAT nos pide algo en cadena que se verá, %s que significa que espera lo siguiente una cadena
        var mensaje = String.format("Nombre: %s \nEdad: %d \nSalario: %.2f €", nombre, edad, salario);
        System.out.println(mensaje);
        
        //PRINTF()
        
        System.out.printf("Nombre: %s \nEdad: %d \nSalario: %.2f%n",nombre, edad, salario);
        
        var numeroEmpleado = 12;
        // formateo con bloques de texto
        
        mensaje = """
                  %nDetalle Persona:\s
                  --------------------
                  \tNº Empleado: %04d
                  \tNombre: %s
                  \tEdad: %d
                  \tSalario: %.2f€
 
                """.formatted(numeroEmpleado, nombre, edad, salario);
        System.out.println(mensaje);
        
        
        //con PRINTF Y BLOQUE TEXTO
        
        System.out.printf("""
                  %nDetalle Persona:\s
                  --------------------
                  \tNº Empleado: %04d
                  \tNombre: %s
                  \tEdad: %d
                  \tSalario: %.2f€
 
                """, numeroEmpleado, nombre, edad, salario);
        
        
                
            
        
        
        
        
        
    }
    
}
