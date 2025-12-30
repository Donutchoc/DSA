// ArrayCircularQueue.java
// Implements a circular queue using an array

public class ArrayCircularQueue {
    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    // Inserts an element into the circular queue
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    // Removes element from the queue
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front];
        if (front == rear) {
            front = rear = -1; // queue becomes empty
        } else {
            front = (front + 1) % size;
        }
        return data;
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue()); // removes 1
    }
}
