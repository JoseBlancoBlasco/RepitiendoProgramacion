package Ej_06;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void desplazaX(double dx) {
        x += dx;
    }

    void desplazaY(double dy) {
        y += dy;
    }

    void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distanciaEuclidea(Punto otro) {
        //Hipotenusa resultante entre los dos puntos
        double ac = Math.abs(otro.y - y);
        double cb = Math.abs(otro.x - x);

        return Math.hypot(ac, cb);

    }

    public String mostrar() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

}
