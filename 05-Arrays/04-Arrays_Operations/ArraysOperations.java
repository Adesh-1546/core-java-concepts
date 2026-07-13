package Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        //  Find largest element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest: " + max);

        // Reverse array
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Sum of elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
