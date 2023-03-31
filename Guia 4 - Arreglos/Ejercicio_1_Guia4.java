/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author sofimai
 * Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio_1_Guia4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
        
        int vector_num[] = new int[100];
        
               
                for (int i = 0; i < vector_num.length; i++) {
                vector_num[i] = (i+1);
                }
                
                for (int i = (vector_num.length-1); i >= 0; i--) {
                System.out.println(vector_num[i]);    
                }
    }
}
