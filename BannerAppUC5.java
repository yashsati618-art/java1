public class BannerAppUC5 {
    public static void main(String[] args) {
        // UC5: Array Literal Initialization with String.join()
        // This combines declaration and values in one step
        String[] banner = {
            String.join("", "********", "  ", "********"),
            String.join("", "** ", "  ", "** "),
            String.join("", "** ", "  ", "** "),
            String.join("", "********", "  ", "********"),
            String.join("", "** ", "  ", "** "),
            String.join("", "** ", "  ", "** "),
            String.join("", "********", "  ", "********")
        };

        // Enhanced for-loop (for-each) to print the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}