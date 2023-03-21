package Ejercicios.BuclesFor;

import java.util.Scanner;

public class Ej3_27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean check = true;
        while (check) {
            System.out.println("Introduce un numero del 1 al 10");
            num = scan.nextInt();
            if (num > 0 && num <= 10) {
                check = false;
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }

}
