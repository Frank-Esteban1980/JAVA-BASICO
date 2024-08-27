/* 101 - 102 UDEMY

Programa que pide el usuario y la contraseña y da como resultados cuatro casos
- USUARIO Y CONTRASEÑA VALIDOS
- USUARIO NO VALIDO
- CONTRASEÑA NO VALIDA
- USUARIO Y CONTRASEÑA INVALIDOS
  */
package Sentencias_If_Switch;

import java.util.Scanner;


public class switch_Autenticacion {

    
    public static void main(String[] args) {
        // Creamos un usuario y contraseña iniciales, entendiendo que lo guardaron al darse de alta
        
        System.out.println(" *** SISTEMA AUTENTICACIÓN *** ");
        
        final String USER = "FRANK123";
        final String PASSWD = "2024mad";
        
        //El usuario quiere entrar al sistema y le pedimos el usuario y contraseña guardándolos en unas variables
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu usuario: ");
        String usuario =sc.nextLine().strip();
        
        System.out.println("Escribe tu contraseña: ");
        String clave = sc.nextLine().strip();
        
          
        // la variable acceso es donde se guardará el resultado de cada comprobación o caso
        var acceso = switch (usuario){
            case USER -> { if(PASSWD.equals(clave))  //si el usuario es correcto, comprobamos si pswd es correcto
                    yield "Acceso permitido"; //resultado de comprobación
            else   // si no es correcta la contraseña
                    yield "Password incorrecto.";//resultado de comprobación
            }   //por defecto si pswd es correcto el usuario es incorrecto
            default -> {if(PASSWD.equals(clave))
                    yield "Usuario incorrecto.";//resultado de comprobación
            else  //si no el usuario y contraseña son incorrctos
                    yield "Usuario y password incorrectos";//resultado de comprobación
            }
        };
        System.out.println(acceso); //se imprimie el resultado de cada comprobación guardado en acceso
    }
}

      
