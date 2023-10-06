import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


    //2.c
    private final ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        // Opret en filreference til stien til din kaffemenu-fil
        File file = new File("/Users/madihakhan/IdeaProjects/Task2/src/coffees.txt");

        try {
            // Opret en scanner til at læse filen
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                // Læs næste linje fra filen
                String result = scan.nextLine();

                // Tilføj den læste linje til coffeeMenu (antages at coffeeMenu er en liste)
                coffeeMenu.add(result);
            }
        } catch (Exception e) {
            // Hvis der opstår en fejl, fanger vi den her, men det er vigtigt at behandle fejlen (f.eks. ved at udskrive den)
            e.getMessage();
        }
    }


    public void printMenu() {
        for (String menu : coffeeMenu) {
            System.out.println(menu);
        }
    }
}
