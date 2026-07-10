package ExceptionHandling;

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        System.out.println("Unchecked Exception Example");

        // No compile-time error, but runtime exception
        int result = 10 / 0; // ArithmeticException

        System.out.println("Result: " + result);
    }
}
