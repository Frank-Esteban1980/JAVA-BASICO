/* video 68
 Programa que emita un ticket de compra.
Se indicará el precio de cada producto con decimales
El usuario indicará la cantidad
El ticket dará esta información y el total con impuestos  21% IVA */
package Operadores_Format;

import java.util.Scanner;

/**
 Tendremos 3 productos:
 * cuadernos por 2,50€,
 * boligrafos 1.23€
 * y mochilas 33.50€
 */
public class OperadoresTicketCompra {

    
    public static void main(String[] args) {
       
        
        
        //Creamos unas varibles de productos con precio
        
        Double precioCuadernos = 2.55;
        Double precioBoligrafos = 1.25;
        Double precioMochila = 33.99;
        
        //El uaurario debe indicar que producto compra y cuántos lleva
        Scanner sc = new Scanner (System.in);
                
        System.out.println("Cuántos cuadernos compra: ");
        int cantidadCuadernos = sc.nextInt();
        System.out.println("Cuántos bolígrafos compra: ");
        int cantidadBoligrafos = sc.nextInt();
        System.out.println("Cuántas mochilas compra: ");
        int cantidadMochilas = sc.nextInt();
        
        
        //Calculamos subtotales
        System.out.println("\t\t------ TICKET DE COMPRA ------");
        
        System.out.println("\n-- \t Precio \t Cantidad  \t\tSubtotal");
        System.out.println();
        Double subtotalCuadernos = cantidadCuadernos * precioCuadernos;
        System.out.println("-- \t " + precioCuadernos+ " € \t\t "+ cantidadCuadernos + " Cuadernos\t\t"+ subtotalCuadernos+ "€");
        Double subtotalBoligrafos = cantidadBoligrafos * precioBoligrafos;
        System.out.println("-- \t " + precioBoligrafos+ " € \t \t"+ cantidadBoligrafos + " bolígrafos\t\t"+ subtotalBoligrafos+ "€");
        Double subtotalMochilas= precioMochila * cantidadMochilas;
        System.out.println("-- \t " + precioMochila+ " €\t\t"+ cantidadMochilas + " mochilas\t\t"+ subtotalMochilas+ "€");
        Double totalCompra = subtotalCuadernos + subtotalBoligrafos + subtotalMochilas;
        System.out.println(" ----------- TOTAL COMPRA sin IVA:  "+ totalCompra+ "€ ");
          
        //System.out.printf("Precio Cuadernos: %.2f  \tCantidad: %s \tSubtotal Cuadernos: %.2f%n",precioCuadernos, cantidadCuadernos, subtotalCuadernos);
        
       // System.out.printf("Nombre: %s \nEdad: %d \nSalario: %.2f%n",nombre, edad, salario);
       
       System.out.println("Aplicar el descuento del: ");
       Double descuento = sc.nextDouble();
       Double descuentoImporte = totalCompra * ((descuento/100));
       Double totalDescuento = totalCompra-descuento;
       
       Double impuesto = totalDescuento * 0.21;
       Double facturaIva = totalDescuento + impuesto;
       
        
        
    
       System.out.printf("""
                %n
                ---------------
                Total compra: %.2f€
                Total a descontar: €%.2f€
                Impuesto (16%%): %.2f€
                Costo total de la compra: %.2f€
                %n---------------""",totalCompra, descuentoImporte, impuesto, facturaIva);
    
    }
    
}
