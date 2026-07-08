package List;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // Creating a Stack (extends Vector)
        Stack<Integer> stack = new Stack<>();

        // ---------------- PUSH (ADD ELEMENTS) ----------------
        stack.push(10);   // pushed first
        stack.push(20);
        stack.push(30);   // pushed last (top element)

        System.out.println("Stack after push: " + stack);

        // ---------------- PEEK ----------------
        // View top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // ---------------- POP ----------------
        // Removes and returns top element
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);

        System.out.println("Stack after pop: " + stack);

        // ---------------- SEARCH ----------------
        // Returns position from top (1-based index)
        System.out.println("Position of 10: " + stack.search(10));

        // ---------------- CHECK EMPTY ----------------
        System.out.println("Is stack empty? " + stack.isEmpty());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating stack:");
        for (int num : stack) {
            System.out.println(num);
        }

        // ---------------- CLEAR STACK ----------------
        stack.clear();
        System.out.println("After clearing stack: " + stack);
    }
}
