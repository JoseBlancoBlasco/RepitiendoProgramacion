package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog_Ev02_Ej11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        //double dineroRecaudado = 0;
        
        System.out.println("Cuantos jugadores van a jugar?: ");
        int numJugadores = scan.nextInt();
        int[][][][] cartones = new int[numJugadores][][][];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Introduce el número de cartones del jugador " + (i + 1) + ": ");
            int numCartones = scan.nextInt();
            //dineroRecaudado += numCartones * 2;
            cartones[i] = new int[numCartones][3][5];
        }
        for (int i = 0; i < numJugadores; i++) {
            for (int j = 0; j < cartones[i].length; j++) {
                cartones[i][j] = crearCarton(i+1,j+1);
            }
        }

//        int[] bombo = sacarNumerosBombo();
//        int numeroSacado;
//        for (int i = 1; i <= numJugadores; i++) {
//            for (int j = 0; j < cartones[i].length; j++) {
//                for (int k = 0; k < 90; k++) {
//                    numeroSacado = bombo[k];
//                    tacharNumero(cartones[i][j], numeroSacado);
//                    //aqui se comprueban las lineas y el bingo
//                }
//            }
//        }

//        double premioTotal = dineroRecaudado * 0.7;
//        double premioLinea = dineroRecaudado * 0.25;
//        double premioSala = dineroRecaudado * 0.05;
//        System.out.println("Premio total: " + premioTotal + "€");
//        System.out.println("Premio línea: " + premioLinea + "€");
//        System.out.println("Premio sala: " + premioSala + "€");

    }

    public static int[][] crearCarton(int numJugador,int numCarton) {
        int[][] carton = new int[3][9];
        int[] numerosGenerados = new int[27];

        int n;
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                do {
                    switch (j) {//Relleno por columna segun las decenas
                        case 0: // Primera columna
                            n = aleatorio(1, 9);
                            break;

                        case 8: // Última columna
                            n = aleatorio(80, 90);
                            break;

                        default: // Columnas intermedias
                            n = aleatorio(10 * j, (10 * j) + 9);
                            break;
                    }
                } while (contiene(n, numerosGenerados, contador));

                numerosGenerados[contador] = n;
                contador++;
                carton[i][j] = n;
            }
        }

        // Ordena las columnas
        for (int j = 0; j < 9; j++) {
            int[] columna = sacaColumna(j, carton);
            Arrays.sort(columna);
            meteColumna(j, columna, carton);
        }

        meteHuecos(carton);
        pintaCarton(carton, numJugador, numCarton);

        return carton;
    }

    //Numero aleatorio en un rango
    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    //Cojo una columna del carton y la copio a otro Array
    public static int[] sacaColumna(int c, int[][] carton) {
        int[] aux = new int[3];
        for (int i = 0; i < 3; i++) {
            aux[i] = carton[i][c];
        }
        return aux;
    }

    //Devuelvo la columna que he ordenado previamente con Sort a su origen en el carton
    public static void meteColumna(int c, int[] columna, int[][] carton) {
        for (int i = 0; i < 3; i++) {
            carton[i][c] = columna[i];
        }
    }

    //Para comprobar si esta relleno el carton
    public static boolean contiene(int numero, int[] array, int contador) {
        for (int i = 0; i < contador; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }

    //Meto 0´s en el carton aleatoriamente
    public static void meteHuecos(int[][] carton) {
        for (int i = 0; i < 3; i++) {
            int huecos = 0;
            do {
                int posicion = aleatorio(0, 8);
                if (carton[i][posicion] != 0) {
                    carton[i][posicion] = 0;
                    huecos++;
                }
            } while (huecos < 4);
        }
    }

    //Muestro el carton, si hay algun 0 se traduce por un hueco
    public static void pintaCarton(int[][] carton,int numJugador, int numCarton) {
        System.out.println("****************************");
        System.out.println("Jugador " + numJugador);
        System.out.println("Carton Nº " + numCarton);
        for (int[] fila : carton) {            
            for (int numero : fila) {
                if (numero == 0) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d ", numero);
                }
            }
            System.out.println();
        }        
        System.out.println("****************************");
    }

    private static void tacharNumero(int[][] carton, int numeroSacado) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == numeroSacado) {
                    carton[i][j] = -1; // -1 para indicar que el número ha sido tachado
                }
            }
        }
    }
    
    public static int[] sacarNumerosBombo() {
        int[] numeros = new int[90];
        Random random = new Random();

        for (int i = 0; i < 90; i++) {
            int num = random.nextInt(90) + 1;
            while (isDuplicate(numeros, num)) {
                num = random.nextInt(90) + 1;
            }
            numeros[i] = num;
        }
        return numeros;
    }
    
    //Comprobamos que no se repita ningun numero en las bolas del bombo
    private static boolean isDuplicate(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    //Muestro la bola correspondiente a esa ronda
    private static void mostrarBola(int[] numeroBombo, int ronda) {
        System.out.println("Ronda " + ronda + ": " + numeroBombo[ronda - 1]);
    }
    
    private static boolean comprobarLinea(int[][] carton, int numero) {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton.length; j++) {
                if (carton[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

}
