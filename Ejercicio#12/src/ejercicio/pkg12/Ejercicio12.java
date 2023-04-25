/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        do {
            System.out.print("Ingrese una cadena de caracteres:");
            cadena = leer.nextLine();
            /**
             * Otra manera de utilizar esta condición es con charAt(0) y
             * charAt(4), ya que con char pediriamos un caracter en especifico,
             * y en este caso, sería el primer y ultimo caracter, pero como el
             * ejercicio lo pide utilizamos subString() y .equals
             */
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                //Si la condición se cumple, el número de cadenas correctas incrementa +1
                correctas++;
                //Si la cadena ingresada es "&&&&&" se usa el break; para salir del bucle
            } else if (cadena.equals("&&&&&")) {
                break;
                /*De lo contrario, si la cadena ingresada es incorrecta o noes "&&&&&", será tomada
                como incorrecta y las cadenas incorrectas ingresadas aumentará +1
                 */
            } else {
                incorrectas++;
            }
            /* Aquí utilizamos el operador de negacion "!" indicandole al programa
            que mientras la cadena ingresada por teclado no sea "&&&&&" el bucle se siga
            repitiendo
            Quiere decir, que mientras la cadena ingresada NO sea "&&&&&", el bucle seguirá infinitamente
             */
        } while (!cadena.equals("&&&&&"));
        //Por ultimo imprimimos los resultados por pantalla
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }

}
