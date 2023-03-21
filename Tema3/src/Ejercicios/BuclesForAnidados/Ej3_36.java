package Ejercicios.BuclesForAnidados;

import java.util.Scanner;

public class Ej3_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        System.out.println("Hasta: ");
        int hasta = scan.nextInt();
        int contador = 0;
        for (int i = 0; i < hasta; i++) {            
            if(esPrimo(i)){
                System.out.println("El numero " + i + " es primo.");
                contador++;
            }else{
                System.out.println("El numero " + i + " NO es primo.");
            }
        }
        System.out.println("Hay " + contador + " numeros primos.");
    }
    
    public static boolean esPrimo(int numero) {
  // El 0, 1 y 4 no son primos
  if (numero == 0 || numero == 1 || numero == 4) {
    return false;
  }
  for (int x = 2; x < numero / 2; x++) {
    // Si es divisible por cualquiera de estos números, no
    // es primo
    if (numero % x == 0)
      return false;
  }
  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
  return true;
}
}

