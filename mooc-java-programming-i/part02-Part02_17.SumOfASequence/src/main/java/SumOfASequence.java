
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int number = scanner.nextInt();
        int suma=0;
        for (int i = number; i >0; i--) {
            suma+=i;            
        }
        System.out.println("The sum is " + suma);
    }
}
