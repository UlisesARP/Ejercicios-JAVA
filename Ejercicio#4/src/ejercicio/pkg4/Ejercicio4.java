/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
       Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados celcius que desea convertir!");
        //El tipo de variable que queremos usar acá es de tipo "double" para que en el resultado final
        //nos acepte decimales y así obtener un resultado exacto, sin redondear
        double grados = leer.nextInt();
        double Fahrenheit =((9*grados)/5)+32;
        System.out.println("El equivalente convertido a Fahrenheit es: "+Fahrenheit);
       
    }
    
}
