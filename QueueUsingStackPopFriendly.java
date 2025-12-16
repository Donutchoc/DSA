import java.util.Stack; // Import Stack class

public class QueueUsingStackPopFriendly {

    // Stack s1 always keeps the front element on top
    Stack<Integer> s1 = new Stack<>();

    // Stack s2 is used temporarily during enqueue
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    // Time Complexity: O(n)
    void enqueue(int x) {

        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into empty s1
        s1.push(x);

        // Move all elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue operation (Pop Friendly)
    // Time Complexity: O(1)
    int dequeue() {

        // Check if queue is empty
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Pop top element which is the front of queue
        return s1.pop();
    }

    public static void main(String[] args) {
        QueueUsingStackPopFriendly q = new QueueUsingStackPopFriendly();

        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);

        // Dequeue prints 5
        System.out.println(q.dequeue());
    }
}
