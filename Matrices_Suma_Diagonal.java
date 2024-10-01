/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrices;

/**
 *
 * @author FRANK
 */
public class Matrices_Suma_Diagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int FILAS = 3;
        final int COLUMNAS = 3;
        
        int[][]matriz = new int[FILAS][COLUMNAS]; 
       
        System.out.println("RELLENAR MATRICES Y MOSTRAR");
        
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;
        
        
        // MOSTRAR POSICIONES Y VALORES
        
        System.out.println(""+matriz[1][2]);
        
        for(int f=0; f < FILAS; f++){
            for(int col = 0; col <COLUMNAS; col++){
                System.out.println("Posición ["+f+"]["+col+"] -- Valor -> "+matriz[f][col]);
            }
        }
        
        // suma de las posicones de la matriz en diagonal
        System.out.println("*** SUMA DIAGONAL ***");
        int sumaDiagonal=0;
        
        for(int f = 0; f < FILAS; f++){
            for(int col=0; col<COLUMNAS; col++){
                if(f == col){
                    sumaDiagonal += matriz[f][col];
                }
            }
            System.out.println("La suma diagonal de la matriz es "+sumaDiagonal);
        }
        
        
    }
    
}
