package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        System.out.println("Program started");

        // Try-with-resources automatically closes resources
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}
