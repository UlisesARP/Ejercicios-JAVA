/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio20 {

    /**
     * Crear un programa que permita introducir un cuadrado por teclado y
     * determine si este cuadrado es mágico o no. El programa deberá comprobar
     * que los números introducidos son correctos, es decir, están entre el 1 y
     * el 9.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los digitos que formarán el cuadrado mágico!");
        System.out.println("Deberán ser digitos entre 1 y 9, el cuadrado tendrá dimensiones de 3x3");
        int digitos;
        int[][] cuadrado = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número de la fila " + (i+1) + " y columna " + (j+1) + ": ");
                digitos = leer.nextInt();
                cuadrado[i][j]=digitos;
                if (digitos < 1 || digitos >= 10){
               do{
                   System.out.println("El número ingresado está fuera del rango establecido, ingrese un número válido");
                   digitos= leer.nextInt();
                   cuadrado[i][j]=digitos;
               }while(digitos <= 0 || digitos >= 10);
               }
            }
            
        }
        // Sumar la primera fila para comparar con las demás sumas
        int suma = 0;
        boolean esMagico = true;
        for (int i = 0; i < 3; i++) {
            suma += cuadrado[0][i];
        }
        // Comprobar que las filas tienen la misma suma
        for (int i = 1; i < 3; i++) {
            int filaSuma = 0;
            for (int j = 0; j < 3; j++) {
                filaSuma += cuadrado[i][j];
            }
            if (filaSuma != suma) {
                esMagico = false;
                break;
            }
        }
        // Comprobar que las columnas tienen la misma suma
        for (int i = 0; i < 3; i++) {
            int colSuma = 0;
            for (int j = 0; j < 3; j++) {
                colSuma += cuadrado[j][i];
            }
            if (colSuma != suma) {
                esMagico = false;
                break;
            }
        }
        // Comprobar que las diagonales tienen la misma suma
        int diag1Suma = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int diag2Suma = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (diag1Suma != suma || diag2Suma != suma) {
            esMagico = false;
        }
        // Mostrar el resultado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j]+" ");
            }
            System.out.println("");
        }
        if (esMagico) {
            System.out.println("El cuadrado introducido es mágico.");
        } else {
            System.out.println("El cuadrado introducido no es mágico.");
        }
    }

}
