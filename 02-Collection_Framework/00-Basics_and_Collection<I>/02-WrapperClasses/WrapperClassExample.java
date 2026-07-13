package CollectionsBasics;

import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) {

        // Primitive type
        int a = 10;

        // Wrapper class (boxing)
        Integer obj = Integer.valueOf(a);

        // Auto-boxing
        Integer b = 20;

        // Unboxing
        int c = b;

        // Collections only support objects
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println(list);
    }
}
