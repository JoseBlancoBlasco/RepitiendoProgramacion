
import java.util.Arrays;
import java.util.Scanner;

public class Insercion {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vector = new int[8];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("numero: ");
            vector[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(vector));        
        insertionSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    
    static void insertionSort(int v[]){
        int temp;
        int i,j;
        int N=v.length;
        for (i = 1; i < N; i++) {
            temp=v[i];
            for (j = i; (j>0)&&(temp<v[j-1]); j--) {
                v[j]=v[j-1];
            }
            v[j]=temp;
        }
    }
}
