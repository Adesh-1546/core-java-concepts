package ExceptionHandling;

public class FinallyBlockExample {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int result = 10 / 0; // Exception occurs
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        } 
        finally {
            // This block always executes
            System.out.println("Finally block executed (cleanup code)");
        }

        System.out.println("Program ends...");
    }
}
