package Ejercicios.BuclesFor;

import java.util.Scanner;

public class Ej3_24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero para contar: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }

}
