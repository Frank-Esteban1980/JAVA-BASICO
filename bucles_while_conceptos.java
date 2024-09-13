
/* UDEMY 103 -104
Los bucles se usan para ejecutar de manera repetitiva un bloque de código siempre y cueando cumpla una condición
Tenemos while, do while y for

WHILE

Tiene una condición para que se ejecute el código y mientras la condición se cumpla, se repetirá la ejecución.
Puede darse el caso en el que no se llegue a ejecutar el bloque del código.

Sintaxis:
while (condición){
    codigo a ejecutar
}*/
package bucles_for_y_while;


public class bucles_while_conceptos {
    public static void main(String[] args) {
   // Queremos imprimir un listado de número hasta llegar al 10
        //inicializamos la variable
        System.out.println("--- Número del 1 al 10 ---");
        int i = 1;
        while (i<=10){   //condición solo i es menor o igual a 10
            System.out.println(i);   //entonces imprimimos
            i++;    //aumentamos 1 a la i para que vuelva a empezar a validar la condición, parando cuando llegue a 10
        }
        
    // Imprimir los número pares a la inversa
        System.out.println("*** Número pares al reves desde 20 *** ");
        i = 20;  // inicializamos en un número
        while(i>=0){   // limitamos para que el contador llegue al 0 y pare, por ser falso, evitando el infinito
            System.out.println(i);  // imprimimos i en cada momento
            i=i-2; //empezando con i 20 quitamos 2 para que sean número pares
        }
        
        
    //Números impares hasta el 20
        System.out.println("--- Número impares ---");
        int contador = 1;
        while(contador <= 20){
            System.out.println(contador);
            contador= contador+2;
            
    }
        // Mientras tengamos más de 38º dar alerta roja de ola de calor
        System.out.println("--- Temperatura Verano ---\n");
        
        int temperatura = 45;
        
        while(temperatura>=38){
            System.out.println("Alerta roja, ola de calor -> "+temperatura+"º\n");
            temperatura=temperatura-1;
        }
        System.out.println("Fin ola de calor -> "+temperatura+"º");
    
    }
}
