public class Change {

    char from;
    char to;

    public Change (char fromCharacter, char toCharacter) {
        this.from = fromCharacter;
        this.to = toCharacter;
    }

    public String change (String characterString) {
        String newString = characterString;
        return newString.replace(from, to);
    }

}
