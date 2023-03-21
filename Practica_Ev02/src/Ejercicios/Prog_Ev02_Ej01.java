package Ejercicios;

public class Prog_Ev02_Ej01 {

    public static void main(String[] args) {

    }

    int[] buscarTodos(int t[], int clave) {
        // Contar el número de veces que aparece la clave en la tabla
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                count++;
            }
        }

        // Crear una tabla para almacenar los índices
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }
}
