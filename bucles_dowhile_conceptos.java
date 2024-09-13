/* 107 UDEMY
DO WHILE
Estructura de control que permite ejecutar un bloque de código al menos una vez y luego repetir
la ejecución del bloque siempre que la condición a evaluar se cumpla.

Sintaxis:

do{
    bloque de código
} while (condición);

*/
package bucles_for_y_while;

public class bucles_dowhile_conceptos {

    public static void main(String[] args) {
        // Imprimir los números sin superar 3, el primer número a imprimir siempre será 1
        var i = 1; //declaramos contador
        //creamos do para que imprima el contador, y no tiene condición, por lo que imprimirá el primero
        do{
            System.out.println(i);
            i++;   //aumentamos 1 al contador 
        }while(i<=3);  //después de imprimir la primera vez, indicamos que lo haga hasta 3
     

    //AVISO NOTAS. Programa que imprima aviso si las notas está por debajo de 6
        int notas=1;

        do{
            System.out.println("Es un aviso para mejorar tus notas. "+i);
            notas++;
        }while(notas<=6);
    }
}
