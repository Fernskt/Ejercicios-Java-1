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
 * 5. Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su
 * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
 * A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio_5_Guia4 {
    
    public static void main(String[] args) {
        
        System.out.println("Tomaremos una Matriz cuadrada de tamaño N y luego analizaremos si es antisimetrica");
        System.out.println("Ingresar el valor de N: tamaño de la matriz");
       
        Scanner leer =new Scanner(System.in);            
        int N= leer.nextInt();
        
        int[][] Matriz= new int[N][N];
        
        System.out.println("Mostramos una matriz A de "+ N +" x "+ N ); 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            //Matriz[i][j]= (int) (Math.random() * 100);   
            System.out.println("Ingresar el valor de la coordenada "+i+"/"+j);
            Matriz [i][j] = leer.nextInt();
            //System.out.print("  "+Matriz[i][j]+"  ");
            }
            //System.out.println(" ");
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("["+Matriz[i][j]+"] ");
            }
            System.out.println(" ");
        }
        
        int[][] MatrizAntiSim= new int[N][N];
        System.out.println("Mostramos la Matriz traspuesta y cambiada de signo de la matriz original");
        System.out.println("Recordemos que una matriz A es Antisimetrica si es igual a su matriz traspuesta pero cambiada de signo ( A=-1*AT )" );           
                
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            MatrizAntiSim[i][j]= Matriz[j][i]*-1 ;   //En ese FOR creamos la matriz traspuesta cambiada de signo (j,i = i,j*-1)
            }                                       // para ver si la matriz original es asimetrica
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
              System.out.print("  "+MatrizAntiSim[i][j]+"  "); //En este FOR se imprime la matriz resultante de la
            }                                                   // inversion de filas por columnas y luego de signo
            System.out.println(" ");
        }
 
        System.out.println("Comparamos la matriz original A con la opuesta a su transpuesta");
        
        int Contador_Diferencias = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if( MatrizAntiSim [i][j]!= Matriz[i][j] ){
                    Contador_Diferencias ++;
                    //System.out.print("La coordenada "+(i)+"/"+(j)+" de la matriz original que es: ["+ Matriz[i][j]+"]");
                    //System.out.println(" es distinta a la coordenada "+(i)+"/"+(j)+" De la matriz opuesta a la Transpuesta que es: ["+MatrizAntiSim[i][j]+"]");
                }      
            }
        }
        
        if (Contador_Diferencias == 0) {
            System.out.println("La Matriz original A es asimetrica ya que todas sus coordenadas coinciden con las de la matriz opuesta a su traspuesta");
        } else {
            System.out.println("La Matriz original A NO es asimetrica ya que la totalidad de sus coordenadas NO coinciden con las de la matriz opuesta a su traspuesta");
        }
    }
    
}
       
