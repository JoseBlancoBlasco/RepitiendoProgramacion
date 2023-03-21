package Ej_04;

import java.util.Scanner;

public class Ej04 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int precio =0,pagar = 0;
        System.out.println("Cuesta: ");
        precio = scan.nextInt();
        System.out.println("Pagas: ");
        pagar = scan.nextInt();
        Cambio cambio = new Cambio();
        cambio.mostrarCambio(precio, pagar);
    }

}
