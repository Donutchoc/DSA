import java.util.LinkedList; // Import LinkedList
import java.util.Queue;      // Import Queue interface

public class StackUsingQueueEnqueueFriendly {

    // Primary queue
    Queue<Integer> q1 = new LinkedList<>();

    // Secondary queue
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation (Enqueue Friendly)
    // Time Complexity: O(1)
    void push(int x) {
        // Simply add element to q1
        q1.add(x);
    }

    // Pop operation
    // Time Complexity: O(n)
    int pop() {

        // Check if stack is empty
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Move elements until only one is left in q1
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Remove last inserted element (LIFO)
        int poppedElement = q1.remove();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    public static void main(String[] args) {
        StackUsingQueueEnqueueFriendly s = new StackUsingQueueEnqueueFriendly();

        s.push(1);
        s.push(2);
        s.push(3);

        // Pop prints 3 (LIFO behavior)
        System.out.println(s.pop());
    }
}
