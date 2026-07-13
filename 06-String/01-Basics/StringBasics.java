package Strings;

public class StringBasics {

    public static void main(String[] args) {

        // 1. String creation

        // Using string literal (stored in String Pool)
        String s1 = "Java";

        // Using new keyword (stored in Heap)
        String s2 = new String("Java");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Immutability

        String str = "Hello";
        str.concat(" World"); // does not change original string
        System.out.println("After concat (no change): " + str);

        // To modify, assign back
        str = str.concat(" World");
        System.out.println("After concat (reassigned): " + str);

        // 3. String Pool concept

        String a = "Test";
        String b = "Test";

        System.out.println("a == b: " + (a == b)); // true (same reference from pool)

        String c = new String("Test");
        System.out.println("a == c: " + (a == c)); // false (different objects)
    }
}
