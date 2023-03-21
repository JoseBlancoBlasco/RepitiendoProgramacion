package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9.999.");
        int num = scan.nextInt();
        boolean check = false;
        do {
            if (num < 1 || num > 999) {
                System.out.println("Introduce un numero entre 0 y 9.999.");
                num = scan.nextInt();
            } else {
                check = true;
            }
        } while (!check);
        int cont = 0;
        while(num!=0){
            num = num/10;
            cont++;
        }
        System.out.println("El numero tiene " + cont + " cifras.");
        
    }

}
