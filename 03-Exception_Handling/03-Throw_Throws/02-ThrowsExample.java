package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Declaring exception using throws
    public static void readFile() throws IOException {

        FileReader file = new FileReader("test.txt");
        System.out.println("File opened successfully");

        file.close();
    }

    public static void main(String[] args) {

        try {
            readFile(); // method call
        } catch (IOException e) {
            System.out.println("Exception handled in main method");
        }

        System.out.println("Program continues...");
    }
}
