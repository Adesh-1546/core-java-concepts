package ExceptionHandling;

public class ThrowExample {

    public static void validateAge(int age) {

        if (age < 18) {
            // Manually throwing exception
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(16); // invalid age
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
