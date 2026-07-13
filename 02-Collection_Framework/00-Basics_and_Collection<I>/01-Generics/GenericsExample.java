package CollectionsBasics;

import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {

        // Without Generics (old way)
        ArrayList list = new ArrayList();
        list.add("Adesh");
        list.add(100); // allowed (not safe)

        // With Generics (type-safe)
        ArrayList<String> names = new ArrayList<>();
        names.add("Adesh");
        // names.add(100); // compile-time error

        for (String name : names) {
            System.out.println(name);
        }
    }
}
