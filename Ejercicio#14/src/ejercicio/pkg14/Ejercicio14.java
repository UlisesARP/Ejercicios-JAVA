/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio14 {

    /**
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a converir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        int euros = leer.nextInt();
        System.out.print("Ingrese la moneda en la cual desea realizar el cambio(Dolares, Yenes o libras)");
        String moneda = leer.next();
        cambio(euros, moneda);
    }

    public static void cambio(int euros, String moneda) {
        double cambioFinal;
        /**
         * Usamos el metodo toLowerCase(), para convertir la cadena a minusculas
         * así, si el usuario ingresó la moneda de cambio en mayusculas, el
         * programa puede seguir funcionando
         */
        switch (moneda.toLowerCase()) {
            case "dolares":
                cambioFinal = (1.28611 * euros);
                System.out.println("El cambio de Euros a " + moneda + " es: " + cambioFinal);
                break;
            case "yenes":
                cambioFinal = (129.852 * euros);
                System.out.println("El cambio de Euros a " + moneda + " es: " + cambioFinal);
                break;
            case "libras":
                cambioFinal = (0.86 * euros);
                System.out.println("El cambio de Euros a " + moneda + " es: " + cambioFinal);
                break;
            default:
                System.out.println("La moneda que ha ingresado no es soportada en este programa");
        }
    }
}
