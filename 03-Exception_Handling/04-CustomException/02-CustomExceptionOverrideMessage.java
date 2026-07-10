package ExceptionHandling;

// Custom Exception Class
class InvalidAmountException extends Exception {

    @Override
    public String getMessage() {
        return "Amount must be greater than zero";
    }
}

public class CustomExceptionOverrideMessage {

    public static void validateAmount(int amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException();
        } else {
            System.out.println("Valid amount");
        }
    }

    public static void main(String[] args) {

        try {
            validateAmount(-10);
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
