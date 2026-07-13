package CollectionsBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {

        // Create List
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);

        System.out.println("Original List: " + list);

        // 1. sort()
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 2. reverse()
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 3. shuffle()
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // 4. max() and min()
        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Minimum: " + Collections.min(list));

        // 5. frequency()
        int freq = Collections.frequency(list, 10);
        System.out.println("Frequency of 10: " + freq);

        // 6. binarySearch() (IMPORTANT: list must be sorted)
        Collections.sort(list);
        int index = Collections.binarySearch(list, 20);
        System.out.println("Index of 20: " + index);
    }
}
