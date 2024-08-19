/* 64
 Se ofrece un descuente a clientes que compren 10 más artículos por día y además sean miembres de al tienda

*/
package Operadores_Format;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class OperadoresSistemaDescuento {

    
    public static void main(String[] args) {
        
        System.out.println("APLICA DESCUENTO");
        final var N_PRODUCTOS = 10;
        
        //Averiguar si el clientes tiene membresía
        
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Eres miembro de la tienda true / fales: ");
        var miembro = Boolean.parseBoolean(escaneo.nextLine());
                
        
        // revisar cuantos productos compra
        
        System.out.println("Cantidad de productos: ");
        var cantidadProductos = Integer.parseInt(escaneo.nextLine());  
        
        var descuento = miembro == true && cantidadProductos >= N_PRODUCTOS;
        System.out.println("SE APLICA EL DESCUENTO = > " + descuento);
        
        
    }
    
}
