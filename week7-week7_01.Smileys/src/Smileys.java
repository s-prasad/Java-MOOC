public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys (String characterString) {
        String smileyline = "";
        String midString = ":) " + characterString;
        boolean isOdd = checkIfOdd (characterString);

        if (isOdd) {
            midString += "  :)";
        } else {
            midString += " :)";
        }

        for (int i=0; i<midString.length()/2; i++) {
            smileyline += ":)";
        }

        System.out.println(smileyline);
        System.out.println(midString);
        System.out.println(smileyline);

    }

    public static boolean checkIfOdd (String stringToCheck) {
        return (stringToCheck.length() % 2 != 0);
    }
}
