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
 * Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
public class Ejercicio_2_Guia4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
     
        System.out.println("Ingrese el tamano del vector");
        int tamano = leer.nextInt();
        
        int[] vector = new int[tamano];
         
        for (int i = 0; i < tamano; i++) {
        vector[i] = (int)(Math.random()*10);
        System.out.println(vector[i]);
        }
       
        System.out.println("Ingrese un numero a buscar");
        int num = leer.nextInt();
        
        boolean rta = BuscarNumero(tamano, vector, num);
    }
   

   public static boolean BuscarNumero(int tamano, int[] vector, int num) {
    boolean respuesta = false;    
    int contador = 0;  
    int indice;
       
       for (int i = 0; i < tamano; i++) {
       indice = vector[i]; 
       if (indice == num) {
       respuesta = true;
       contador ++;
           System.out.println("El numero " + num + " se encuentra en la posicion " + i + " del vector");
       } else {
       respuesta = false;
       }
       }     
    return respuesta;
   }
   
}
