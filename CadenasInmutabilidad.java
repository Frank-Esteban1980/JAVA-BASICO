/*
35 INMUTABILIDAD DE CADENAS
Creada un cadena, los caracteres de ella no puedes ser modificados
Si deseamo modificar una cadena, hay que crear un nuevo objeto string y asignarlo a nuestra
variable. No se modifica, se crea una nueva
*/
package Operadores_Format;

/**
 *
 * @author FRANK
 */
public class CadenasInmutabilidad {

    
    public static void main(String[] args) {
       
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        
        
        cadena1 = "AdioS";
        System.out.println("cadena1 = " + cadena1);
    }
    
}
