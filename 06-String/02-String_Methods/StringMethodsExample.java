package Strings;

public class StringMethodsExample {

    public static void main(String[] args) {

        String str = "  Java Programming  ";

        // length()
        System.out.println("Length: " + str.length());

        // trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // toUpperCase() / toLowerCase()
        System.out.println("Upper: " + trimmed.toUpperCase());
        System.out.println("Lower: " + trimmed.toLowerCase());

        // charAt()
        System.out.println("Char at index 2: " + trimmed.charAt(2));

        // substring()
        System.out.println("Substring (0-4): " + trimmed.substring(0, 4));

        // contains()
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // equals()
        System.out.println("Equals 'Java Programming': " +
                trimmed.equals("Java Programming"));
    }
}
