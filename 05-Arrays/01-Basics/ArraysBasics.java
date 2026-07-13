package Arrays;

// Basics of Arrays in Java
public class ArraysBasics {

    public static void main(String[] args) {

        // 🔹 1. Declaration
        int[] arr1;

        // 🔹 2. Static Initialization (values given directly)
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println("Static Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // 🔹 3. Dynamic Initialization (size given, values assigned later)
        int[] arr3 = new int[5];

        arr3[0] = 100;
        arr3[1] = 200;
        arr3[2] = 300;
        arr3[3] = 400;
        arr3[4] = 500;

        System.out.println("Dynamic Array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        // 🔹 4. Default Values
        int[] arr4 = new int[3];
        System.out.println("Default values:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " "); // 0 0 0
        }
    }
}
