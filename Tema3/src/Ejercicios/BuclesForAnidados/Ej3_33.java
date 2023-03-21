package Ejercicios.BuclesForAnidados;

import java.util.Scanner;

public class Ej3_33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero para convertir a binario: ");
        int num = scan.nextInt();        
        while(num>=1){
            System.out.print(num%2);
            num=num/2;
        }

    }

}
