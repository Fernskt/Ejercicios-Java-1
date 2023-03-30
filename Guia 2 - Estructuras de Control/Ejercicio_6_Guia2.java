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
public class Ejercicio_6_Guia2 {
 
public static void main(String[] args) {    
 
    /**Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

MENU
* 1. Sumar
* 2. Restar
* 3. Multiplicar
* 4. Dividir
* 5. Salir
* Elija opcion

**/
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    double num1 = leer.nextDouble();
    System.out.println("Ingrese el segundo numero");
    double num2 = leer.nextDouble();
    int respuesta = 0;
    
    do {
        
    System.out.println("MENU");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Salir");
    System.out.println("Elija una opcion para continuar");
    respuesta = leer.nextInt();
    
    if (respuesta == 5) {
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        String salida = leer.next();
        if (salida.equalsIgnoreCase("S")) {
            System.out.println("Hasta la proxima!");
        }else if (salida.equalsIgnoreCase("N")){
            respuesta = 0;
            continue;
        }
        
    }
    
    while (respuesta == 1 || respuesta == 2 || respuesta == 3 || respuesta == 4) {
    switch (respuesta) {
        case 1:
            System.out.println("La suma de los numeros ingresados es: " + (num1 + num2)); 
            respuesta = 0;
        break;
        case 2:
            System.out.println("La resta de los numeros ingresados es: " + (num1-num2));
            respuesta = 0;
        break;
        case 3:
            System.out.println("La multiplicacion de los numeros ingresados es: " + (num1*num2));
            respuesta = 0;
        break;
        case 4:
            System.out.println("La division de los numeros ingresados es: " + (num1/num2));
            respuesta = 0;
        break;
    }    
    }
  
    } while (respuesta ==0);

    
    
}

}

    
