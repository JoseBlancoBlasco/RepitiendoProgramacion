package Ejercicios.BuclesIf;

import java.util.Scanner;


public class Ej3_03 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scan.nextInt();
        System.out.println("Introduce tus ingresos: ");
        float ingresos = scan.nextFloat();
        if (ingresos <1000) {
            System.out.println("No tributar");
        }else if(edad<17){
            System.out.println("No tributas.");
        }else{
            System.out.println("A pagarrr");
        }
    }

}
