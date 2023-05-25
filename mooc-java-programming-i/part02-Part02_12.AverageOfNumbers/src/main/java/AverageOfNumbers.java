
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int numbers = 0;
        int number;
        do {
            System.out.println("Give a number: ");
            number = scanner.nextInt();
            if(number!=0){
                numbers++;
                average += number;
            }
            
        }while(number!=0);
        System.out.println("Average of the numbers: " + average/numbers);
        
    }
}
