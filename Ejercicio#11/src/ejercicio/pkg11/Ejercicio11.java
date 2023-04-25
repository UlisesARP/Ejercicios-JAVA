/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /**
         * Primero, definimos las variables que usaremos en nuestro codigo,
         * donde int serán números enteros, num 1 y num2 para los valores
         * ingresados por teclado que serán con los que realizaremos las
         * operaciones matematicas en el menú y "respuesta" para elegir cual es
         * la operación que deseamos realizar
         */
        int num1, num2, respuesta;
        /**
         * Una variable tipo "char" que es donde se guardará la opción del
         * usuario en caso de seleccionar la opcion 5 y querer salir del
         * programa
         */
        char confirmacion;
        /**
         * Por ultimo, una variable tipo boolean (verdadero/falso) que será
         * nuestra condicional para salir del bucle y terminar el programa
         */
        boolean opcion = true;
        /**
         * En ésta parte, utilicé dos bucles do/while para que solamente acepte
         * números enteros, si el usuario ingresa un número menor a 0, le
         * seguirá pidiendo que ingrese un número valido
         */
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            num1 = leer.nextInt();
        } while (num1 <= 0);

        do {
            System.out.print("Ingrese el segundo número entero positivo: ");
            num2 = leer.nextInt();
        } while (num2 <= 0);
        /**
         * Luego de obtener los números que necesitamos, iniciamos el bucle
         * do/while en donde estará nuestro menú de opciones
         */
        do {
            System.out.println("***  Menu  ***");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("*** Elija una opción ***");
            respuesta = leer.nextInt();
            switch (respuesta) {

                case 1:
                    System.out.println("La suma de los dos números ingresados es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de " + num1 + " por " + num2 + " es " + (num1 * num2));
                    break;
                /**
                 * En el case 4 en particular, coloqué un condicional if/else,
                 * donde si el segundo número ingresado por el usuario es igual
                 * a 0, mostrará un mensaje por pantalla avisando de que es
                 * imposible dividir por 0, de lo contrario, hará la operacion
                 * como en el resto de opciones
                 */
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("El cociente es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Seguro que desea salir del programa?");
                    System.out.println("S/N");
                    /**
                     * Este es el caso final, el de salida, donde el usuario
                     * decide salir del menú y cerrar el programa y se le pedirá
                     * la confirmación la cual será ingresada por teclado
                     */
                    confirmacion = leer.next().charAt(0);
                    /**
                     * Si volvemos al inicio del codigo, al definir nuestra
                     * variable llamada "opcion" le damos un valor de
                     * verdadero(true) el cual se mantendrá así y repetirá el
                     * bucle a menos de que el usuario ingrese el caracter S/s
                     * para terminar con la ejecución del programa.
                     */
                    if (confirmacion == 'S' || confirmacion == 's') {
                        /**
                         * Al usuario ingresar el caracter S/s, la variable
                         * opción tendrá ahora un valor de falso(false),
                         * terminando así, con la ejecución del programa
                         */
                        opcion = false;
                        System.out.println("¡Hasta luego!");
                    }
                    break;
            }
            //El programa se seguirá ejecutando hasta que la variable opción sea falsa
        } while (opcion == true);
    }

}
