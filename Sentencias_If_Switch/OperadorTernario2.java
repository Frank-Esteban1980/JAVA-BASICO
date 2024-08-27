/*
 • Condiciones Simples: Ideal para situaciones donde una condición simple determina 
el valor de una variable.
• Concisión: Reduce la cantidad de líneas de código.
• Legibilidad: Mantiene el código limpio y legible, pero puede ser menos claro si se 
anida o se complica demasiado.
*/
package Sentencias_If_Switch;

import java.util.Scanner;


public class OperadorTernario2 {

    
    public static void main(String[] args) {
        // verificar el tipo de calificación al que corresponde una nota
        Scanner sc = new Scanner(System.in);
        System.out.println("Di tu nota: ");
        int nota = sc.nextInt();
        
        var calificacion = (nota >= 9)? "Sobresaliente":
                            (nota >=8)? "Notable":
                            (nota >=6)? "Bien":
                            (nota >=5)? "Aprobado": "Suspenso";
                            
        System.out.println("Tu nota es "+nota+ " y tu calificación es ==> "+calificacion);
        
        // 2. VERIFICAR EL ESTADO ACTIVO O INACTIVO
        boolean esActivo = true;
        String estado = esActivo ? "Activo" : "Inactivo";
        System.out.println("El estado es " + estado);
        
        //3. VEFIFICAR NUMERO POSITIVO, NEGATIVO O 0
        var numero = -5;
        var resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El número " + numero + " es " + resultado);
    }
    
}
