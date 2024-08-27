/*95
SWITHC MEJORADO
Permite utilizar una sictaxis más compatac y limpia. Soportan switch con múltiples
etiquetas de caso y bloque de texto.
Es un bloque de código. se usa el símbolo -> que indica lo que se retorna
Fuera del bloque se manda a imprimir el resultado de la opción correspondiente.
No se usa el break

*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class switch_DiasSemana {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número de día: ");
        int dia = sc.nextInt();
        
        switch(dia){        
        case 1 -> System.out.println("El día "+dia+" es lunes");
        case 2 -> System.out.println("El día "+dia+" es martes");
        case 3 -> System.out.println("El día "+dia+" es miércoles");
        case 4 -> System.out.println("El día "+dia+" es jueves");
        case 5 -> System.out.println("El día "+dia+" es viernes");
        case 6 -> System.out.println("El día "+dia+" es sábado");
        case 7 -> System.out.println("El día "+dia+" es domingo");
        default -> System.out.println("El número debe estar entre 1 y 7");
    }
        
        //otra opción es declarar el nombre de la salida
        //validar el nombre de salida en el switch con la condición de verificar el número
        //después del bloque pedir la impresión del nombre de la salida
        String nombreDia;
        
        nombreDia = switch (dia) {
        case 1 -> "Lunes";
        case 2 -> "Martes";
        case 3 -> "Miércoles";
        case 4 -> "Jueves";
        case 5 -> "Viernes";
        case 6 -> "Sábado";
        case 7 -> "Domingo";
        default -> "Día inválido";
        };
        System.out.println(nombreDia);
        
        
    }
}
