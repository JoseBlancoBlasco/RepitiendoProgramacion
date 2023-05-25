
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            System.out.println("");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.equals("")) {
                    break;
                }
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age != 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}

//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class RecordsFromAFile {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name of the file:");
//        String fileName = scanner.nextLine();
//        try (Scanner input = new Scanner(Paths.get(fileName))) {
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                if (line.equals("")) {
//                    break;
//                }
//                String[] parts = line.split(",");
//                String name = parts[0];
//                int age = Integer.valueOf(parts[1]);
//                if (age != 1) {
//                    System.out.println(name + ", age: " + age + " years");
//                } else {
//                    System.out.println(name + ", age: " + age + " year");
//
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//}

