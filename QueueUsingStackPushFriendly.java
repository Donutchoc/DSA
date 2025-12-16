import java.util.Stack; // Import Stack class

public class QueueUsingStackPushFriendly {

    // Stack s1 is used for enqueue operations
    Stack<Integer> s1 = new Stack<>();

    // Stack s2 is used temporarily during dequeue
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation (Push Friendly)
    // Time Complexity: O(1)
    void enqueue(int x) {
        // Simply push the element into stack s1
        s1.push(x);
    }

    // Dequeue operation
    // Time Complexity: O(n)
    int dequeue() {

        // Check if queue is empty
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Move all elements from s1 to s2
        // This reverses the order of elements
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Remove the top element from s2 (front of queue)
        int removedElement = s2.pop();

        // Move remaining elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        // Return the dequeued element
        return removedElement;
    }

    public static void main(String[] args) {
        QueueUsingStackPushFriendly q = new QueueUsingStackPushFriendly();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // Dequeue prints 10 (FIFO behavior)
        System.out.println(q.dequeue());
    }
}
