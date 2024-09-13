/*
Programa CALCULADORA
Nos dará las opciones de realizar una suma, resta, multiplicación o división
- Debe solicitar los valores de los operandos 
- Realizar la operación seleccionada.
La última opción será apagar
*/
package bucles_for_y_while;

import java.util.Scanner;
public class Menu_Calculadora {

    
    public static void main(String[] args) {
        System.out.println("*** Calculadora en JAVA ***");
        // Abrimos Scanner para que se recojan los datos desde el usuario
        Scanner sc = new Scanner (System.in);
        
        //Creamos un estado apagar como falso, cuando cambie a verdadero la calculadora se apaga
        var apagar=false;
        
        //Pedimos al usuario que nos díga con que números quiere operar
        System.out.println("Di un número para tu operación: ");
        Double num1 = sc.nextDouble();
        System.out.println("Di otro número para tu operación: ");
        Double num2 = sc.nextDouble();
        
        //Creamos un bucle while, que mientras apagar sea falso realice las susceivas accioens
        
        while(!apagar){
            //Sacamos a pantalla las opciones del menú de la calculadora:
            System.out.println("""
                               Seleccione la operación a realizar:\n
                               1.Suma
                               2. Resta
                               3. Multimplicación
                               4. División
                               5. Apagar
                               
                               """);
            //Creamos una variable para que el usuario eleccione su opción y se guarde en la variable
            var operacion = sc.nextInt();
            
            //Creamos los totales que aplicará cada operacion
            Double totalSuma = num1 + num2;
            Double totalResta = num1 - num2;
            Double totalMultiplicacion = num1 * num2;
            Double totalDivision = num1 / num2;
            
            switch(operacion){
                
                case 1 ->  System.out.println("La suma de "+ num1+ " + " +num2+" es "+totalSuma); 
                
                case 2 -> System.out.println("La suma de "+ num1+ " + " +num2+" es "+totalResta); 
                
                
                case 4 -> {
                    if(num2>0){
                    System.out.println("La suma de "+ num1+ " + " +num2+" es "+totalDivision);
                    }else{
                        System.out.println("El primer número debe ser mayor que 0.");
                        }
                    }
                case 3 -> System.out.println("La suma de "+ num1+ " + " +num2+" es "+totalMultiplicacion);

                case 5 -> {
                    System.out.println("Apagando");
                //si elegimos 5 salir, cambiamos el estado apagar a true
            apagar = true;
                }  
                default -> System.out.println("Elija una opción correcta.");
            }
           
                
        }
    }
    
}
