/*Aplicanción para crear CONTRASEÑA
- Pedir al usuario una contreseña guardar en variable
- Tiene que comprobarse que tiene 6 caracteres
*/
package bucles_for_y_while;
import java.util.Scanner;

public class Creacion_validacion_password {

    
    public static void main(String[] args) {
        // Pedimos al usuario una nueva contraseña
        
        System.out.println("Validación de contraseña\n");
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu contraseña de 6 caracteres: ");
        var password = sc.nextLine();
        
        //Validar el passwor de 6 o más caracteres, leemos el largo del String
        //var largo = password.length();
        while (password.length() < 6){
            System.out.println("La contraseña debe tener más de 6 caracteres. Solo tiene "+password.length()+ " caracteres.");
            System.out.println("Ingresa una nueva contraseña: ");
            password = sc.nextLine();
        }
        
            }
    
}
