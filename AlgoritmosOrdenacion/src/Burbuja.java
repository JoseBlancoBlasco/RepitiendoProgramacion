import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vector = new int[8];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("numero: ");
            vector[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(vector));        
        bubbleSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    
    static void bubbleSort (int v[]){
        int temp;
        int i,j;
        int N = v.length;
        for (i = 0; i < N; i++) {
            for (j = N-1; j > i; j--) {
                if (v[j]<v[j-1]) {
                    temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                }
            }
        }
    }

}
