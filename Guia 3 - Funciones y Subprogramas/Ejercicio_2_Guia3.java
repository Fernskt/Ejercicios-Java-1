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
 * Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
public class Ejercicio_2_Guia3 {
    public static void main(String[] args){
        
       Scanner leer = new Scanner(System.in); 
       int contador = 0;
       String resultado;
       
       do {
       String edad = Personas(contador);
       System.out.println("Desea ingresar los datos de otra persona? Si / No");
       resultado = leer.nextLine();
       contador++;
       } while (resultado.equalsIgnoreCase("Si"));
 
        
    }
    
    public static String Personas(int contador) {
    
    Scanner leer = new Scanner(System.in); 
    
    boolean mayoredad = false;  
    
        contador++;
        System.out.println("Ingrese el nombre de la persona Nro. " + contador);
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona Nro. " + contador);
        int edad = leer.nextInt(); 
        
        if (edad >= 18) {
            mayoredad = true;
            System.out.println(nombre + " es mayor de edad");
        } else {
            mayoredad = false;
            System.out.println(nombre + " es menor de edad");
        } 
        
    return nombre;
    }
}
