
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<ArchiveItem> listOfItems = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            ArchiveItem item = new ArchiveItem(identifier, name);
            
            if (!listOfItems.contains(item)) {
                listOfItems.add(item);
            }
        }
        
        for (ArchiveItem item : listOfItems) {
            System.out.println(item);
        }



    }
}
