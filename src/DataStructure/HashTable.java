package DataStructure;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        /*
         * A HashTable is a data structure that stores key-value pairs, allowing you to
         * quickly retrieve values based on their associated keys. It works like a
         * dictionary where you can look up a word (key) to find its meaning (value)
         * without having to search through the entire dictionary. HashTables use a hash
         * function to map keys to indices, which helps in efficient retrieval and
         * storage of data.
         */

        // Create a HashMap with an initial capacity of 10
        HashMap<Integer, String> table = new HashMap<>(10);

        // Insert key-value pairs into the HashMap
        table.put(321, "Luffy");
        table.put(213, "Zoro");
        table.put(12, "Nami");
        table.put(65, "Sanji");
        table.put(21, "Usopp");

        // Iterate through the keys in the HashMap
        for (Integer key : table.keySet()) {
            // Calculate the hash code of the key and use modulo to get the index
            int index = key.hashCode() % 10;
            // Print the index, key, and corresponding value
            System.out.println(index + "\t" + key + "\t" + table.get(key));
        }
    }
}
