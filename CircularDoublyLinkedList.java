// Circular Doubly Linked List implementation
public class CircularDoublyLinkedList {

    // Node class represents one element in the list
    class Node {
        int data;      // Value stored in the node
        Node next;     // Reference to next node
        Node prev;     // Reference to previous node

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    Node head = null; // Points to first node
    Node tail = null; // Points to last node

    // Insert a node at the end of the list
    public void insert(int data) {

        Node newNode = new Node(data); // Create new node

        // If list is empty
        if (head == null) {
            head = tail = newNode;       // Both head and tail point to new node
            head.next = head;            // Circular connection
            head.prev = head;
        } else {
            newNode.prev = tail;         // New node's previous points to tail
            newNode.next = head;         // New node's next points to head
            tail.next = newNode;         // Tail's next points to new node
            head.prev = newNode;         // Head's previous points to new node
            tail = newNode;              // Update tail
        }
    }

    // Display elements in forward direction
    public void displayForward() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head); // Stop when we reach head again
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();
    }
}
