/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Pedimos al usuario que ingrese la dimensión del Vector
        System.out.println("Ingrese la dimensión que desea otorgarle al vector");
        int Dimension = leer.nextInt();
        int[] Vector = new int[Dimension];
        System.out.println("Ingrese los " + Dimension + " elementos del vector");
        for (int i = 0; i < Dimension; i++) {
            Vector[i] = leer.nextInt();//Los valores dentro de cada variable, se ingresarán por teclado
        }
        /**
         * Este nuevo vector contendrá variables que actuarán como "contadores"
         * que irán en aumento dependiendo de cuantas variables superen el
         * rangode 1 digito,2 digitos,etc...
         */
        int[] contador = new int[6];
        for (int i = 0; i < Dimension; i++) {
            int num = Vector[i];
            /**
             * El valor de la variable "num" se irá reescribiendo con el valor
             * guardado en la posición "i" del vector, para luego compararlo en
             * la condicional "if/else" y darle valor a los contadores
             */
            if (num >= 0 && num < 10) { //Numeros de 1 Digito
                contador[0]++;
            } else if (num >= 10 && num < 100) { //Numeros de 2 Digitos
                contador[1]++;
            } else if (num >= 100 && num < 1000) { //Numeros de 3 Digitos
                contador[2]++;
            } else if (num >= 1000 && num < 10000) { //Numeros de 4 Digitos
                contador[3]++;
            } else if (num >= 10000 && num < 100000) {
                contador[4]++; //Numeros de 5 digitos
            } else {
                contador[5]++;//Para numeros mayores a 5 Digitos, se tomarán como "Fuera de rango"
            }
        }
        //Al final, mostramos los resultados por pantalla
        System.out.println("Cantidad de números de 1 dígito: " + contador[0]);
        System.out.println("Cantidad de números de 2 dígitos: " + contador[1]);
        System.out.println("Cantidad de números de 3 dígitos: " + contador[2]);
        System.out.println("Cantidad de números de 4 dígitos: " + contador[3]);
        System.out.println("Cantidad de números de 5 dígitos: " + contador[4]);
        System.out.println("Cantidad de números fuera de rango: " + contador[5]);
    }

}
