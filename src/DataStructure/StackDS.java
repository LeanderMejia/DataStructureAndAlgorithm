package DataStructure;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) throws Exception {
        /*
         * A stack, in simple terms, is a data structure that works like a stack of
         * books. You can add book to the top and remove them from the top.
         * Similarly, in a stack data structure, you can add elements (push) to the top
         * and remove elements (pop) from the top. It follows the Last-In-First-Out
         * (LIFO) principle, where the last element added is the first one to be
         * removed.
         */

        // Creating a stack to store strings
        Stack<String> stack = new Stack<String>();

        // Pushing items onto the stack
        stack.push("Don Quixote");
        stack.push("Lord of the Rings");
        stack.push("Harry Potter and the Sorcerer's Stone");
        stack.push("Pinocchio");

        // Printing the top item of the stack (without removing it)
        System.out.println(stack.peek()); // Output: Pinocchio

        // Searching for an item in the stack and returning its position (count starts
        // at 1)
        System.out.println(stack.search("Lord of the Rings")); // Output: 3 (count start at 1)

        // Removing the top item from the stack and storing it in a variable
        String removeItem = stack.pop(); // "Pinocchio" is removed and assigned to removeItem

        // Printing the removed item and the updated stack
        System.out.println("Pop Item is " + removeItem); // Output: Pop Item is Pinocchio
        System.out.println(stack); // Output: [Don Quixote, Lord of the Rings, Harry Potter and the Sorcerer's Stone]
    }
}
