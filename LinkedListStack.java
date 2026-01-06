// Stack implementation using Linked List
public class LinkedListStack {

    // Node class
    class Node {
        int data;       // Stack element
        Node next;      // Pointer to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null; // Points to top of stack

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data); // Create new node
        newNode.next = top;            // New node points to current top
        top = newNode;                 // Update top
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int poppedValue = top.data;  // Store top value
        top = top.next;              // Move top down
        return poppedValue;
    }

    // Display stack elements
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.display();
        System.out.println("Popped: " + s.pop());
    }
}
