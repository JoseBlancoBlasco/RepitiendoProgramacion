
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int numbers = 0;
        int number;
        int pos = 0;
        do {
            System.out.println("Give a number: ");
            number = scanner.nextInt();
            if (number > 0) {
                numbers++;
                average += number;
                pos++;
            }

        } while (number != 0);
        if (pos <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + average / numbers);
        }
    }
}
