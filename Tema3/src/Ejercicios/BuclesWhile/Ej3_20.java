package Ejercicios.BuclesWhile;

import java.util.Scanner;

public class Ej3_20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce edades de alumnos, cero para salir.");
        int edad = scan.nextInt();
        int suma = 0;
        int numAlumnos = 0;
        int alumnosMayores = 0;
        float media = 0;
        while (edad >= 0) {
            suma += edad;
            numAlumnos++;
            media = (float)suma / numAlumnos;
            if (edad >= 18) {
                alumnosMayores++;
            }
            System.out.println("La suma de las edades introducidas es: " + suma);
            System.out.println("La media de las edades es: " + media);
            System.out.println("El numero de alumnos es: " + numAlumnos);
            System.out.println("Los alumnos mayores de edad son: " + alumnosMayores);

            System.out.println("Introduce edades de alumnos, cero para salir.");
            edad = scan.nextInt();
        }
        System.out.println("Adios!");
    }

}
