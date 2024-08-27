/* 99 - 100
Programa que calcula el importe total del envio de paquetes según el destino (nacional o internaciona)
Tendremos las tarifas: 
-- NACIONAL 5€ por kilo
-- INTERNACIONAL 10€ por kilo

Se pide al usuario el peso y el destino.

El albarán indicará los datos completos del envio y su precio

 */
package Sentencias_If_Switch;

import java.util.Scanner;

public class switch_EnvioPaquete {

   
    public static void main(String[] args) {
        
        //Creamos nuestras tarifas fijas para cada destino por kg
        final int NACIONALKG = 5;
        final int INTERNACIONALKG = 10;
        
        
        // Solicitamos al usuario el destino y el peso del paquete
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tipo envio (nacional o internacional");
        String tipoEnvio =sc.nextLine().strip().toLowerCase();
        System.out.println("Di el peso de tu paquete: ");
        int pesokg = sc.nextInt();
              
        int totalNacional = NACIONALKG * pesokg;
        int totalInternacional= INTERNACIONALKG * pesokg;
        
        switch(tipoEnvio){
            case "nacional":
                System.out.println("\n ***Total  Envio "+pesokg+"KG en evnio "+tipoEnvio+": \t"+totalNacional+"€");
                break;
            case "internacional":
                System.out.println("\n ***Total  Envio "+pesokg+" KG en evnio "+tipoEnvio+": \t"+totalInternacional+"€");
                break;
            default:
                System.out.println("Tiene que rellenar los campos correctamente");
        }
        
        
    }
    
}
