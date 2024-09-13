/* 105 UDEMY
Programa que indique los números pares 

*/
package bucles_for_y_while;


public class while_NumeroPar {

    public static void main(String[] args) {
        // creamos un contador 
        int i = 1;
        //elegimos un rango máximo de número
        while (i <= 20){
            // validamos que i tenga 0 en el residuo de la división
            if(i%2==0){
                System.out.println("El número "+i+" es par.");
            }//aumentamos 1 en cada contador
            i++;
        }
    }
    
}
