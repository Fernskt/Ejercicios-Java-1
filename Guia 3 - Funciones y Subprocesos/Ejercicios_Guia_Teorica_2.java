/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author sofimai
 * Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número sea múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class Ejercicios_Guia_Teorica_2 {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
        
    }
    
    public static void EsMultiplo(int num1, int num2) {
        
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
    
}
