/* UNIVERSIDAD JAVA 125 - 131 - UDEMY

Un array es una esctructura de datos que permite almacenar múltiples elementos del mismo tipo   
en una secuencia continua de memoria.
Sintaxis:

definir array

    tipoDato[] nombreArray;

inicializar array
    nombreArray = new int[5];


*/
package Arrays_arreglos;

import java.util.Scanner;


public class Arryas_conceptos {

    
    public static void main(String[] args) {
        // 1. Declarar un array
        
        int[] enteros;
        
        //2. Inicializar o dar un espacio de memoria o asiganar un valor
        enteros = new int[5];
        // Se crean tres puestos o stack o pila con valor 0 porque es int en cada heap o índice de la memoria
        
        // 3. Declarar e inicialiazar el array en una línea
        int[] numeros = new int[4];
        
        // 4.Modificar los valores de una array
        
        enteros[0] = 1975;
        enteros[1] = 1991;
        enteros[2] = 1980;
        enteros[4] = 1987;
        enteros[3] = 2009;
        
        
        numeros[0] = 11;
        numeros[1] = 2;
        numeros[2] = 1;
        numeros[3] = 9;
        
        // 4. Sintaxis simplificada
        
        int[] years = {1975, 1980,1987,1991,2009};
        int[] months= {11, 2, 9, 1, 11};
        
        // 5. Lectura de VALORES de un Arreglo
        
        System.out.println("Año ~ "+enteros[0]);
        System.out.println("Año ~ "+enteros[1]);
        System.out.println("Año ~ "+enteros[2]);
        System.out.println("Año ~ "+enteros[3]);
        System.out.println("Año ~ "+enteros[4]);
        
        System.out.println("Mes ~ "+numeros[0]);
        System.out.println("Mes ~ "+numeros[1]);
        System.out.println("Mes ~ "+numeros[2]);
        System.out.println("Mes ~ "+numeros[3]);
        
        
        // 6. Iterando arrays
        
        // length muestra el largo de elementos de un array
        
        int largoEnteros=enteros.length;
        int largoNumeros=numeros.length;
        
        int largoYears=years.length;
        int largoMonths = months.length;
        
        //Con for podemos iterar sobre los elementos de un array
        System.out.println("Array enteros");
        for (int i= 0; i<largoEnteros; i++ ){
            System.out.println("Año "+enteros[i]);
        }
        System.out.println("Arrya Years");
        for (int i = 0; i<largoYears; i++){
            
            System.out.println("Year "+ years[i]);
        }
        
        
//También se puede iterar sobre dos array teniendo en cuenta que hay dos índices que mostrar
        for (int i = 0; i<largoYears; i++){
            
            System.out.println("Year "+ years[i]);
        }
        for (int j = 0; j<largoMonths; j++){
            
            System.out.println(" - Month "+ months[j]);
        }
        
        /*
        for (int i=0; i<largoEnteros; i++){
            for(int j=0; j<largoNumeros; j++){
                System.out.println("Año "+enteros[i]+" Mes "+numeros[j]);
            }
        }*/
        
        String[] nombresHermanos = {"Frank", "Fernando", "María", "Ximena"};
        String[] apellidos = {"Escudero"};
        
        System.out.println("Array Nombres");
        for (int i = 0; i<nombresHermanos.length; i++){
              System.out.println("Nombre: "+nombresHermanos[i]);    
            }
        //Iterando los dos array nombres y apellido
        System.out.println("Array Nombres y Array Apellido");
        for (int i = 0; i<nombresHermanos.length; i++){
            for(int j=0; j < apellidos.length; j++){
            System.out.println("Datos: "+nombresHermanos[i]+" "+apellidos[j]+"\n");
            }}
         
        
        // 7. INTRODUCIR VALORES EN UN ARRAY
        
        //Crer el array paises con los datos que nos de el usuario
        
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el tamaño del array
        
        System.out.println("\nIndica cuántos paises quieres incluir en tu listado: \n");
        int largoPaises = sc.nextInt();
        
        //Creamos el array
        
        String[] paises = new String[largoPaises];
        
        //Pedimos al usuario los elementos del array
        
        for (int i=0; i < largoPaises; i++){
            System.out.print("\nIntroducir Pais ["+i+"]= ");
            paises[i] = sc.nextLine();
        }
        
        // Imprimir los valores del array
        System.out.println("\n *** PAISES ***");
        
        for (int i=0; i<largoPaises; i++){
            System.out.print("\nPais:["+i+"] = "+paises[i]+ "\n");
        }
    }
    
}
