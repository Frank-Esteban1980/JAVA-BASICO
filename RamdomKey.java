/*
 Crear una contraseña con dos primeras letras del apellido de usuario,
un códico aleatorior de 3 cifras y las últimas dos cifras del año de nacimiento*/
package Operadores_Format;
import java.util.Scanner;
import java.util.Random;

public class RamdomKey {

    /**
     Primero pedimos nombres y apelllidos al usuario y su año de nacimiento  para guardarlos variables.
     * Segundo, calculamos el número aleatorio para el código de tres cifras,
     * Y juntamos todo
     * Informamos la usuario nombre y apellido sobre su código
     */
    public static void main(String[] args) {
        
        System.out.println(" -- *** CREAR CODIGO ÚNCIO USUARIO *** ---");
        System.out.println("por favo indícanos tus datos: ");
        
        //Guardamos los datos que el usuario nos
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = escaner.nextLine();
        
        System.out.println("Apellido: ");
        String apellido = escaner.nextLine();
        
        System.out.println("Año de nacimiento: ");
        String year = escaner.nextLine();
        
        // Creamos códigos aleatorios para incluirlos en la contraseña
        Random numAleatorio = new Random();
        var aleatorio = numAleatorio.nextInt(100+1);
        //siempre debe tener 3 dígitos
        var aleatorioCod = String.format("%02d", aleatorio);
        
        //Cumplimos condiciones de cada elemento para la contraseña
       // var nombreCod = nombre.trim().toUpperCase().substring(0, 2);
        var apellidoCod = apellido.trim().toUpperCase().substring(0, 2);
        var yearCod = year.trim().substring(2);
        
        //Creamos la contraseña
        
        String password = apellidoCod + aleatorioCod + yearCod;
        
        //Informar en consolo al usuario
        
        System.out.printf("Para el usuario Nombre: %s apellido %s la contraseña es: \n%s",nombre, apellido,password );
               
        
        
    }
    
}
