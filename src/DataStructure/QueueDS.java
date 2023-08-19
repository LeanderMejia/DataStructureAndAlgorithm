package DataStructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) {
        /*
         * A queue is like a line of people waiting for something. It follows the
         * "first-in, first-out" (FIFO) principle, which means the person who enters the
         * line first is the one who gets served first. In programming, a queue is a
         * data structure that holds elements in the order they were added, and the
         * element at the front of the queue is the next one to be processed.
         */

        Queue<String> queue = new LinkedList<String>();

        // Adding elements to the queue
        queue.offer("John");
        queue.offer("Mike");
        queue.offer("Roger");
        queue.offer("Pia");

        // Print the first item in the queue (without removing it)
        System.out.println(queue.peek()); // Output: "John"

        // Remove the first item from the queue
        queue.poll();

        // Print the current state of the queue
        System.out.println(queue); // Output: [Mike, Roger, Pia]


        /*
         * A PriorityQueue is a data structure that stores elements and allows you to
         * retrieve them in a specific order. Unlike a regular queue where elements are
         * retrieved in the order they are added, a PriorityQueue retrieves elements
         * based on their priority. Elements with higher priority are retrieved before
         * those with lower priority.
         */

        Queue<Double> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.offer(2.50);
        priorityQueue.offer(1.75);
        priorityQueue.offer(1.0);
        priorityQueue.offer(1.25);

        // Process and print elements from the queue until it's empty
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
