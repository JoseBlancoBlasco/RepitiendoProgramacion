import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            listOfBooks.add(new Book(title, pages, publicationYear));
        }
        
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {
            for (Book book : listOfBooks) {
                System.out.println(book.getTitle() + ", " 
                        + book.getPages() + " pages, " + book.getYear());
            }
        } else if (answer.equals("name")) {
            for (Book book : listOfBooks) {
                System.out.println(book.getTitle());
            }
        }
 
    }
}
