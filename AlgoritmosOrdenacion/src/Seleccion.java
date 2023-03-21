
import java.util.Arrays;
import java.util.Scanner;


public class Seleccion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vector = new int[8];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("numero: ");
            vector[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(vector));        
        selectionSort(vector);
        System.out.println(Arrays.toString(vector));
    }

    static void selectionSort(int vector[]) {
        int temp;
        int pos_min;
        int i;
        int j;
        int N = vector.length;
        for (i = 0; i < N - 1; i++) {
            //Menor elemento del vector vector[i.. N-1]
            pos_min = i;
            for (j = i + 1; j < N; j++) {
                if (vector[j] < vector[pos_min]) {
                    pos_min = j;
                }
                //Coloca el minimo en vector[i]
                temp = vector[i];
                vector[i] = vector[pos_min];
                vector[pos_min] = temp;
            }
        }
    }
}
