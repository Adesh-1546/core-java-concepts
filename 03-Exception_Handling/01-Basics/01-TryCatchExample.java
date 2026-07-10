package ExceptionHandling;

public class TryCatchExample {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            // Code that may cause exception
            int result = 10 / 0;   // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling exception
            System.out.println("Exception caught: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
