
package Ej8_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();
        int num;
        do {
            System.out.print("Introduce un número entero positivo (-1 para terminar): ");
            num = scan.nextInt();
            if (num >= 0) {
                numeros.add(num);
            }
        } while (num >= 0);
        
        System.out.println("La colección es: " + numeros);
        
        Collection<Integer> pares = new ArrayList<>();
        Iterator<Integer> iter = numeros.iterator();
        while (iter.hasNext()) {
            int n = iter.next();
            if (n % 2 == 0) {
                pares.add(n);
            }
        }
        System.out.println("Los valores pares son: " + pares);
        
        iter = numeros.iterator();
        while (iter.hasNext()) {
            int n = iter.next();
            if (n % 3 == 0) {
                iter.remove();
            }
        }
        System.out.println("La colección resultante es: " + numeros);
    }
}

    

