/* Programa que de las opciones de una cjaero automático
1 Consultar saldo y de saldo inicar de 15000€
2 Retirar, pregunté cuanto quiere retirar, restar y diga el saldo nuevo
3 Depositar, preguntar cunánto deposita, sumar y diga el nuevo saldo
4. Salir, diciendo el saldo actual
*/
package bucles_for_y_while;

import java.util.Scanner;

public class Menu_CajeroAutomatico {

    public static void main(String[] args) {
        // Abrir una consoloa para que el usuario ingreso las opciones.
        //Crear variable saldo incial
        //variable salir que sea falso
        
        Scanner sc = new Scanner(System.in);
        var salir = false;
        Double saldo = 15000.;
        
        while(!salir){
            System.out.println("""
                               *** Opciones Cajero Automático
                               1. Consultar Saldo de cuenta
                               2. Retirar dinero
                               3. Ingresar dinero
                               4. Salir
                               """);
            var operacion = sc.nextInt();
            
            switch(operacion){
                case 1 -> System.out.printf("Saldo actual: %.2f€%n",saldo);
                case 2 ->{
                    System.out.println("Importe a retiar: ");
                    Double retirada = sc.nextDouble();
                        if(retirada<=saldo){
                            saldo = saldo - retirada;
                            System.out.printf("Saldo actual: %.2f€%n ",saldo);
                        }else{
                            System.out.println("Saldo insuficiente");
                        }
                        }
                
                case 3 -> {
                    System.out.println("Importe a ingresar: ");
                    Double ingreso = sc.nextDouble();
                    saldo = saldo + ingreso;
                    System.out.printf("Saldo actual: %.2f€%n",saldo);
                }
                case 4 ->{
                    System.out.println("Tu saldo actual: "+saldo);
                    System.out.println("Saliendo");
                //Cambiamos salir a verdad para que termine el bucle
                salir=true;
            }
            }
        }
         
    }
    
}
