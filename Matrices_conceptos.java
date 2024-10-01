/* UNIVERSIDAD JAVA 134, 135, 136 - 137- 138- 139 - UDEMY
Una matriz es un arreglo de 2 dimensiones de columnas (indice i) y filas (indice j) 

(i, j)

0,0  0,1 0,2
1,0  1,1 1,2
2,0  2,1 2,2

La matriz se guarda en la memoria stack, y apunta al mismo tiempo a la memoria hip a dos arrays 
que es la que lo forman, cada una con sus índices.

Es decir es un array de arrays.
*/
package Matrices;

/**
 *
 * @author FRANK
 */
public class Matrices_conceptos {

    
    public static void main(String[] args) {
        // 1. Definir la matriz
        int[][]matriz = new int[2][3];  //Definida la matriz reservando espacio de memoria (para 2,3) sin elementos, tipo int
        
        // 2. var matriz = new int[2][3]; // con un tipo no explicito
        
        // 3. rellenamos la matriz con valores
        System.out.println("RELLENAR MATRICES Y MOSTRAR");
        
        matriz[0][0] = 9;
        matriz[0][1] = 4;
        matriz[0][2] = 6;
        
        matriz[1][0] = 1;
        matriz[1][1] = 3;
        matriz[1][2] = 5;
        
        // 4. accedemos a los valores
        
        System.out.println("\nPosicion [1][1] = "+matriz[1][1]);
        System.out.println("\nPosición [0][2] = "+matriz[0][2]);
        System.out.println("\nPosicion [1][2] = "+matriz[1][2]);
        
        // 5. Recorrer matriz con ciclo for anidado
        System.out.println("\n5. RECORRER MATRIZ");
        
        final var FILAS = 2;
        final var COLUMNAS = 3;
        // Definimos matriz
        int[][] matrizA = new int[FILAS][COLUMNAS];
        
        matrizA[0][0] = -9;
        matrizA[0][1] = -4;
        matrizA[0][2] = -6;
        
        matrizA[1][0] = -1;
        matrizA[1][1] = -3;
        matrizA[1][2] = -5;
        
        //Para recorrer la matriz necesitamos 2 índices
        //Cramos un ciclo for externo para recorrer las filas
        for(int f=0; f<FILAS; f++){
            //Cramos un ciclo for interno que recorrerá las columnas
            for(int c=0; c<COLUMNAS; c++){
                System.out.println("\nValor ["+f+" ]["+c+"] -> "+matrizA[f][c]);
             }
        }
        
        /* 6. Sintaxis simplificada de matrices. En el momento que definimos la matriz
        se puede asignar los elementos
        
        */
        System.out.println("\n **** Matris PAIS ****");
        
        var matrizS = new String[][] {
                    {"España","Francia","Alemania"},
                    {"Cánada","Estados Unidos","Méjico"},
                    {"China","India","Australia"},
                    {"Chile","Argentina","Colombia"},
                    {"Nigeria","Camerum","SuthAfrica"}
                
        };
        //para recorrer las matrices utilizamos la función lenght para que el límite sea el total de elementos
        for(int p = 0; p < matrizS.length; p++){
            //Para las columnas buscamos el largo del arreglo de las columnas en la fila que estamos iterando
            for(int cap = 0; cap < matrizS[p].length; cap++){
                System.out.println("\nValor [" +p+ "][" +cap+ "] -> "+matrizS[p][cap]);
            }
            
        }
        
             
        
    }
    
}
