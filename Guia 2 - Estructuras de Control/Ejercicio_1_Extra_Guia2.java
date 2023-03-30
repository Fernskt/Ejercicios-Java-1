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
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
* 
* creo que hay que usar TRUNC y MOD
* 
*   double numero = 3.1416;
    double parteEntera = Math.trunc(numero);
    System.out.println(parteEntera); // imprime 3.0
    * 
    int resultado = 7 % 3; // resultado será 1
 */
public class Ejercicio_1_Extra_Guia2 {
    
    public static void main(String[] args){
 
 // 1 dia = 24 horas = 1440 minutos
 // 1 hora = 60 minutos
 
 // 1000 minutos...
 // 1000/720 = 1,38 // 1 dia
 
 Scanner leer = new Scanner(System.in);       
        System.out.println("Ingrese la cantidad de minutos y el sistema calculara los dias y horas equivalentes");
        double minutos = leer.nextDouble();
    
        
        double cantidad_dias = (minutos/60)/24;
        double cantidad_horas = (cantidad_dias%1) * 24; 
        
        System.out.println(minutos + " minutos equivalen a: " + Math.floor(cantidad_dias) + " dias, " + Math.floor(cantidad_horas)+ " horas.");
    }
}
