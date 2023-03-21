/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Ej05 {

    public static void main(String[] args) {
        int[][] notas = new int[5][3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce las notas del alumno " + (i + 1));
            System.out.print("Primer trimestre: ");
            notas[i][0] = scan.nextInt();
            System.out.print("Segundo trimestre: ");
            notas[i][1] = scan.nextInt();
            System.out.print("Tercer trimestre: ");
            notas[i][2] = scan.nextInt();
        }

        float[] mediaTrimestres = getMediaTrimestres(notas);
        System.out.println("Media primer trimestre: " + mediaTrimestres[0]);
        System.out.println("Media segundo trimestre: " + mediaTrimestres[1]);
        System.out.println("Media tercer trimestre: " + mediaTrimestres[2]);

        System.out.print("Introduce la posición del alumno a consultar su media: ");
        int alumno = scan.nextInt();
        float mediaAlumno = getMediaAlumno(notas, alumno);
        System.out.println("La media del alumno " + alumno + " es: " + mediaAlumno);
    }

    public static float[] getMediaTrimestres(int[][] notas) {
        float[] media = new float[3];
        for (int j = 0; j < 3; j++) {
            float sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += notas[i][j];
            }
            media[j] = sum / 5;
        }
        return media;
    }

    public static float getMediaAlumno(int[][] notas, int alumno) {
        float sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += notas[alumno][j];
        }
        return sum / 3;
    }
}
