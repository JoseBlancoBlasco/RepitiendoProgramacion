package Ejercicios.BuclesForAnidados;

import java.util.Scanner;

public class Ej3_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero para convertir a decimal: ");
        int binario = scan.nextInt();
        int decimal = 0;
        int digito;
        final long DIVISOR = 10;
        for (long i = binario, j = 0; i > 0; i /= DIVISOR, j++) {
            digito = (int) (i % DIVISOR);
            //if (digito != 0 && digito != 1) break;
            decimal += digito * Math.pow(2, j);
        }
        System.out.println(decimal);
    }
}
