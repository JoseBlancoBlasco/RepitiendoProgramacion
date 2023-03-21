package Ej_02;

public class Ej02 {

    public static void main(String[] args) {
        Ecuacion2Grado ecu = new Ecuacion2Grado(6,43,3);
        ecu.discriminante();
        ecu.mostrar();
        System.out.println("La primera solucion es: x = " + ecu.solucion1());
        System.out.println("La segunda solucion es: x = " + ecu.solucion2());
    }

}
