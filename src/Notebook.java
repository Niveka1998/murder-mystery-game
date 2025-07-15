import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<String> notes= new ArrayList<>();

    public void addNote(String note){
        notes.add(note);
        System.out.println("Note Added!");
    }
    public void viewNotes(){
        System.out.println("\n === NOTES ===");
        for(String note: notes){
            System.out.println("- "+note);
        }
    }
}
