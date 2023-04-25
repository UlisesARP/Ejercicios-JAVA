/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21;

import java.util.Arrays;

/**
 *
 * @author ulise
 */
public class Ejercicio21 {

    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 89, 90, 17, 12, 87, 67},
        {41, 87, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 36, 5, 67, 48, 49, 50},
        {51, 52, 53, 54, 89, 90, 75, 58, 59, 60},
        {61, 62, 63, 64, 14, 22, 26, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 36, 5, 67},
        {81, 82, 83, 84, 85, 86, 87, 89, 90, 75},
        {91, 92, 93, 94, 95, 96, 97, 14, 22, 26}};
        int[][] P = {{36, 5, 67},
        {89, 90, 75},
        {14, 22, 26}};
        boolean confirmar = false;
        int contador = 0;
        int[][] subMatriz = new int[3][3];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                /* Para este ejercicio, es más facil y practico a la hora de leerlo
                crear una nueva matriz con dimensiones de 3x3 que se irá reescribiendo 
                con las subMatricez 3x3 dentro de la matriz principal (10x10)
                al final, se comparará con la matriz P y si son iguales, la variable
                "confirmar" pasará a ser true
                 */
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        subMatriz[k][l] = M[i + k][j + l];
                    }

                }
                if (Arrays.deepEquals(subMatriz, P)) {
                    confirmar = true;
                    contador++;
                    int[] ubicacion = new int[2];
                    ubicacion[0] = i;
                    ubicacion[1] = j;
                    System.out.println("La submatriz P se encuentra " + contador + " veces dentro de la matriz M");
                    System.out.println("La submatriz P comienza en la fila " + ubicacion[0] + " y columna " + ubicacion[1] + " de la matriz M.");
                }

            }

        }

    }
}
