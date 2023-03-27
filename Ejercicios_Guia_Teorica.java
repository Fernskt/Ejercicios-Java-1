/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;


/**
 * Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */

/**
 *
 * @author sofimai
 */
public class Ejercicios_Guia_Teorica {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
       // System.out.println("Ingresar el primer numero");
        //int num1 = leer.nextInt();
        //System.out.println("Ingresar el segundo numero");
        //int num2 = leer.nextInt();
        
        //if(num1>25 && num2>25) {
          //  System.out.println("Ambos numeros son mayores a 25");
        //}else if (num1>25 || num2>25){
          //  System.out.println("Alguno de los dos numeros es mayor a 25");
        //}else {
          //  System.out.println("Ninguno de los nos numeros es mayor a 25");
        //}
        
        /**
 * Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
 */
        
        /**System.out.println("Ingrese un numero del 1 al 4 para elegir un tipo de bomba para mover fluidos");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
            System.out.println("No existe un valor valido para el tipo de bomba ingresado");
        }*/
        
   /**
    * Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
11*/
    
        System.out.println("Ingrese una nota que se encuentre entre el 0 y el 10");
        int nota = leer.nextInt();
        if (nota>=0 && nota <=10){
            System.out.println("La nota ingresada es: " + nota); 
        }
        while (nota<=0 || nota>=10){
            System.out.println("La nota no es valida, ingrese una nota nuevamente");
            break;
        }
}
}
    



