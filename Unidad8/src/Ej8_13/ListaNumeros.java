
package Ej8_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Leer números enteros positivos hasta que se introduzca uno negativo
        int numero;
        do {
            System.out.print("Introduce un número entero positivo (introduce un negativo para finalizar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                numeros.add(numero);
            }
        } while (numero >= 0);

        // Recorrer la lista y mostrar los índices de los elementos de valor par, multiplicados por 100
        for (int i = 0; i < numeros.size(); i++) {
            int elemento = numeros.get(i);
            if (elemento % 2 == 0) {
                int resultado = i * 100;
                System.out.println("Elemento en el índice " + i + " es par. Resultado: " + resultado);
            }
        }
    }
}

