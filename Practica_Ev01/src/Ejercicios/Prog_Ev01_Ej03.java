/*  Autor: Jose M. Blanco
    Descripcion: Inicializacion de tipos de variables
    e impresion de las mismas con secuencias de escape.
 */
package Ejercicios;

public class Prog_Ev01_Ej03 {

    public static void main(String[] args) {
        boolean casado = true;
        int maximo = 999999;
        byte diaSemana = 1;
        short diaAnual = 300;
        long miliSeg = 1298332800000L;
        double totalFactura = 10350.678;
        long poblacion = 6775235741L;
        char sexo = 'M';

        System.out.println("El valor de la variable casado es " + casado);
        System.out.println("\tEl valor de la variable maximo es " + maximo);
        System.out.println("\tEl valor de la variable diasem es " + diaSemana);
        System.out.println("\tEl valor de la variable diaAnual es " + diaAnual);
        System.out.println("\tEl valor de la variable miliSeg es " + miliSeg);
        System.out.println("\tEl valor de la variable totalFactura es " + totalFactura);
        System.out.println("\tEl valor de la variable poblacion es " + poblacion);
        System.out.println("\tEl valor de la variable sexo es " + sexo);

        System.out.println("**************************************************");

        System.out.print("\nEl valor de la variable casado es " + casado);
        System.out.print("\n\tEl valor de la variable maximo es " + maximo);
        System.out.print("\n\tEl valor de la variable diasem es " + diaSemana);
        System.out.print("\n\tEl valor de la variable diaAnual es " + diaAnual);
        System.out.print("\n\tEl valor de la variable miliSeg es " + miliSeg);
        System.out.print("\n\tEl valor de la variable totalFactura es " + totalFactura);
        System.out.print("\n\tEl valor de la variable poblacion es " + poblacion);
        System.out.print("\n\tEl valor de la variable sexo es " + sexo);

    }

}
