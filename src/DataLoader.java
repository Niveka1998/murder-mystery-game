import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Suspect> loadSuspects(){
        List<Suspect> suspects = new ArrayList<>();
        suspects.add(new Suspect("Chamo", "I was at the bar with friends.", false, "Wrench"));
        suspects.add(new Suspect("Thilini", "I was reading alone in the library.", true, "Knife"));
        suspects.add(new Suspect("Chrish", "I was fixing my car in the garage.", false, "Hammer"));
        suspects.add(new Suspect("Seda", "I was on a call with my sister all night.", false, "Poison"));
        suspects.add(new Suspect("Thisa", "I was jogging around the block.", false, "Rope"));
        suspects.add(new Suspect("Manuji", "I was asleep. No one can confirm it though.", true, "Scissors"));
        suspects.add(new Suspect("Hangum", "I was cleaning the basement. Alone.", false, "Crowbar"));
        suspects.add(new Suspect("Savindi", "I was baking cookies in the kitchen.", false, "Frying Pan"));
        suspects.add(new Suspect("Nadil", "I was playing video games online.", false, "Baseball Bat"));
        suspects.add(new Suspect("Eva", "I was out buying groceries.", false, "Candle Holder"));
        suspects.add(new Suspect("Kingsley", "I was walking the dog near the lake.", false, "Glass Shard"));
        suspects.add(new Suspect("Edvard", "I was painting in the attic.", false, "Wire"));
        suspects.add(new Suspect("Loarry", "I was locked in my room studying.", true, "Pistol"));
        suspects.add(new Suspect("Perera", "I was helping mom in the garden.", false, "Garden Shears"));
        suspects.add(new Suspect("Silva", "I was practicing piano all evening.", false, "Trophy"));

        return suspects;
    }

    public static List<Item> loadItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Torn Fabric", "A piece of red fabric caught on the doorknob.", false, "Dining Room"));
        items.add(new Item("Empty Pill Bottle", "Label scratched off. Found near the victim's bed.", false, "Bedroom"));
        items.add(new Item("Leather Glove", "Only one glove found in the hallway.", false, "Hallway"));
        items.add(new Item("Cigarette Butt", "Freshly used, lipstick on the filter.", false, "Front Porch"));
        items.add(new Item("Footprint Cast", "A muddy boot print outside the window.", false, "Backyard"));
        items.add(new Item("Old Movie Ticket", "From a film that ended hours before the murder.", true, "Study"));
        items.add(new Item("Pet Collar", "Belongs to the neighbor's dog. Irrelevant?", true, "Garden"));
        items.add(new Item("Smashed Phone", "Completely destroyed. Might be staged.", false, "Workshop"));
        items.add(new Item("Handwritten Note", "Says 'Meet me at midnight'. No signature.", false, "Study"));
        items.add(new Item("Wine Glass", "Lipstick mark doesn't match victim’s.", true, "Kitchen"));


        return items;
    }

    public static List<Location> loadLocations(){
        List<Location> locations= new ArrayList<>();
        locations.add(new Location("Basement", "Damp and filled with old furniture."));
        locations.add(new Location("Attic", "Dusty boxes and cobwebs everywhere."));
        locations.add(new Location("Bedroom", "Blanket twisted. Alarm clock smashed."));
        locations.add(new Location("Guest Room", "Pillow has blood stains. Sheets crumpled."));
        locations.add(new Location("Bathroom", "Mirror cracked. Water still running."));
        locations.add(new Location("Dining Room", "Table half set, wine bottle spilled."));
        locations.add(new Location("Study", "Desk drawers open. One file missing."));
        locations.add(new Location("Backyard", "Fresh footprints near the garden."));
        locations.add(new Location("Greenhouse", "Plants knocked over. Broken pot near door."));
        locations.add(new Location("Poolside", "Wet footprints lead nowhere."));
        locations.add(new Location("Laundry Room", "Dryer still running. Strange smell inside."));
        locations.add(new Location("Pantry", "Canned food untouched. Knife missing from rack."));
        locations.add(new Location("Front Porch", "Newspaper from yesterday. Mud tracked in."));
        locations.add(new Location("Hallway", "One wall painting is slightly tilted."));
        locations.add(new Location("Workshop", "Tools scattered. Blood on vice grip."));
        locations.add(new Location("Kitchen", "The stove is warm. A knife is missing from the rack."));

        return locations;
    }
}
