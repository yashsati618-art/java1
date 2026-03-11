public class BannerAppUC6 {

    public static void main(String[] args) {
        // UC6: Building the banner by calling static helper methods
        String[] line1 = getLetterO();
        String[] line2 = getLetterO();
        String[] line3 = getLetterP();
        String[] line4 = getLetterS();

        // Combine them into a final display (For this UC, we will print them sequentially)
        printCharacter(line1);
        printCharacter(line2);
        printCharacter(line3);
        printCharacter(line4);
    }

    // Helper Method for Letter O
    public static String[] getLetterO() {
        return new String[]{
            " ***** ",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    // Helper Method for Letter P
    public static String[] getLetterP() {
        return new String[]{
            "****** ",
            "* *",
            "* *",
            "****** ",
            "* ",
            "* ",
            "* "
        };
    }

    // Helper Method for Letter S
    public static String[] getLetterS() {
        return new String[]{
            " ***** ",
            "* ",
            "* ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    // Helper Method to Print any 7-line character array
    public static void printCharacter(String[] character) {
        for (String line : character) {
            System.out.println(line);
        }
        System.out.println(); // Space between letters
    }
}