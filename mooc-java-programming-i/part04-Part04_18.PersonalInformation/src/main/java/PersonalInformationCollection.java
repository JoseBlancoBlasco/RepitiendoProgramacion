
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name, empty will end: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the surname of the person " + name + ": ");
            String surname = scanner.nextLine();
            
            System.out.print("Enter the id of the person " + name + ": ");
            String id = scanner.nextLine();

            // We add a new person to the list.
            // The person's name and age were decided by the user
            infoCollection.add(new PersonalInformation(name, surname, id));
        }

// We'll print the number of the inputted persons, and the persons themselves
        System.out.println();
        System.out.println("Total number of persons: " + infoCollection.size());
        System.out.println("Persons: ");

        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
