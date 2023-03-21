package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un numero para descomponerlo");
        int num = scan.nextInt();
        descomponer(num);
    }

    public static void descomponer(int number) {
        if (number > 0) {
            descomponer(number / 10);
            System.out.println(number % 10);
        }
    }

}
