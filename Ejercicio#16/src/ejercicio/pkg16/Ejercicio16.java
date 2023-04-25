/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio16 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño que desea otorgarle al Vector: ");
        int vector = leer.nextInt();
        Random numeroRamdom = new Random();
        int num;
        int num2 = 0;
        int[] Aleatorio = new int[vector];
        for (int i = 0; i < vector; i++) {
            num = numeroRamdom.nextInt(20);
            Aleatorio[i] = num;
        }
        System.out.print("Ingrese el número que desea buscar dentro del vector: ");
        int buscarNumero = leer.nextInt();
        for (int i = 0; i < vector; i++) {
         if (Aleatorio[i] == buscarNumero){
             num2++;
            System.out.println("El número que ingresó se encuentra en la posición #"+(i+1)+" del arreglo");
         }   
        }
      if (num2 == 1){
            System.out.println("El número que ingresó se encuentra solo una vez dentro del arreglo" );
        }else if(num2 > 1){
            System.out.println("El número que ingresó se encuentra "+num2+" veces dentro del arreglo");
        }else{
            System.out.println("El número que ingresó no se encuentra dentro del arreglo");
        }  
    }

}
