package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {
    /*
     * An adjacency list is a way to represent connections or relationships between
     * different elements (usually nodes or vertices) in a graph. It's like a list
     * where each element has its own list of neighbors, showing which other
     * elements it is connected to.
     */

    int numVertices;
    List<List<Integer>> adjacencyList;

    public AdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        // Initialize adjacencyList with empty linked lists for each vertex
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    // Add an edge between source and destination vertices
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    // Check if there's an edge between source and destination vertices
    public boolean checkEdge(int source, int destination) {
        return adjacencyList.get(source).contains(destination);
    }

    // Print the adjacency list
    public void printList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Integer neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(5);

        graph.addEdge(4, 1); // Add edges between vertices
        graph.addEdge(2, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 2);
        graph.addEdge(0, 1);
        
        System.out.println("Adjacency List");
        graph.printList();
        System.out.println(graph.checkEdge(1, 4));
    }
}
