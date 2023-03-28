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
 * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
* Substring(),
//String str = "Hola mundo";
//String sub = str.substring(2, 6); // sub = "la m"
* 
* Length(), 
//String cadena = "Hola, mundo!";
//int longitud = cadena.length();
* 
* equals().
//String str1 = "Hola";
//String str2 = "Hola";
//
//if(str1.equals(str2)){
//   System.out.println("Las cadenas son iguales");
//} else {
//   System.out.println("Las cadenas son diferentes");
//}
* Xsof0
 */
public class Ejercicio_7_Guia2 {
    
    public static void main(String[] args) { 
    
    int contador_correctas = 0;
    int contador_incorrectas = 0;
    // Xsof0
    // X0
    
    
    String FDE = "&&&&&";
        
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Recuerde las condiciones de formato: tienen que ser de un máximo de 5 caracteres de largo, ");
        System.out.println("el primer carácter tiene que ser X y el último tiene que ser un O.");
        String frase = "A";
    
        do {
        System.out.println("Ingrese una frase:");
    frase = leer.nextLine();
    int longitud = frase.length();
    String ultimo_caracter = frase.substring((longitud-1), (longitud));
    String primer_caracter = frase.substring(0, 1);
    

        if (longitud <= 5 && (primer_caracter.equals("X")) && (ultimo_caracter.equals("0"))) {
            contador_correctas ++;
            
        } else { 
            contador_incorrectas ++;
        }
    } while (!frase.equals(FDE));
        
    if (frase.equals(FDE)){
        System.out.println("La cantidad de cadenas correctas fueron de: " + contador_correctas);
        System.out.println("La cantidad de cadenas incorrectas fueron de: " + (contador_incorrectas-1));
    }    
            
    
    }
        
    }

