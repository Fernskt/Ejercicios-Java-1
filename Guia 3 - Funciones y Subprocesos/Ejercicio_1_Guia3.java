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
 * Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */

public class Ejercicio_1_Guia3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese otro numero");
        double num2 = leer.nextDouble();
        
        System.out.println("Que desea hacer?: 1 = Sumar / 2 = Restar / 3 = Multiplicar / 4 = Dividir");
        int respuesta = leer.nextInt();
        
        switch (respuesta) {
        
            case 1:    
        System.out.println("1. Sumar");
        //double resultadosuma = Sumar(num1, num2); //  
        int resultadosuma = (int) Sumar(num1, num2);
        System.out.println("El resultado de la suma es: " + resultadosuma);
            break;
        
            case 2:
        System.out.println("2. Restar");
        //double resultadoresta = Restar(num1, num2);
        int resultadoresta = (int) Restar(num1, num2);
        System.out.println("El resultado de la resta es de: " + resultadoresta);
            break;
        
            case 3:
        System.out.println("3. Multiplicar");
        //double resultadomult = Multiplicar(num1, num2);
        int resultadomult = (int) Multiplicar(num1, num2);
        System.out.println("El resultado de la multiplicacion es de: " + resultadomult);
            break;
            
            case 4:
        System.out.println("4. Dividir");
        double resultadodiv = Dividir(num1, num2);
        System.out.println("El resultado de la division es de: " + resultadodiv);
            break;
        }
    }
    
    public static double Sumar(double num1, double num2) {
    double suma;
       suma = num1 + num2; 
    return suma;    
    }
    
    public static double Restar(double num1, double num2){
    double resta;
        resta = num1 - num2;        
    return resta;    
    }
    
    public static double Multiplicar(double num1, double num2){
    double producto;
        producto = num1 * num2;
    return producto;    
    }
    
    public static double Dividir(double num1, double num2){
    double cociente;
        cociente = num1 / num2;
    return cociente;    
    }

}
