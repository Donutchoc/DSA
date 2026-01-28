// Binary Search Tree implementation
public class BinarySearchTree {

    // Node class represents each tree node
    class Node {
        int data;      // Value stored in node
        Node left;     // Left child
        Node right;    // Right child

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root; // Root of the BST

    // Insert a value into BST
    Node insert(Node root, int data) {

        // If tree is empty, create new node
        if (root == null) {
            return new Node(data);
        }

        // If data is smaller, insert into left subtree
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        // If data is greater, insert into right subtree
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root; // Return unchanged root
    }

    // Inorder traversal (Left → Root → Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);          // Visit left subtree
            System.out.print(root.data + " ");
            inorder(root.right);         // Visit right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);

        // Display inorder traversal
        System.out.print("Inorder Traversal: ");
        bst.inorder(bst.root);
    }
}