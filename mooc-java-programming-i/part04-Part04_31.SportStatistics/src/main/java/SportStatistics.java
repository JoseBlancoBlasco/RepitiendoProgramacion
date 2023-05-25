import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int numberOfGames = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String foreignTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int foreignPoints = Integer.valueOf(parts[3]);

                if (teamName.equals(homeTeam)) {
                    if (homePoints > foreignPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                    numberOfGames++;
                } else if (teamName.equals(foreignTeam)) {
                    if (foreignPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                    numberOfGames++;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        

    }

}

