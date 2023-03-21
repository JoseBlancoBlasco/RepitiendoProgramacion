package Ej1;

public class Ejercicio1 {

    public static void main(String[] args) {
        ClaseX obC1 = new ClaseX(5);
        ClaseX obC2 = new ClaseX(7);
        
        obC1.printX();
        obC1.incrementarContador();
        ClaseX.incrementarContador();
        obC1.printContador();
        obC2.printContador();
        obC2.printX();
        obC1.incrementarContador();
        obC1.printX();
        obC1.printContador();
        obC2.printContador();
        obC1.setX(14);
        obC1.printX();

    }
    

}
