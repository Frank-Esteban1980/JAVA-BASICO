/* 87
Sistema de reserva de hotel.Se debe pedir información al usuario:

Nombre Cliente:
Dias de estancia:
Habitación con vista al mar:

Tarifas:

Hab sin vista al mar 150€ al día
Hab con vista al mar 199.99€ al día

Calcular e informar el coste total de la estancia según los dias y precios
  */
package Sentencias_If_Switch;

import java.util.Scanner;


public class if_else_ReservaHotel {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        final Double HabitacionMar = 199.99;
        final Double HabitacionSin = 150.00;
                
        
        System.out.println("*** SISTEMA DE RESERVA DE HOTEL ***");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombres y apellidos");
        String nombres = sc.nextLine();
        
        System.out.println("Dias de estancia: ");
        int diasEstancia = sc.nextInt();
        
        System.out.println("Habitancion con vistas true / false");
        Boolean vistaMar = sc.nextBoolean();
        
        System.out.println("***PRECIOS POR HABITACIÓN");
        
        if (vistaMar){
            Double Total = diasEstancia * HabitacionMar;
            System.out.println(" *** Precios totales por habitación ***");
            System.out.println("Sr "+ nombres + " su habitación para: ");
            System.out.println(diasEstancia+" días "+ " en habitación con vistas: "+vistaMar+". Tiene un PRECIO TOTAL:");
            System.out.println("***** "+Total+" €");
        }else{
            Double Total = diasEstancia * HabitacionSin;
            System.out.println(" *** Precios totales por habitación ***");
            System.out.println("Sr "+ nombres + " su habitación para: ");
            System.out.println(diasEstancia+" días "+ " en habitación con vistas: "+vistaMar);
            System.out.println("Precio Total "+Total+" €");
        }
        
        /*
        System.out.printf("""
                %n------------ Detalles de la Reservación -----------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombres, diasEstancia, Total;
        
     */
        
    }
    
}
