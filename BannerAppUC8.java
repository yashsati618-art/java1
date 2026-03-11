import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {
    // Centralized storage for patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize the Map with character patterns
        patternMap.put('O', new String[]{" ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "});
        patternMap.put('P', new String[]{"****** ", "* *", "* *", "****** ", "* ", "* ", "* "});
        patternMap.put('S', new String[]{" ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "});
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        // We need 7 rows for the banner
        for (int i = 0; i < 7; i++) {
            StringBuilder row = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(c));
                if (pattern != null) {
                    row.append(pattern[i]).append("  "); // Add space between letters
                }
            }
            System.out.println(row.toString());
        }
    }
}