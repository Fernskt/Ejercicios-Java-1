/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sofimai
 * 3) Recorrer un vector de N enteros contabilizando cuántos números son de
    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio_3_Guia4 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in); 
  
        System.out.println("Ingrese el tamano del vector");
        int tamano = leer.nextInt();
        
        int [] vector = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
        Random random = new Random();
        int aleatorio =random.nextInt(100000);
        System.out.println("Numero generado = " + vector[i]);
        }
       
        String [] vector_String = new String[tamano];               
        vector_String[tamano] = String.valueOf(vector[tamano]);
            
        /*String[] vector = new String[tamano];
        
        System.out.println("El vector tendra un tamano de: " + tamano);
        
        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor que ira en la coordenada " + i);
            vector[i] = leer.next();
            System.out.println("Vector [" + i + "] = " + vector[i]);
        }*/
      
        int contador_1digito = 0;
        int contador_2digitos = 0;
        int contador_3digitos = 0;
        int contador_4digitos = 0;
        int contador_5digitos = 0;
        
        for (int i = 0; i < tamano; i++) {
            switch (vector_String[i].length()) {
                case 1:
                    contador_1digito ++;
                break;
                case 2:
                    contador_2digitos ++;
                break; 
                case 3:
                    contador_3digitos ++;
                break; 
                case 4:
                    contador_4digitos ++;
                break;
                case 5:
                    contador_5digitos ++;
                break;
                default: ;
                        
            }    
        }
    
        System.out.println("El vector tiene " + contador_1digito + " numeros de 1 cifra"); 
        System.out.println("El vector tiene " + contador_2digitos + " numeros de 2 cifras");
        System.out.println("El vector tiene " + contador_3digitos + " numeros de 3 cifras");
        System.out.println("El vector tiene " + contador_4digitos + " numeros de 4 cifras");
        System.out.println("El vector tiene " + contador_5digitos + " numeros de 5 cifras");
        
        
    }
}
