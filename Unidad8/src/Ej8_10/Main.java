
package Ej8_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> numerosPositivos = new ArrayList<>();
        List<Double> numerosNegativos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.print("Introduce un número real (0 para terminar): ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                numerosPositivos.add(numero);
            } else if (numero < 0) {
                numerosNegativos.add(numero);
            }
        } while (numero != 0);

        System.out.println("Colección de números positivos: " + numerosPositivos);
        System.out.println("Colección de números negativos: " + numerosNegativos);

        double sumaPositivos = 0;
        Iterator<Double> iteratorPositivos = numerosPositivos.iterator();
        while (iteratorPositivos.hasNext()) {
            double num = iteratorPositivos.next();
            sumaPositivos += num;
            if (num < 10) {
                iteratorPositivos.remove();
            }
        }

        double sumaNegativos = 0;
        Iterator<Double> iteratorNegativos = numerosNegativos.iterator();
        while (iteratorNegativos.hasNext()) {
            double num = iteratorNegativos.next();
            sumaNegativos += num;
            if (num > -10) {
                iteratorNegativos.remove();
            }
        }

        System.out.println("Suma de los números positivos: " + sumaPositivos);
        System.out.println("Suma de los números negativos: " + sumaNegativos);

        System.out.println("Colección de números positivos después de la eliminación: " + numerosPositivos);
        System.out.println("Colección de números negativos después de la eliminación: " + numerosNegativos);
    }
}

