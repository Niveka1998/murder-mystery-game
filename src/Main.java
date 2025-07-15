import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Suspect> suspects;
    private static List<Item> items;
    private static List<Location> locations;
    private static Notebook notebook;
    static int turns = 10;

    static void useTurn() {
        turns--;
        System.out.println("🕐 Turns remaining: " + turns);
        if (turns <= 0) {
            System.out.println("⏳ Time’s up, Detective! The killer got away...");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        suspects = DataLoader.loadSuspects();
        items = DataLoader.loadItems();
        locations = DataLoader.loadLocations();
        notebook = new Notebook();

        System.out.print("What is your name, detective? ");
        String name = input.nextLine();

        System.out.println("\nWelcome, Detective " + name + ".");
        System.out.println("A murder has occurred in the mansion.");
        System.out.println("You have a list of 15 suspects and 15 rooms.");
        System.out.println("Your mission: Interrogate suspects, search locations, and solve the case.");
        System.out.println("You have 10 turns. Use them wisely.");
        System.out.println("Type 'help' at any time for available commands.\n");

        while (true) {
            System.out.print("\n> ");
            String input1 = input.nextLine().trim();
            String[] parts = CommandParser.parse(input1);

            switch (parts[0].toLowerCase()) {
                case "help":
                    showHelp();
                    break;

                case "ask":
                    askSuspect(parts.length > 1 ? parts[1] : "");
                    useTurn();
                    break;

                case "search":
                    searchLocation(parts.length > 1 ? input1.substring(7).trim() : "");
                    useTurn();
                    break;

                case "note":
                    notebook.addNote(parts.length > 1 ? input1.substring(5).trim() : "Empty");
                    useTurn();
                    break;

                case "notes":
                    notebook.viewNotes();
                    break;

                case "suspects":
                    showSuspects();
                    break;

                case "locations":
                    showLocations();
                    break;

                case "accuse":
                    makeAccusation(input);
                    break;

                case "exit":
                    System.out.println("Game exited.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unknown command. Type 'help' for options.");
            }
        }
    }

    static void showSuspects() {
        System.out.println("\nSuspects:");
        for (Suspect s : suspects) {
            System.out.println("- " + s.getName());
        }
    }

    static void showLocations() {
        System.out.println("\nLocations:");
        for (Location loc : locations) {
            System.out.println("- " + loc.getName());
        }
    }

    static void showHelp() {
        System.out.println("""
                Commands:
                  - ask [name]          : Ask suspect for their alibi
                  - search [location]   : Search a location for items
                  - note [text]         : Write a note
                  - notes               : View your notes
                  - suspects            : List all suspects
                  - locations           : List all locations
                  - accuse              : Make your final accusation
                  - exit                : Quit the game
                """);
    }

    static void askSuspect(String name) {
        for (Suspect s : suspects) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s.getName() + ": \"" + s.getAlibi() + "\"");
                return;
            }
        }
        System.out.println("No suspect by that name.");
    }

    static void searchLocation(String locationName) {
        boolean found = false;
        for (Location loc : locations) {
            if (loc.getName().equalsIgnoreCase(locationName)) {
                System.out.println("🔍 Searching " + loc.getName() + "...");
                for (Item item : items) {
                    if (item.getLocation().equalsIgnoreCase(locationName)) {
                        System.out.println("- Found: " + item.getDescription());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Nothing suspicious found here.");
                }
                return;
            }
        }
        System.out.println("Location not found.");
    }

    static void makeAccusation(Scanner sc) {
        System.out.print("Who do you accuse? ");
        String name = sc.nextLine().trim();
        for (Suspect s : suspects) {
            if (s.getName().equalsIgnoreCase(name)) {
                if (s.isGuilty()) {
                    System.out.println("🎉 You solved it! The weapon was " + s.getWeapon() + ".");
                } else {
                    System.out.println("❌ Wrong! The killer walks free!!!");
                }
                System.exit(0);
            }
        }
        System.out.println("That person doesn't exist.");
    }
}
