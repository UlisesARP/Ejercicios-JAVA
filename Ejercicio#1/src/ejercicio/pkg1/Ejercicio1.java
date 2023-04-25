/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio1 {

    /**
     Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
     dos. El programa deberá después mostrar el resultado de la suma
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer número entero");
        int num1= leer.nextInt();
        System.out.println("Ingrese el segundo número entero");
        int num2= leer.nextInt();
        System.out.println("El resultado de la suma de los valores ingresados es: "+(num1+num2));
    }
    
}
