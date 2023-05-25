
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number, suma = 0, cont = 0, even = 0, odd = 0;

        System.out.println("Give numbers:");
        do {
            number = scanner.nextInt();
            if (number != -1) {
                suma += number;
                cont++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
        } while (number != -1);
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + suma);
        System.out.println("Numbers: " + cont);
        System.out.println("Average: " + (double) suma / cont);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
