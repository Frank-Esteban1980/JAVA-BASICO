/*UNIVERSIDAD JAVA UDEMY 113
 Programa que calcula la suma acumulativa */
package bucles_for_y_while;


public class ciclo_for_sumaAcumulativa {

   
    public static void main(String[] args) {
        
        System.out.println(" ** Suma Acumlativa **");
        
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 1;
        //iterar cada valor
        System.out.println("con for---");
       for(int i=1; i <=5; i++ ){
            acumuladorSuma += numero;
            numero++;
            System.out.println("La suma de los primeros "+numero+" es "+acumuladorSuma);
        
    }
    //Ejercicio con el detalle de cada una de las iteraciones con WHILE
    
    //var numero = 1;
    
        System.out.println("con while");
    while(numero <= MAXIMO){
        //imprimir lo que se va a sumar
        System.out.println("acumladorSuam + numero"+ acumuladorSuma+ " + " +numero);
        acumuladorSuma += numero;
        numero++;
        
        //suma parcial acumulada 
        
        System.out.println("Suma parcial acumulada "+acumuladorSuma+"\n");
}
        System.out.println("Suma de los primeros "+ MAXIMO + " números "+acumuladorSuma);
}
    
}
