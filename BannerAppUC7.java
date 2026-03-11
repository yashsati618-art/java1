public class BannerAppUC7 {

    // UC7: Static Inner Class for Encapsulation
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Encapsulating data into Objects
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            " ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "****** ", "* *", "* *", "****** ", "* ", "* ", "* "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "
        });

        CharacterPattern[] oopsBanner = { charO, charO, charP, charS };

        for (CharacterPattern cp : oopsBanner) {
            for (String line : cp.getPattern()) {
                System.out.println(line);
            }
            System.out.println(); 
        }
    }
}