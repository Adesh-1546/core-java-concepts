package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        System.out.println("Checked Exception Example");

        try {
            // FileReader may throw FileNotFoundException (checked exception)
            FileReader file = new FileReader("test.txt");

            System.out.println("File opened successfully");

            file.close(); // may throw IOException

        } catch (IOException e) {
            System.out.println("Exception caught: File not found or cannot be opened");
        }

        System.out.println("Program continues...");
    }
}
