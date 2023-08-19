package DataStructure;
public class Recursion {
    /*
     * Recursion is a programming concept where a function calls itself to solve a
     * problem by breaking it down into smaller instances of the same problem. It's
     * like solving a puzzle by solving smaller puzzles of the same type.
     */

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    private static int factorial(int num) {
        if (num < 1) return 1; // Base case: If num is 0 or negative, return 1 (factorial of 0 is 1)
        return num * (factorial(num - 1)); // Recursive case: Multiply num with factorial of (num - 1)
    }
}
