// FIFO Queue implementation using Linked List
public class LinkedListFIFOQueue {

    // Node class
    class Node {
        int data;    // Queue element
        Node next;   // Pointer to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null; // Points to front element
    Node rear = null;  // Points to rear element

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {      // Queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode; // Link new node at end
            rear = newNode;      // Update rear
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data; // Store front value
        front = front.next;     // Move front forward

        if (front == null) rear = null; // Queue became empty

        return value;
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue q = new LinkedListFIFOQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued: " + q.dequeue());
    }
}
