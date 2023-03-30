/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author sofimai
 */
public class Ejercicio_1_Guia2 {

    /**
     * @param args the command line arguments
     */
    
   // 1. Crear un programa que dado un número determine si es par o impar.         
    public static void main(String[] args) {
        // TODO code application logic here
   
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }

}