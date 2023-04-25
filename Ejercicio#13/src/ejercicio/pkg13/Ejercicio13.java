/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio13 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int dimensiones = leer.nextInt();
        /* Se modifica el bucle for usando "<=" para que cada bucle se repita 
        el número de veces indicada por el usuario.
        Si se ingresó un 5, necesitamos que cada bucle se repita 5 veces y no 4, de lo
        contrario, no dibujaría el cuadrado correctamente
         */
        for (int i = 1; i <= dimensiones; i++) {
            for (int j = 1; j <= dimensiones; j++) {
                if (i > 1 && i < dimensiones && j > 1 && j < dimensiones) {
                    System.out.print("  ");

                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
