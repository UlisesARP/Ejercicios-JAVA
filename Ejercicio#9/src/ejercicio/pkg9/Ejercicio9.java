/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio9 {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Substring y equals() de Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        if (palabra.substring(0,1).equalsIgnoreCase("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
