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
public class Ejercicio_3_Guia4_SinpasaraString {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese el valor de N: tamano del vector");
        int tamano = leer.nextInt();
        
        int[] vector = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
        Random random = new Random();
        int min = (int) Math.pow(10, 0);
        int max = (int) Math.pow(10, 3);
        int aleatorio =random.nextInt(max-min);
        vector[i] = aleatorio;
        System.out.println("Numero generado = " + vector[i]);
        }
        
        for (int i = 0; i < tamano; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        
        
        for (int i = 0; i < tamano; i++) {
            /*int cont_1c = 0;
            int cont_2c = 0;
            int cont_3c = 0;*/
            
            int cifra = vector[i]; 
            int cont_cifras = 0;
            cifra = vector[i];
        
            while (cifra>=1) {   
            cifra = cifra/10;
            cont_cifras ++;       
            }
        
            System.out.println("La coordenada " + i + " del vector tiene " + cont_cifras + " cifras");
            
            /*if (cont_cifras == 1) {
                cont_1c ++;
            }else if (cont_cifras == 2) {
                cont_2c ++;
            }else if (cont_cifras == 3) {
                cont_3c ++;
            }*/ 
        }

    }
}
