/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int apuesta[] = new int[6];
        System.out.println("Haz tu apuesta: ");
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Numero " + (i+1) + " :");
            apuesta[i]=scan.nextInt();
        }
        int premiado[] = new int[6];
        for (int i = 0; i < premiado.length; i++) {
            premiado[i] = (1 + (int) (Math.random() * ((60 - 1) + 1)));            
        }
        Arrays.sort(premiado);
        System.out.println(Arrays.toString(premiado));
        System.out.println("Has tenido " + primitiva(apuesta,premiado) + " aciertos.");
        
    }

    static int primitiva(int apuesta[], int premiado[]) {
        int aciertos;
        int a;
        int p;
        // utilizaremos a como índice de la tabla apuesta
        // y p para recorrer premiado
        aciertos = 0;
        for (a = 0; a < apuesta.length; a++) // recorremos la tabla de apuesta
        {
            p = 0;
        // para cada número de la apuesta recorremos premiado
        // se podría hacer con un for, pero con el while evitamos vueltas innecesarias
            while (p < premiado.length && apuesta[a] != premiado[p]) {
                p++;
            }
            if (p < premiado.length) {
                aciertos++;
            }
        // si p indica un elemento de la tabla
        // tenemos un acierto más
        }
        return aciertos;
    }
}
