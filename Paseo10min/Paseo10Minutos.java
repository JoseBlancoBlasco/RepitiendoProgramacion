package Paseo10min;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Paseo10Minutos {

    public static void main(String[] args) {
        // Pedimos el tamaño de la cuadrícula
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la cuadrícula: ");
        int size = scanner.nextInt();

        // Pedimos las coordenadas iniciales
        System.out.print("Introduce la coordenada X inicial: ");
        int x = scanner.nextInt();
        System.out.print("Introduce la coordenada Y inicial: ");
        int y = scanner.nextInt();

        String[] directions = Paseos.generarPaseoAleatorio();

        boolean dentroLimites = Paseos.isLimites(directions, x, y, size);

        do {
            directions = Paseos.generarPaseoAleatorio();
            dentroLimites = Paseos.isLimites(directions, x, y, size);
        } while (!dentroLimites);




        char[][] grid = Paseos.pintarCuadricula(size, x, y, directions);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }





}

