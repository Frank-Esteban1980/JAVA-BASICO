/* 86
Crear aplicación que pida al usuario:
- Nombres Usuario
- Pasos caminados al día --- pasos_diarios

Tendremos las constantes :
* METAS_PASOS_DIA = 10000
* CALORIAS_POR_PASO = 0.04

Vamos a calcularlas calorias quemadas según los valores caminados

        calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO

según esto verificar si cumplió con la meta de pasos al dia

        meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS

 */
package Sentencias_If_Switch;

import java.util.Scanner;


public class salud_fitness {

    public static void main(String[] args) {
        
        //Creamos las constantes para conocer los objetivos
        final int META_PASOS_DIA = 10000;
        final Double CALORIAS_POR_PASO = 0.04;
        // Pedimos al usuario su nombre y los pasos diarios guardándolos en una variable
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Di tu nombre de Usuario: ");
        String usuario = sc.nextLine();
        
        System.out.println("Cuántos pasos has dado hoy: ");
        int pasos_diarios = sc.nextInt();
        
        //Calcular las calorias quemadas
        Double calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;
        
        //VERIFICAR SI CONSEGUIMOS SUPERAR LOS 10000 PASOS
        System.out.println(" *** RESULTADOS PASOS DE HOY *** \n");
        
        var objetivo = (META_PASOS_DIA <= pasos_diarios)? "META CONSEGUIDA!!" : " Faltó poco para consguir";
        System.out.println(usuario+ " tus datos de hoy son:");
        System.out.println("Total de pasos = " + objetivo);
        System.out.println("Has quemado "+calorias_quemadas+ " kilocalorias.");
        
    }
    
}
