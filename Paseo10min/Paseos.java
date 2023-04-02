package Paseo10min;

import java.util.Arrays;
import java.util.Random;

public class Paseos {

    public static boolean isLimites(String[] paseo, int x, int y, int size) {
        for (String direccion : paseo) {
            switch (direccion) {
                case "N":
                    y++;
                    break;
                case "S":
                    y--;
                    break;
                case "E":
                    x++;
                    break;
                case "O":
                    x--;
                    break;
            }
            if (x < 0 || x >= size || y < 0 || y >= size) {
                return false;
            }
        }
        return true;
    }

    public static String[] generarPaseoAleatorio() {
        Random random = new Random();
        String[] direcciones = new String[10];
        String ultimaDireccion = "";
        for (int i = 0; i < direcciones.length; i++) {
            int direccionAleatoria = random.nextInt(4);
            String direccionActual = "";
            switch (direccionAleatoria) {
                case 0:
                    direccionActual = "N";
                    break;
                case 1:
                    direccionActual = "S";
                    break;
                case 2:
                    direccionActual = "E";
                    break;
                case 3:
                    direccionActual = "O";
                    break;
            }
            // Verificar que la dirección actual no sea igual a la anterior ni la opuesta
            while (direccionActual.equals(ultimaDireccion) || esDireccionOpuesta(direccionActual, ultimaDireccion)) {
                direccionAleatoria = random.nextInt(4);
                switch (direccionAleatoria) {
                    case 0:
                        direccionActual = "N";
                        break;
                    case 1:
                        direccionActual = "S";
                        break;
                    case 2:
                        direccionActual = "E";
                        break;
                    case 3:
                        direccionActual = "O";
                        break;
                }
            }
            direcciones[i] = direccionActual;
            ultimaDireccion = direccionActual;
        }
        return direcciones;
    }

    // Función para verificar si dos direcciones son opuestas
    public static boolean esDireccionOpuesta(String direccion1, String direccion2) {
        return (direccion1.equals("N") && direccion2.equals("S")) ||
                (direccion1.equals("S") && direccion2.equals("N")) ||
                (direccion1.equals("E") && direccion2.equals("O")) ||
                (direccion1.equals("O") && direccion2.equals("E"));
    }


    public static char[][] pintarCuadricula(int size, int x, int y, String[] directions) {
        char[][] grid = new char[size][size];
        // Inicializamos la cuadrícula
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
        // Pintamos la posición inicial
        grid[x][y] = 'A';
        // Recorremos la cuadrícula siguiendo las direcciones del paseo
        for (String direction : directions) {
            switch (direction) {
                case "N":
                    x--;
                    break;
                case "S":
                    x++;
                    break;
                case "E":
                    y++;
                    break;
                case "O":
                    y--;
                    break;
            }
            // Pintamos la casilla recorrida
            grid[x][y] = 'X';
        }
        // Pintamos la posición final
        grid[x][y] = 'B';
        return grid;
    }


}
