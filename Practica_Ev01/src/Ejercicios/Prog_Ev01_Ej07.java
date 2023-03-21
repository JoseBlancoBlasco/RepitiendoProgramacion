package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora.");
        System.out.println("Introduce el primer numero:");
        double num1 = scan.nextFloat();
        System.out.println("Introduce el segundo numero:");
        double num2 = scan.nextFloat();
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1+num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + (num1*num2));
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + (num1/num2));
        System.out.println("La potencia de " + num1 + " es: " + potencia(num1));
        System.out.println("La raiz de " + num1 + " es: " + raiz(num1));
    }
    
    public static double potencia(double num1){
        return Math.pow(num1, 2);
    }
    public static double raiz (double num1){
        return Math.sqrt(num1);
    }

}
