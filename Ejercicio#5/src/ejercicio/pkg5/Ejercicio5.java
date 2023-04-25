/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
     doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
      Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("El doble del número ingresado es : "+(num*2));
        System.out.println("El triple del número ingresado es : "+(num*3));
        System.out.println("La raíz cuadrada del número ingresado es : "+Math.sqrt(num));
        
        
    }
    
}
