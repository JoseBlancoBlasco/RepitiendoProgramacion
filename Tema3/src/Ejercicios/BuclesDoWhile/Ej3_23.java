package Ejercicios.BuclesDoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ej3_23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNum1;
        int randomNum2;
        int suma;
        boolean finish;
        do {
            randomNum1 = rand.nextInt(100) + 1;
            randomNum2 = rand.nextInt(100) + 1;
            System.out.println("Calcula la suma de " + randomNum1 + " y " + randomNum2);
            suma = scan.nextInt();
            if (suma == (randomNum1 + randomNum2)) {
                System.out.println("Acertaste. Sigamos.");
                finish = false;
            } else {
                System.out.println("Fallaste. Adios!");
                finish = true;
            }

        } while (!finish);

    }

}
