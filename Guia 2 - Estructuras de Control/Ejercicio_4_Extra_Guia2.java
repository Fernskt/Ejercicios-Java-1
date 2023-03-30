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
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
public class Ejercicio_4_Extra_Guia2 {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10, el sistema le devolvera su equivalente en numeros romanos");
    int num = leer.nextInt();
    
    if (num >0 && num <=10) { 
    switch (num) {
        case 1: System.out.println("I");
        break;
        case 2: System.out.println("II");
        break;
        case 3: System.out.println("III");
        break;
        case 4: System.out.println("IV");
        break;
        case 5: System.out.println("V");
        break;
        case 6: System.out.println("VI");
        break;
        case 7: System.out.println("VII");
        break;
        case 8: System.out.println("VIII");
        break;
        case 9: System.out.println("IX");
        break;
        case 10: System.out.println("X");
        break;
        }
    } else {
        System.out.println("El numero ingresado no se encuentre entre los valores permitidos");
    }  
    
    }
    
    }