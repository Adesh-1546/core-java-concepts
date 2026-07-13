package Arrays;

public class OneDArrayExample {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};

        //  Traversal using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //  Traversal using for-each loop
        System.out.println("Using for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
