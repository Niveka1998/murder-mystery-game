public class CommandParser {
    public static String[] parse(String input){
        return input.trim().toLowerCase().split("\\s+",2);
    }
}
