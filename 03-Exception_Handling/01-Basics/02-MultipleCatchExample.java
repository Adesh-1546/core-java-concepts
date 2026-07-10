package ExceptionHandling;

public class MultipleCatchExample {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int[] arr = new int[5];

            // Uncomment one at a time to test different exceptions

            // int result = 10 / 0;          // ArithmeticException
            // System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // NullPointerException

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } 
        catch (NullPointerException e) {
            System.out.println("Null value encountered");
        }

        System.out.println("Program continues...");
    }
}
