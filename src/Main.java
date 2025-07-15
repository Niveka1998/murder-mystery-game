import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Suspect> suspects;
    private static List<Item> items;
    private static List<Location> locations;
    private static Notebook notebook;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        suspects= DataLoader.loadSuspects();
        items= DataLoader.loadItems();
        locations= DataLoader.loadLocations();
        notebook= new Notebook();

        System.out.println("What is your name, detective? ");
        String name= input.nextLine();
        System.out.println("Welcome, Detective "+name+" A murder has occurred!");
        System.out.println("Type 'help' for commands.");

        while (true){
            System.out.println("\n>");
            String input1= input.nextLine();
            String[] parts= CommandParser.parse(input1);

            switch (parts[0]){
                case "help":
                    showHelp();
                    break;
                case "ask":
                    askSuspect(parts.length> 1 ? parts[1]: "");
                    break;
                case "search":
                    searchLocation(parts.length>1 ?parts[1]: "");
                    break;
                case "note":
                    notebook.addNote(parts.length>1 ? parts[1]: "Empty");
                    break;
                case "notes":
                    notebook.viewNotes();
                    break;
                case "accuse":
                    //makeAccusation(input);
                    break;
                case "exit":
                    System.out.println("Game exited.");
                    break;
                default:
                    System.out.println("Unknown command.");

            }
        }
    }

    static void showHelp(){
        System.out.println("""
                Commands:
                        - ask [name]          : Ask suspect for their alibi
                        - search [location]   : Search a location for items
                        - note [text]         : Write a note
                        - notes               : View your notes
                        - accuse              : Make your final accusation
                        - exit                : Quit the game
                """);
    }

    static void askSuspect(String name){
        for(Suspect s: suspects){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println(s.getName()+": \""+s.getAlibi()+"\"");
                return;
            }
        }
        System.out.println("No suspect by that name");
    }

    static void searchLocation(String locationName){
        for(Location loc: locations){
            if(loc.getName().equalsIgnoreCase(locationName)){
                System.out.println("Searching"+loc.getName()+"...");
                for(Item item: items){
                    System.out.println("- Found: "+item.getDescription());
                }
                return;
            }
        }
        System.out.println("Location not found.");
    }
}