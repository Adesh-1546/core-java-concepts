package ExceptionHandling;

public class PropagationExample {

    // Method 3 → where exception occurs
    public static void method3() {
        System.out.println("Inside method3");

        int result = 10 / 0; // ArithmeticException

        System.out.println("This line will not execute");
    }

    // Method 2 → does NOT handle exception
    public static void method2() {
        System.out.println("Inside method2");
        method3(); // exception propagates here
    }

    // Method 1 → does NOT handle exception
    public static void method1() {
        System.out.println("Inside method1");
        method2(); // exception propagates here
    }

    public static void main(String[] args) {

        try {
            method1(); // exception reaches here
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("Program continues...");
    }
}
