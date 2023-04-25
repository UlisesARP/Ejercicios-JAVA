/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author ulise
 */
public class Ejercicio3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
     en minúsculas 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese una frase");
         String frase = leer.nextLine();
         System.out.println("La frase final en minisculas es: "+toLowerCase(frase)+" Y en mayusculas "+toUpperCase(frase));
         
    }
    
}
