package Ejercicios.BuclesFor;

public class Ej3_28 {

    public static void main(String[] args) {

        int x = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += x;
            x += 2; //Voy contando de 2 en 2
            System.out.println(x);
        }
        System.out.println("La suma de los primeros 10 numeros pares es: " + sum);
    }

}
