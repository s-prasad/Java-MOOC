import java.util.ArrayList;

public class Changer {

    ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        String newString = characterString;
        for (Change change:changes) {
            newString = change.change(newString);
        }

        return newString;
    }

}
