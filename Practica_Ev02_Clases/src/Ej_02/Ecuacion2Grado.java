package Ej_02;

public class Ecuacion2Grado {

    private double a;
    private double b;
    private double c;

    public Ecuacion2Grado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean discriminante() {
        if ((b * b) - (4 * a * c) > 0) {
            System.out.println("El determinante es positivo, hay 2 soluciones reales.");
            return true;
        } else if ((b * b) - (4 * a * c) == 0) {
            System.out.println("El determinante es cero, hay dos soluciones reales iguales.");
            return true;
        } else {
            System.out.println("El determinante es negativo, hay 2 soluciones complejas.");
            return false;
        }
    }

    double solucion1() {
        double x;
        x = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return x;
    }
    
    double solucion2() {
        double x;
        x = (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return x;
    }
    
    void mostrar(){
        System.out.println(a+"xº+"+b+"x+"+c+"=0");
    }
}
