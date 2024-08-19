/* VIDEO 47
 Pedir información de un empleado, los datos se introducirán por consola (Nombre, edad, salario, es jefe?
luego imprimir todos */
package Operadores_Format;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class ScannerSistema_empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE EMPLEADOS. ***");
        
        var consola = new Scanner(System.in);
        
        
        //Nombre empleado y con escaner y nextline guardamos en una variable
        System.out.println("Nombre Empleado: ");
        var nombreEmpleado = consola.nextLine();
        
        System.out.println("Edad: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());
        
        System.out.println("Salario Empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());
        
        System.out.println("Es Jefe de Departamento? (true / false");
        var esJefe = Boolean.parseBoolean(consola.nextLine());
        
        
        //Imprimimos datos
        
        System.out.println("\n DATOS DEL EMPLEADO: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado+ " años.");
        System.out.println("\tSalario: "+salarioEmpleado);
        System.out.println("\tSalario: %.2f".formatted(salarioEmpleado)+ " €");
        System.out.println("\tJefe de Departamento?: "+esJefe);
          
    }
    
}
