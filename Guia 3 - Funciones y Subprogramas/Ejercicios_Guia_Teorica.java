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
 * 
 * Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class Ejercicios_Guia_Teorica {
     
    public static void main(String[] args){
     
    Scanner leer = new Scanner(System.in);     
         
        System.out.println("Ingrese una frase que sera codificada por el sistema");
        String frase = leer.nextLine();
        String caracter = " ";
        
        String fraseconvertida = (conversor(frase, caracter));
        
        System.out.println(fraseconvertida);
        
    }


        public static String conversor(String frase, String caracter) {
        
            
            for (int i = 0; i < frase.length(); i++) {
               caracter = frase.substring(i, i+1);
            switch (caracter.toLowerCase()) {
                case ("a"):
                    caracter = "@";
                    System.out.print(caracter);
                    break;
                case "e":
                    caracter = "#";
                    System.out.print(caracter);
                    break;
                case "i":
                    caracter = "$";
                    System.out.print(caracter);
                    break;
                case "o":
                    caracter = "%";
                    System.out.print(caracter);
                    break;
                case "u":
                    caracter = "*";
                    System.out.print(caracter);
                    break;
                default:
                    caracter = frase.substring(i, i+1);
                    System.out.print(caracter);
                }  
                }
          
       return caracter;     
    }
}

        

        
            
        
        

        

    
