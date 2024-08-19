/* 35 COMPARACION CADENAS
 
*/
package Operadores_Format;


public class ComparacionCadenas {

    
    public static void main(String[] args) {
        
        String cadena1 = "Java";
        String cadena2 = "Java";
        
        //COMPARAR REFERENCIAS DE MEMORIA  
        // cadenas == compara la referencia en memoria
        
        System.out.print("Referencia cadena1 es igual en referencia a cadena2 : ");
        System.out.println(cadena1 == cadena2);
        
        // si creamos una cadena formal con el objeto STRING ya no se guarda en la 
        // misma referencia, no los entiende como iguales aunque ponga lo mismo.
        
        var cadena3 = new String("Java");
        
        System.out.print("Referencia cadena1 es igual en referencia a cadena3 : ");
        System.out.println(cadena1 == cadena3);
        
        
        // cadenas distintas
        
        var cadenax = "Java";
        var cadenaY = "Python";
        
        System.out.print("Referencia cadenax es igual en referencia a cadenay : ");
        System.out.println(cadena1 == cadena3);
        
        
    /* COMPARAR CONTENIDOS 
        se usa método equals()
        */
    
        System.out.print("Contenido de cadena1 es igual a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
        
        
    }
    
}
