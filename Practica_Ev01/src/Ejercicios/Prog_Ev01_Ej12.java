package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero para ver sus factores.");
        int num = scan.nextInt();        

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
