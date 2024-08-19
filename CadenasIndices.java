/* 34
 Se puede acceder a cada uno de los caracteres de un String según la posición del elemento */
package Operadores_Format;

/**
 *
 * @author FRANK
 */
public class CadenasIndices {
    
    public static void main(String[] args) {
      
        //manipulación de índices en una cadena
        
        var cadena = "hola mundo";
        
        
        
        //recuperar caracteres de cadena por su índice
        
        var primerCaracter = cadena.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        
        var secondCaracter = cadena.charAt(1);
        System.out.println("secondCaracter = " + secondCaracter);
        
        var ultimoCaracter = cadena.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        var letraM = cadena.charAt(5);
        System.out.println("letraM = " + letraM);
        
    }
    
}
