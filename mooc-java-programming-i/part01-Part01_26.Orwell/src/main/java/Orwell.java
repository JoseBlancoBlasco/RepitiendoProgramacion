
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first speed:");
        int number = Integer.valueOf(scan.nextLine());
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
