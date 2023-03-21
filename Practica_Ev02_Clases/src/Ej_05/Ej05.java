/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_05;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d, m, a;

        //Se pide por teclado el dia, mes y año
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = scan.nextInt();
        System.out.print("mes: ");
        m = scan.nextInt();
        System.out.print("año: ");
        a = scan.nextInt();

        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Calendario fecha = new Calendario(d, m, a);

        if (fecha.fechaCorrecta()) { //si la fecha es correcta

            //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida: " + fecha);

            //Se muestra el dia siguiente utilizando el método incrementarDia()                              
            System.out.println("El dia siguiente es:");
            fecha.incrementarDia();
            System.out.println(fecha);

        } else { //Si la fecha no es correcta
            System.out.println("Fecha no valida");
        }
    }

}
