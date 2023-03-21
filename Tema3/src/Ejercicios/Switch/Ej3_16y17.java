package Ejercicios.Switch;

import java.util.Random;
import java.util.Scanner;

public class Ej3_16y17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        int maximum = 99;
        int minimum = 1;
        //int range = maximum - minimum + 1;
        int range = maximum - minimum + 1;
        int randomNum1 = rn.nextInt(range) + minimum;
        int randomNum2 = rn.nextInt(range) + minimum;

        System.out.println("¿Que operacion quieres realizar?: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        int seleccion = scan.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Suma estos numeros: " + randomNum1 + " y " + randomNum2);
                int sumaUsuario = scan.nextInt();
                if (sumaUsuario == (randomNum1 + randomNum2)) {
                    System.out.println("Acertaste.");
                } else {
                    System.out.println("Fallaste.");
                }
                break;
            case 2:
                System.out.println("Resta estos numeros: " + randomNum1 + " y " + randomNum2);
                int restaUsuario = scan.nextInt();
                if (restaUsuario == (randomNum1 - randomNum2)) {
                    System.out.println("Acertaste.");
                } else {
                    System.out.println("Fallaste.");
                }
                break;
            case 3:
                System.out.println("Multiplica estos numeros: " + randomNum1 + " y " + randomNum2);
                int multiUsuario = scan.nextInt();
                if (multiUsuario == (randomNum1 * randomNum2)) {
                    System.out.println("Acertaste.");
                } else {
                    System.out.println("Fallaste.");
                }
                break;
            default:
                System.out.println("Entrada erronea.");
                break;
        }        
    }

}
