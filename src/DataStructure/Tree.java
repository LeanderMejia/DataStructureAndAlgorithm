package DataStructure;

public class Tree {
    /*
     * A tree is a hierarchical structure composed of nodes, where each node has a
     * value and can have zero or more child nodes. The topmost node in a tree is
     * called the root, and nodes that have no children are called leaves. Nodes in
     * a tree are connected by edges, and each node can have a parent node except
     * for the root.
     */

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Method to insert a value into the tree
    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new Node(value); // Insert the value as the left child
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new Node(value); // Insert the value as the right child
            }
        }
    }

    // Method to perform an inorder traversal of the tree
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    // Method to perform a preorder traversal of the tree
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Method to perform a postorder traversal of the tree
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
        tree.insert(root, 7);

        System.out.println("Inorder Traversal");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.println("Preorder Traversal");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.println("Postorder Traversal");
        tree.postOrderTraversal(root);
    }
}
