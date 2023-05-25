
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            System.out.println("");
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        int count = 0;
        for (String item : list) {
            if (Integer.valueOf(item) >= lowerBound && 
                    Integer.valueOf(item) <= upperBound) {
               count++;
            } 
        }
        System.out.println("Numbers: " + count);



    }

}
