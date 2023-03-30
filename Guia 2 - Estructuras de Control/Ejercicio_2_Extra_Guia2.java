/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author sofimai
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio_2_Extra_Guia2 {
    public static void main(String[] args){
    
        int A = 0; // toma valor de D = 3
        int B = 1; // toma valor de C = 2
        int C = 2; // toma valor de A = 0
        int D = 3; // toma valor de B = 1
     
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);
        
    int aux;

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
    
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D + " aux: " + aux);
    
            
    
   
    
    }
}
