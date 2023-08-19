package DataStructure;

import java.util.LinkedList;

public class LinkedListDS {

    public static void main(String[] args) {
        /*
         * In simple terms, a linked list is a linear data structure that consists of a
         * sequence of elements, where each element points to the next one, forming a
         * chain. It's like a chain of connected nodes, where each node holds data and a
         * reference to the next node in the chain.
         */

        LinkedList<String> linkedList = new LinkedList<String>(); // Create a new linked list of strings

        linkedList.offer("A"); // Add "A" to the end of the linked list
        linkedList.offer("B"); // Add "B" to the end of the linked list
        linkedList.offer("D"); // Add "D" to the end of the linked list
        linkedList.offer("E"); // Add "E" to the end of the linked list
        linkedList.add(2, "C"); // Insert "C" at index 2 in the linked list, shifting other elements

        System.out.println("Peek Head: " + linkedList.peekFirst()); // Print the first element ("A")
        System.out.println("Peek Tail: " + linkedList.peekLast()); // Print the last element ("E")

        linkedList.addFirst("First"); // Add "First" to the beginning of the linked list
        linkedList.addFirst("Last"); // Add "Last" to the beginning of the linked list

        System.out.println(linkedList); // Print the contents of the linked list

    }
}