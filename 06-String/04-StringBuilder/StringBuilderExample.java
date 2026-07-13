package Strings;

public class StringBuilderExample {

    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, "Core ");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(0, 4, "Advanced");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(0, 8);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());
    }
}
