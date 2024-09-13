/* UDEMY 108 
 Imprimir los números del 1 al 10 de vorma inversa */
package bucles_for_y_while;


public class dowhile_numerosInversos {

    
    public static void main(String[] args) {
        // creamos un contador para decrecer
        int contador = 10;
        
        do{  // el contador inicial se imprimr
            System.out.println(contador);  
//se resta 1 cada vez al contador
            contador--;
            //condición, mientras contador sea mayor o igual a 0 debe seguir ejecutando el bloque de arriba
        }while(contador>=0);
    }
    
}
