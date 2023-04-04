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
 */
public class Ejercicio_Teoria_Concatenar_Frase {
    
    /*Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/ 
         
           
    public static void main(String[] args){
        System.out.println("Ingrese una frase la cual sera codificada");
    Scanner leer =new Scanner(System.in);
    
    String Frase = leer.nextLine();
    
    String FraseCod=""; //iniciar dos variables String en blanco
    String FraseCod2=""; //Estas variables se van a ir "escribiendo" a medida que se vayan
                             // codificando las letras
    
    int ContFrase =Frase.length();
    
    System.out.println("La frase ingresada tiene  "+ContFrase+" Caracteres y tal se codifica de las siguientes maneras: ");
        
    for (int i= 0;i<ContFrase;++i){
   
    String Letra = Frase.substring(i,i+1);
    
    switch(Letra) {

case "a":Letra ="@"; //reemplazar la letra por el signo
         FraseCod=FraseCod+Letra; // se llena la frase en blanco con el signo
         FraseCod2=FraseCod2.concat(Letra); // idem pero usando funcion concat
         System.out.print("@");
         break;
case "A":Letra ="@";
         FraseCod=FraseCod+Letra;   
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("@");
         break;         
case "e":Letra ="#";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("#");        
         break;
case "E":Letra ="#";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("#");        
         break;         
case "i":Letra ="$";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("$");        
         break;
case "I":Letra ="$";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("$");        
         break;
case "o":Letra ="%";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("%");        
         break;
case "O":Letra ="%";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("%");        
         break;
case "u":Letra ="*";
         FraseCod=FraseCod+Letra;;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("*");        
         break;
case "U":Letra ="*";
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         System.out.print("*");        
         break;         
default: System.out.print(Letra);
         FraseCod=FraseCod+Letra;
         FraseCod2=FraseCod2.concat(Letra);
         break;
                }
    }
System.out.println(" ");    
System.out.println("-Otro metodo mismo resultado-");
    System.out.println(FraseCod);
System.out.println("-Otro metodo mismo resultado-");
    System.out.println(FraseCod2);    

    }   
}

