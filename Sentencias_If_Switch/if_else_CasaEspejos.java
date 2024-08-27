/* video 84
 El programa permite la entrada a la atracción si se cumplen dos requisitos:
1. Tener más de 10 años
2. No tener miedo a la oscuiridad*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_CasaEspejos {

    
    public static void main(String[] args) {
        
        System.out.println(" **** QUIERES ENTRAR A LA CASA DE LOS ESPEJOS **** ");
        // Preguntar al usuario su edad y si tiene miedo a la oscuridad
        // la respuesta se guarda en una variable para cada uno
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Tienes miedo a la oscuridad true/fales: ");
        Boolean miedo = sc.nextBoolean();
        
        //primer if pide tener mas de 10 años y no miedo
        
        if (edad>10 &&  miedo!=true){
            System.out.println("Entra si te atreves!!!");
         }   
            //segundo IF dentro del primero... tiene miedo no puede entrar
        
        if (miedo==true){
            System.out.println("No puedes entara cobardica!!");
        
        }
        //else del primer IF calcula la edad y avisa los años que falta sin miedo
        else{
            int diferenciaEdad = edad - 10;
            System.out.println("Espera unos "+diferenciaEdad+" años para entrar.");
        }
        
    }
    
}
