/*
 video 50 clase RANDOM crea valores aleatorios*/
package Operadores_Format;
import java.util.Random;
/**
 *
 * @author FRANK
 */
public class RandomNumerosAleatorios {

    
    public static void main(String[] args) {
        Random random = new Random();
        
        //Generar un numero aleatorio entre 0 a 9
        
        var numEntero = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9: "+ numEntero);
        
        //si queremos entre 1 y  10 solo sumamos un 1
        
        var numEntero10 = random.nextInt(10)+1;
        System.out.println("Número aletario entre 1 y 10: "+numEntero10);
        
        // un flotante
        
        var numflotante = random.nextFloat();
        System.out.println("Flotante Aleatorio: "+ numflotante);
        
        // lanzamiento de un dado
        
        var dado = random.nextInt(6)+1;
        System.out.println("Lanza dado --> "+ dado);
    }
    
}
