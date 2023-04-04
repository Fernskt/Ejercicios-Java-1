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
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
* [2][7][6]
* [9][5][1]15
* [4][3][8]15
* 15   
 */
public class Ejercicio_6_Guia4 {
    public static void main(String[] args) {
    
        Scanner leer =new Scanner(System.in);  
        
        int [][] cuadrado_magico = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la coordenada " + i + "/" + j);
                cuadrado_magico[i][j] = leer.nextInt();
            }
        }
// crear vectores para cada fila        
        int [] fila0 = new int[3];
        System.out.println("Fila 0");
        for (int j = 0; j < 3; j++) {
           fila0[j] = cuadrado_magico[0][j];
           System.out.print("[" + fila0[j] + "]");
        }
        System.out.println(" ");
        
        int [] fila1 = new int[3];
        System.out.println("Fila 1");
        for (int j = 0; j < 3; j++) {
           fila1[j] = cuadrado_magico[1][j];
           System.out.print("[" + fila1[j] + "]");
        }
        System.out.println(" ");
        
        int [] fila2 = new int[3];
        System.out.println("Fila 2");
        for (int j = 0; j < 3; j++) {
           fila2[j] = cuadrado_magico[2][j];
           System.out.print("[" + fila2[j] + "]");
        }
        
// ver que resultado de las filas sean iguales
        int contador_igualdades = 0;
        int contador_diferencias = 0;
        System.out.println(" ");
        
        int sumafila0 = 0;
        for (int j = 0; j < 3; j++) {
        sumafila0 = sumafila0 + fila0[j];
        }
        System.out.print(sumafila0);
        System.out.println(" ");
        
        int sumafila1 = 0;
        for (int j = 0; j < 3; j++) {
        sumafila1 = sumafila1 + fila1[j];
        }
        System.out.print(sumafila1);  
        System.out.println(" ");
        
        int sumafila2 = 0;
        for (int j = 0; j < 3; j++) {
        sumafila2 = sumafila2 + fila2[j];
        }
        System.out.print(sumafila2); 
        System.out.println(" ");
        
        if (sumafila0 == sumafila1 && sumafila1 == sumafila2) {
        contador_igualdades ++;
            System.out.println("Todas las filas son iguales");
        }else {
        contador_diferencias ++;    
            System.out.println("Todas las filas NO son iguales");
        }
        
        System.out.println(" ");
        
        int total_filas = sumafila0 + sumafila1 + sumafila2;
        System.out.println(total_filas);
        
        System.out.println(" ");

// crear vectores para columnas
    
        int [] columna0 = new int[3];
        System.out.println("Columna 0");
        for (int i = 0; i < 3; i++) {
           columna0[i] = cuadrado_magico[i][0];
           System.out.println("[" + columna0[i] + "]");
        }
        System.out.println(" ");
        
        int [] columna1 = new int[3];
        System.out.println("Columna 1");
        for (int i = 0; i < 3; i++) {
           columna1[i] = cuadrado_magico[i][1];
           System.out.println("[" + columna1[i] + "]");
        }
        System.out.println(" ");
        
        int [] columna2 = new int[3];
        System.out.println("Columna 2");
        for (int i = 0; i < 3; i++) {
           columna2[i] = cuadrado_magico[i][2];
           System.out.println("[" + columna2[i] + "]");
        }
        System.out.println(" ");        

// ver que resultado de las columnas sean iguales
        int contador_igualdades_columnas = 0;
        int contador_diferencias_columnas = 0;   
        
        int sumacolumna0 = 0;        
        for (int i = 0; i < 3; i++) {
        sumacolumna0 = sumacolumna0 + columna0[i];
        }
        System.out.print(sumacolumna0);
        System.out.println(" ");    
        
        int sumacolumna1 = 0;        
        for (int i = 0; i < 3; i++) {
        sumacolumna1 = sumacolumna1 + columna1[i];
        }
        System.out.print(sumacolumna1);
        System.out.println(" ");         

        int sumacolumna2 = 0;        
        for (int i = 0; i < 3; i++) {
        sumacolumna2 = sumacolumna2 + columna2[i];
        }
        System.out.print(sumacolumna2);
        System.out.println(" "); 
        
        if (sumacolumna0 == sumacolumna1 && sumacolumna1 == sumacolumna2) {
        contador_igualdades_columnas ++;
            System.out.println("Todas las columnas son iguales");
        }else {
        contador_diferencias_columnas ++;    
            System.out.println("Todas las columnas NO son iguales");
        }     
        
        System.out.println(" ");
        
        int total_columnas = sumacolumna0 + sumacolumna1 + sumacolumna2;
        System.out.println(total_columnas); 
        
        System.out.println(" ");

// crear vectores para diagonales

        int [] diagonal_desc = new int[3];
        System.out.println("Diagonal descendente (A)"); //0/0 1/1 2/2
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
           if (i == j) {
           diagonal_desc[i] = cuadrado_magico[i][j];     
           System.out.println("[" + diagonal_desc[i] + "]");
           }
        }
        }
        System.out.println(" ");

        int [] diagonal_asc = new int[3];
        System.out.println("Diagonal ascendente (B)"); // 2/0 1/1 0/2
        System.out.println("[" + (diagonal_asc[0] = cuadrado_magico[2][0]) + "]");
        System.out.println("[" + (diagonal_asc[1] = cuadrado_magico[1][1]) + "]");
        System.out.println("[" + (diagonal_asc[2] = cuadrado_magico[0][2]) + "]");
        
        System.out.println(" ");

// ver que resultado de las diagonales sean iguales

        int contador_igualdades_diagonales = 0;
        int contador_diferencias_diagonales = 0;
        
        int sumadiagonaldesc = 0;        
        for (int i = 0; i < 3; i++) {
        sumadiagonaldesc = sumadiagonaldesc + diagonal_desc[i];
        }
        System.out.print(sumadiagonaldesc);
        System.out.println(" ");      
        
        int sumadiagonalasc = 0;        
        for (int i = 0; i < 3; i++) {
        sumadiagonalasc = sumadiagonalasc + diagonal_asc[i];
        }
        System.out.print(sumadiagonalasc);
        System.out.println(" ");         

        if (sumadiagonalasc == sumadiagonaldesc) {
        contador_igualdades_diagonales ++;
            System.out.println("Las diagonales son iguales");
        }else {
        contador_diferencias_diagonales ++;    
            System.out.println("Las diagonales NO son iguales");
        }     
        
        System.out.println(" ");
               
        int total_diagonales = sumadiagonaldesc + sumadiagonalasc;
        System.out.println(total_diagonales);        
    
        System.out.println(" ");
        
        if (total_filas/3 == total_columnas/3 && total_columnas/3 == total_diagonales/2) {
        System.out.println("LA MATRIZ INGRESADA ES UN CUADRADO MAGICO!");
        } else {
        System.out.println("LA MATRIZ INGRESADA NO ES UN CUADRADO MAGICO :(");
        }
        
    }
}
