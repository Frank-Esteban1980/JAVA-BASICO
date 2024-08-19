/* video 69
Crear dos constantes el USUARIO y PASSWORD y comprobar que el usuario introduce los datos correctos
*/
package Operadores_Format;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class OperadorAutenticarPasswd {

   
    public static void main(String[] args) {
       
        final var  USUARIO = "DENIS20019";
        final var  PASSWORD = 1109;
        Scanner sc = new Scanner (System.in);
        System.out.println("Indica tu usuario o nombre: ");
        var nombre = sc.nextLine();
        System.out.println("Indica tu número clave: ");
        int contrasenia = sc.nextInt();
        
        var accesoPermitido = nombre==USUARIO && contrasenia==PASSWORD;
        System.out.println("Acceso Permitido =>> " + accesoPermitido);
        
        //var datosCorrectos = nombre.equals(USUARIO) && contrasenia.equals(PASSWORD);
        
    }
    
}
