package ExceptionHandling;

// Custom Exception Class
class InvalidAgeException extends Exception {

    // Constructor using super()
    public InvalidAgeException(String message) {
        super(message); // pass message to Exception class
    }
}

public class CustomExceptionUsingSuper {

    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
