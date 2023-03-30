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
public class Ejercicio_2_Guia2 {

    /**
     * @param args the command line arguments
     2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.**/
    
    // FUNCION EQUALS //
// Para asociar dos objetos y ver si ambos son del mismo tipo y tienen los mismos datos -- confirmar //
// String confirma  = leer.next();
// if (confirma.equals(valor)) {
// (acciones); 
// }
           
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
    }