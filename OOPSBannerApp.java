public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Streamlined Array Initialization using String.join()
        String[] banner = {
            String.join(" ", "  OOO  ", "  OOO  ", " PPPP  ", "  SSS  "),
            String.join(" ", " O   O ", " O   O ", " P   P ", " S     "),
            String.join(" ", " O   O ", " O   O ", " PPPP  ", "  SSS  "),
            String.join(" ", " O   O ", " O   O ", " P     ", "     S "),
            String.join(" ", "  OOO  ", "  OOO  ", " P     ", "  SSS  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}