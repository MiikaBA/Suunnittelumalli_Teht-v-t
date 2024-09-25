package Main;

import java.util.Scanner;
import States.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        while (!(character.getState() instanceof MasterState)) {
            character.showStatus();
            System.out.println("Choose an action: (train, meditate, fight)");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                default:
                    System.out.println("Invalid action. Try again.");
            }

            // Check if character health drops below 0
            if (character.getHealth() <= 0) {
                System.out.println(character.getName() + " has died.");
                break;
            }
        }

        if (character.getState() instanceof MasterState) {
            System.out.println(character.getName() + " has become a Master. The game is over.");
        }

        scanner.close();
    }
}

