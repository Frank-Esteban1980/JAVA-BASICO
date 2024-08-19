/*video 58:
 asignación simple = 
suma y asignación +=
resta y asignacion -=
multi y asignación *=
división y asignación /=
modulo y asignación = %/*/
package Operadores_Format;


public class OperadoresAsignacion {

    
    public static void main(String[] args) {
        System.out.println("OPERADORES DE ASIGNACIÓN");
        
        int miNumero = 10;
        int miNumero2 = 20;
        
        //suma igual
        
        miNumero += 3;  //incrementa la variable en 3...miNumero = miNumero + 3
        System.out.println("miNumero = " + miNumero);
        
        //resta igual
        
        miNumero -= 2;
        System.out.println("miNumero = " + miNumero);
        
        // multiplicacion igual
        miNumero2 *= 4;
        System.out.println("miNumero2 = " + miNumero2);
        
        // división igual
        miNumero2 /= 2;
        System.out.println("miNumero2 = " + miNumero2);
        
        //modulo igual
        
        miNumero %= 4;
        System.out.println("miNumero2 modulo de 4 = " + miNumero2 );
        
        
        
        
    }
    
}
