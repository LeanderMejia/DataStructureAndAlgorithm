package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix {
    /*
     * An Adjacency Matrix is a way to represent connections or relationships
     * between vertices (points or nodes) in a graph. It uses a 2D array where rows
     * and columns represent vertices, and the values in the array indicate whether
     * there's an edge between the corresponding vertices. A value of 1 typically
     * indicates an edge, and a value of 0 indicates no edge.
     */

    int numVertices; // Number of vertices in the graph
    int[][] adjacencyMatrix; // 2D array to store the adjacency matrix
    boolean[] visited;

    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices]; // Create the adjacency matrix
        this.visited = new boolean[numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1; // Mark an edge between source and destination
    }

    public boolean checkEdge(int source, int destination) {
        if (adjacencyMatrix[source][destination] == 1) {
            return true; // Check if there's an edge between source and destination
        } else {
            return false;
        }
    }

    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " "); // Print the adjacency matrix
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5); // Create a graph with 5 vertices

        graph.addEdge(4, 1); // Add edges between vertices
        graph.addEdge(2, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 2);
        graph.addEdge(0, 1);

        System.out.println("Adjacency Matrix");
        graph.printMatrix(); // Print the adjacency matrix
        System.out.println(graph.checkEdge(0, 1)); // Check if there's an edge between 0 and 1
    }
}
