/* 81 - 82
Crear un programa que revise si:
un cliente compra más de 1000€ y es socio y aplique un descuento del 10%
si solo es socio aplique un 5%
sino el descuento es 0%
 */
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_descuentoTienda {

    
    public static void main(String[] args) {
        
        //Preguntamos si es miembro de la tienda
        final int MONTODESCUENTO = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres socio true / false:");
        Boolean socio = sc.nextBoolean();
        
        //Importe de compra
        System.out.println("Importe total de compra: ");
        int totalCompra = sc.nextInt();
        
        if ((totalCompra > MONTODESCUENTO) && (socio=true)){
            System.out.println("\nTienes un 10% de descuento");
            var descuento = totalCompra * 0.10;
            System.out.println("Descuento = " + descuento);
            var TotalDescuento = totalCompra * 0.90;
                System.out.println("TotalDescuento = " + TotalDescuento+" €");  
        }
        else if(socio){
            System.out.println("\nTienes un 5% de descuento");
            Double descuento = totalCompra *0.05;
            System.out.println("Descuento = "+descuento);
            var TotalDescuento = totalCompra * 0.95;
                System.out.println("TotalDescuento = " + TotalDescuento+" €");
        }
        else{
            System.out.println("\nTu compra total es de "+totalCompra+ " €");
        }
    }
    
}
