/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prog_Ev02_Ej04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[0];
        int sueldo = 0;
        int suma = 0;
        do {
            System.out.println("Introduce tu sueldo: ");
            sueldo = scan.nextInt();
            if (sueldo != -1) {
                Integer[] temp = new Integer[array.length + 1];
                for (int i = 0; i < array.length; i++) {
                    temp[i] = array[i];
                }
                temp[array.length] = sueldo;
                array = temp;
            }
        } while (sueldo != -1);
        System.out.println(Arrays.toString(array));        
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println(Arrays.toString(array));        
        System.out.println("La media es: " + (float)(suma/array.length));
        System.out.println("El menor sueldo es de: " + array[array.length-1]);
        System.out.println("El mayor sueldo es de: " + array[0]);
    }

}
