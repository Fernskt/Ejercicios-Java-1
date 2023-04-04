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
 * 3. Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.*/
 
public class Ejercicio_Extra_3 {
    public static void main(String[] args){
    
        System.out.println("Se rellenara 1 vector de tamaño N y luego se imprimira por pantalla - usaremos 2 funciones");
        System.out.println("Ingrese el valor de N: tamano del vector");
        
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt(); // N = tamano del vector
        int [] vector = new int[N]; // se crea el vector y se le asigna el tamano N
        
        vector = LLenadoV(N); // se asigna la funcion de llenado al vector creado previamente
        
        MuestraV(vector,N); // para la muestra del vector se uso un PROCEDIMIENTO ya se solo se debe 
                            // realizar una accion y no se seguira trabajando con el vector luego
    }
    
public static int [] LLenadoV(int N){ // funcion de llenado del vector = solo se pasa TAMANO como PARAMETRO
int [] vector_en_funcion = new int[N]; // se crea el vector dentro de la funcion y se le asigna el 
                                        //tamano que se paso por parametro
    
for (int i = 0; i < N; ++i) {
            vector_en_funcion[i] = (int) (Math.random() * 100);
        }
return vector_en_funcion; // RETORNO de la funcion sera el VECTOR
} 

public static void MuestraV(int[] vector,int N){ // se pide como parametros el vector y el tamano

    System.out.println("Ahora mostraremos el Vector");
        
        for (int i = 0; i < N; ++i) {
            System.out.print("["+vector[i]+"], ");
        }


}

}
    
    

