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
 * 5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
* USAR BREAK Y CONTINUE
 */

public class Ejercicio_5_Guia2 {
    
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un valor limite positivo");
    int limite = leer.nextInt();
    int suma = 0;
    
    while (suma <= limite){
        System.out.println("Ingrese un valor");
       int num = leer.nextInt();
        suma += num;
        System.out.println("Hasta el momento la suma es de :" + suma);
        if (suma > limite) {
        System.out.println("Ha superado el limite - La suma actualizada es de: " + suma + ", por otro lado, la suma previa al paso del limite fue de: " + (suma-num));    
        }
    }
  
    
    }    
}
