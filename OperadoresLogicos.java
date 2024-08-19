/* 60, 61 , 52
 OPERADORES LOGICOS. evaluan dos valores lógicos y regresa un valor lógico true o false
&& AND es true si ambos valores son verdad, en cualquier otro caso es falso
|| OR es true si uno de los valores es verdad
! NOT iniverte el valor logico, es unario.*/
package Operadores_Format;

/**
 *
 * @author FRANK
 */
public class OperadoresLogicos {

    
    public static void main(String[] args) {
        
        System.out.println(" *** OPERADOR LOGICO AND *** ");
        
        boolean a = true, b = false;
        System.out.print("a = "+a+ " b = "+b);
        
        var resultado = a && b;
        System.out.print("\tresultado = " + resultado+ "\n");
        
        a = false; b = false;
        System.out.print("a = "+a+ " b = "+b);
        
        resultado = a && b;
        System.out.print("\tresultado = " + resultado+ "\n");
        
        a = false; b = true;
        System.out.print("a = "+a+ " b = "+b);
        
        resultado = a && b;
        System.out.print("\tresultado = " + resultado+ "\n");
        
        a = true; b = true;
        System.out.print("a = "+a+ " b = "+b);
        
        resultado = a && b;
        System.out.print("\tresultado = " + resultado+ "\n");
        
        
        System.out.println(" *** OPERADOR LOGICO OR ***");
        
        boolean x = true, y  = false;
        System.out.print("x = "+x+ "y = " + y);
        
         resultado = x || y;
        System.out.print("\tresultado = " + resultado + "\n");
        
        x = false; y = true;
        System.out.print("x = "+x+ "y = " + y);
        resultado = x || y;
        System.out.print("\tresultado = " + resultado + "\n");
        
        x = false; y = false;
        System.out.print("x = "+x+ "y = " + y);
        resultado = x || y;
        System.out.println("\tresultado = " + resultado + "\n");
        
        x = true; y = true;
        System.out.print("x = "+x+ "y = " + y);
        resultado = x || y;
        System.out.print("\tresultado = " + resultado + "\n");
        
        
        System.out.println(" *** OPERADOR LOGICO NOT *** Unario");
        
        boolean m = true;
        System.out.println("m = " + m);
        
        resultado = !m;
        System.out.println("not con m = " + resultado);
        
        boolean n =false;
        resultado = !n;
        System.out.println("n = " + n);
        
    }
    
}
