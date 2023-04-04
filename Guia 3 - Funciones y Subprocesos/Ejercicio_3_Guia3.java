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
 * Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 € 
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
public class Ejercicio_3_Guia3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Buenos dias! Ingrese la cantidad de euros que desea convertir");
        double euros = leer.nextInt();
        
        System.out.println("Ingrese la divisa a la cual desea convertir los euros: D = Dolares / Y = Yenes / L = Libras");
        String divisa = leer.next();
        System.out.println("*************** Convirtiendo ***************");
        
        Conversor(euros, divisa);
        
    }

    public static void Conversor(double euros, String divisa) {
        double resultado;
        String divisa1;
        
        switch (divisa.toLowerCase()) {
            case ("l"):
            resultado = euros * 0.86; 
            divisa1 = "Libras.";
            System.out.println(euros + "€ equivalen a " + resultado + " " + divisa1); 
            break;
            case ("d"):
            resultado = euros * 1.28611; 
            divisa1 = "Dolares.";
            System.out.println(euros + "€ equivalen a " + resultado + " " + divisa1); 
            break;
            case ("y"):
            resultado = euros * 129.852;
            divisa1 = "Yenes.";
            System.out.println(euros + "€ equivalen a " + resultado + " " + divisa1); 
            break;        
        }
        //System.out.println(euros + "€ equivalen a " + resultado + divisa1);    
    }
    
}
