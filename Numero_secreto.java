/* NUMERO SECRETO
 Programa para que el usuario adivine un número generado aleatoriamente:
- Debe crearse un número secreto
- Pedir al usaurio que adivine el número, se guarde en una variable
- Comparar el número del usuario con el secreto
- Informar al usuario si es correcto o incorrecto
- Incorrecto, indicar si es mayor o menor que el número secreto
- Si es incorrecto indicar los intentos que lleva cada vez que vuelva a intentarlo
- Correcto, felicitar al usuario
*/
package bucles_for_y_while;
import java.util.Random;
import java.util.Scanner;

public class Numero_secreto {

    
    public static void main(String[] args) {
        
        System.out.println("*** ADIVINAR EL NÚMERO SECRETO ***");
        //Métodos Scanner y Random, una vez importados
        Scanner sc = new Scanner(System.in);
        var aleatorio = new Random();
        // Creamos el número secreto con el método Random,
        // Random cominenza en 0 por eso aumentamos 1 para que vaya de 1 a 10
        int secreto = aleatorio.nextInt(30)+1;
        final int INTENTOS_MAX = 3;
        int intentos = 0; //contará los intentos realizados, empezamos en 0
        int adivinado = 0;
        
        // Verficar si numero secreto erróneo avisar si es mayor o menor al secreto
        // revisar que el número de intentos máximo no es superado
        
        while (adivinado != secreto && intentos<INTENTOS_MAX){
            System.out.println("Adivina el número entre 1 y 10 -> ");
            adivinado = sc.nextInt();
            
        //Informamos al usuario si el secreto es mayor o menor a su número
        if(adivinado < secreto){
            System.out.println("Secreto es mayor  ^^^");
        }else if(adivinado > secreto){
            System.out.println("Secreto es menor vvv");
        }
       //incrementar los intentos de uno en uno conforme de más números
       intentos++;
        }
        //Acierto final o no conseguido superando intentos
        if(adivinado == secreto){
            System.out.println("Enhorabuena, lo has conseguido\n");
            System.out.println("Conseguido en "+intentos);
        }else{
            System.out.println("Game over. Intentos superados "+INTENTOS_MAX);
            System.out.println("El número secreto era "+secreto);
        }
    }

    
    
}
