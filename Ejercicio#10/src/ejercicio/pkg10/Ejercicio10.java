/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el límite que desea otorgarle al programa");
        int limite = leer.nextInt();
        int num = 0;
        do {
            System.out.println("Ingrese un número");
             num = num+leer.nextInt();
        
        } while (limite > num );
        System.out.println("Programa terminado");
    }

}
