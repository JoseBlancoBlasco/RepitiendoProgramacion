package Ej1;

class ClaseX {

    private static int contador = 0;
    private int x;

    public ClaseX(int i) {
        x = i;
    }

    public static void incrementarContador() {
        contador++;
    }

    public void printX() {
        System.out.println("Valor de x : " + x);
    }

    public static void printContador() {
        System.out.println("Valor del contador: " + contador);
    }

    public void setX(int i) {
        x = i;
    }
}
