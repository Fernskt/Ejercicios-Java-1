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
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
public class Ejercicio_3_Extra_Guia2 {
    public static void main(String[] args){
   
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese una letra, el sistema declarara si se trata de una vocal");
         String letra = leer.nextLine();
        
         if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
             System.out.println("La letra ingresada es una vocal");
         } else {
             System.out.println("La letra ingresada NO es una vocal");
         }
    }
    
}
