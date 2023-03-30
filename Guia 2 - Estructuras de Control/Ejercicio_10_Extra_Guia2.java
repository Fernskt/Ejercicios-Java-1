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
 * Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class Ejercicio_10_Extra_Guia2 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
       
    System.out.println("Realizaremos una multiplicacion entre dos numeros entre 0 y 10. Ingrese un resultado para adivinar la respuesta de la operacion");   
    int respuesta = -1;
    
     int num1 = (int) (Math.random() * 10);
     int num2 = (int) (Math.random() * 10);
    
    while (respuesta == -1) {
        
        respuesta = leer.nextInt();
    
    if (respuesta == (num1*num2)){
        System.out.println("Felicidades! Adivinaste el resultado");
    } else {
        System.out.println("Lo lamento! El resultado ingresado no es el correcto. Intente nuevamente");
        respuesta = -1;
    }
    } 
    
    }
    
}
