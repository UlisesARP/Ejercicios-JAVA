/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author ulise
 */
public class Ejercicio15 {

    /**
     * Realizar un algoritmo que rellene un vector con los 100 primeros números
     * enteros y los muestre por pantalla en orden descendente.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] NumerosEnteros = new int[100];
        for (int i = 0; i < 100; i++) {
            NumerosEnteros[i] = (i + 1);
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(NumerosEnteros[i]);
        }
    }

}
