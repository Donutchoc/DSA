// StackQueue.java
// This class implements a dequeue-friendly stack using two stacks

import java.util.Stack;

public class StackQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation - adds element to the queue
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue operation - removes element from front of queue
    public int dequeue() {
        if (s2.isEmpty()) {
            // Move elements from s1 to s2 to reverse order
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // removes 10
    }
}
