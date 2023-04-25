/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica.
 *
 * @author ulise
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int tamañoMatriz = leer.nextInt();
        int matriz[][] = new int[tamañoMatriz][tamañoMatriz];
        System.out.println("Ingrese los valores que ocuparán la matriz");
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                matriz[i][j] = leer.nextInt();//Los valores dentro de la matriz ingresan por teclado
            }
        }
        System.out.println("Matriz original");
        mostrar(matriz,tamañoMatriz);
        //*****
        int trasnpuesta[][] = new int [tamañoMatriz][tamañoMatriz];
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                trasnpuesta[i][j]= matriz[j][i];
            }
        }
        System.out.println("Transpuesta");
        mostrar(trasnpuesta,tamañoMatriz);
        boolean simetria = true;//Con esta variable comprobamos si es anti-simetrica o no
        //En éste bucle, se compara la matriz original con su transpuesta
        for (int j = 0; j < tamañoMatriz; j++) {
            for (int k = 0; k < tamañoMatriz; k++) {
                /*Si un digito en la fila X es diferente al de la columna Y, la 
                variable simetría pasa  a ser falsa
                Lo que significa que la matriz NO es antisimetrica
                 */
                if (matriz[j][k] != matriz[k][j]) {
                    simetria = false;
                    break;/*Con el break hacemos que salga segundo bloque for
                    ya que no hay necesidad de que siga comparando cada posición de
                    la matriz
                    */
                }
                if (!simetria) {
                    break;//salimos del segundo bloque for si la variable simetria es falsa
                    //Recodar el funcionamiento del operador "!"
                }
            }

        }
        if (simetria) {
            System.out.println("La matriz es anti simetrica");
        } else {
            System.out.println("La matriz no es anti simetrica");
        }
        
    }
    //Usé el codigo del ejercicio 18 para mostrar las matrices por pantalla
    public static void mostrar(int[][] matriz,int tamañoMatriz){
    for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j]+(" "));
            }
            System.out.println("");
        }
}
}
