package Ejercicios;

public class Prog_Ev02_Ej10 {

    public static void main(String[] args) {

    }

    public static int[] fusionar(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k] = a[i];
                i++;
            } else {
                resultado[k] = b[j];
                j++;
            }
            k++;
        }
        // Copiar los elementos restantes de a
        while (i < a.length) {
            resultado[k] = a[i];
            i++;
            k++;
        }
        // Copiar los elementos restantes de b
        while (j < b.length) {
            resultado[k] = b[j];
            j++;
            k++;
        }
        return resultado;
    }

}
