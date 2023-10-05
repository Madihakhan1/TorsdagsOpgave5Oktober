import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


    //2.c
    private final ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        File file = new File("/Users/madihakhan/IdeaProjects/Task2/src/coffees.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String result = scan.nextLine();
                coffeeMenu.add(result);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void printMenu() {
        for (String menu : coffeeMenu) {
            System.out.println(menu);
        }
    }
}
