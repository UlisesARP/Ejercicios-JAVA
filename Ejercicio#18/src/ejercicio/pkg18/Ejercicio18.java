/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;

import java.util.Random;

/**
 *
 * @author ulise
 */
public class Ejercicio18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numeroRamdom = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = numeroRamdom.nextInt(10);
            }
        }
        System.out.println("Matriz principal:");
        //Llamamos a la función para mostrarla por pantalla
        mostrar(matriz);
        //*****Ahora creamos otra matriz con los valores traspuestos de la matriz principal*****
        int traspuesta[][] = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j]= matriz[j][i];
            }
        }
        //Llamamos a la funcion para mostrarla por pantalla
        System.out.println("Matriz transpuesta:");
        mostrar(traspuesta);
    }
    //Función que muestra la Matriz original y la traspuesta al ser llamadas en el codigo principal
public static void mostrar(int[][] matriz){
    for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+(" "));
            }
            System.out.println("");
        }
}


} 