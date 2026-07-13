package Strings;

public class StringComparison {

    public static void main(String[] args) {

        // Case 1: String literals (SCP)
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2));         // true
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true

        // Case 2: Using new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s3 == s4: " + (s3 == s4));         // false
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true

        // Case 3: Literal vs new
        String s5 = "Java";
        String s6 = new String("Java");

        System.out.println("s5 == s6: " + (s5 == s6));         // false
        System.out.println("s5.equals(s6): " + s5.equals(s6)); // true

        // Case 4: Using intern()
        String s7 = s6.intern();

        System.out.println("s5 == s7: " + (s5 == s7)); // true

        // Case 5: Case-sensitive comparison
        String s8 = "java";

        System.out.println("s1.equals(s8): " + s1.equals(s8));             // false
        System.out.println("s1.equalsIgnoreCase(s8): " + s1.equalsIgnoreCase(s8)); // true
    }
}
