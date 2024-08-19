/* 59
 Operadores de comparación o Relacionales, compara valores y devuelve un valor booleano
== igual a, != distinto a, mayor que >, mayor o igual que >=, menor que <, menor o igual que <=,
*/
package Operadores_Format;

/**
 *
 * @author FRANK
 */
public class OperadoresComparación {

    
    public static void main(String[] args) {
        System.out.println("*** OPERADORES DE COMPARACION O RELACIONALES ***");
        
        int a =3, b = 2;
        System.out.println("a = " + a +" b = " + b);
        
        //igualdad
        var resultado = a==b;   //compara la referencia de memoria
        System.out.println("resultado a = b " + resultado);
        
        // disinoto a
        resultado = a != b;
        System.out.println("resultado a!=b " + resultado);
        
        //mayor que o mayor o igual que
        resultado = a>b;
        System.out.println("resultado a > b " + resultado);
        
        resultado = a>=b;
        System.out.println("resultado a >= b " + resultado);
        
        //menor que o menor o igual que
        resultado = a<b;
        System.out.println("resultado a<b " + resultado);
        
        resultado = a<=b;
        System.out.println("resultado a<=b " + resultado);
        
        
    }
    
}
