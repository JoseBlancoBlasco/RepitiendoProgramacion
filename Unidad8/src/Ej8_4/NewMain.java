/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej8_4;

import java.util.Scanner;

public class NewMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contenedor<Integer> pila = new Contenedor<>();

        int num = sc.nextInt();
        while (num != -1) {
            if (num > 0) {
                pila.apilar(num);
            }
            num = sc.nextInt();
        }

        while (!pila.isEmpty()) {
            System.out.println(pila.desapilar());
        }
    }
}
