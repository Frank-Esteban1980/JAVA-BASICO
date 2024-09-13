/* UDEMY 109
Programa que imprima los número impares de un rango (1 a 20) */
package bucles_for_y_while;


public class dowhile_impares {

    
    public static void main(String[] args) {
        // ponemos el contador al inicio
        System.out.println("--- IMPARES ---");
        
        int contador = 1;
        // Primera impresión imprimir si el número es impar (cálculo con if)
        do{
            if (contador%2!=0){
            System.out.print(contador+" ");
            }
            //vamos aumentando el contador de 1 en 1
            contador++;
            //le ponemos un límite hasta el que imprimirá
        }while(contador<=20);
    }
    
}
