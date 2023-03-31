/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author sofimai
 * Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
* 
* Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
public class Ejercicios_Guia_Teorica_1 {
     public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Bienvenido!");
        
        String[] equipo = new String[6];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingresa el nombre del integrante Nro. " + (i+1) + " del equipo");    
        equipo[i] = leer.nextLine();
        }
        
     }
    
}
