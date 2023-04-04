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
 */
public class Ejercicios_Guia_Teorica_1 {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);     
         
        System.out.println("Ingrese una frase que sera codificada por el sistema");
        String frase = leer.nextLine();
        String fraseconvertida = conversor(frase);
        
       System.out.println(fraseconvertida);
    }
    

public static String conversor(String frase) {
        String fras;
         fras = frase.toLowerCase().replace('a','@').replace('e','#').replace('i','$').replace('o','%').replace('u', '*');
      
            
            String frase1 = frase;
         
            return fras;    
    }
}

    


    


 


