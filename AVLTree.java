// AVL Tree implementation
public class AVLTree {

    // Node class
    class Node {
        int key;       // Value stored
        int height;    // Height of node
        Node left;     // Left child
        Node right;    // Right child

        Node(int key) {
            this.key = key;
            height = 1; // New node height is 1
        }
    }

    Node root;

    // Get height of a node
    int height(Node n) {
        return (n == null) ? 0 : n.height;
    }

    // Get balance factor of node
    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    // Right rotation
    Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }

    // Left rotation
    Node leftRotate(Node x) {

        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }

    // Insert a node into AVL tree
    Node insert(Node node, int key) {

        // Perform normal BST insertion
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // Duplicate keys not allowed

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // Return balanced node
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 50);

        System.out.print("Inorder Traversal of AVL Tree: ");
        tree.inorder(tree.root);
    }
}