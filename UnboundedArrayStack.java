public class UnboundedArrayStack {

    // Array to store stack elements
    private int[] stack;

    // Index of the top element
    private int top;

    // Current capacity of the stack
    private int capacity;

    // Constructor initializes stack with small capacity
    public UnboundedArrayStack() {
        capacity = 2;               // Initial capacity
        stack = new int[capacity];  // Create array
        top = -1;                   // Stack is empty
    }

    // Push operation with dynamic expansion
    public void push(int x) {

        // If stack is full, double its capacity
        if (top == capacity - 1) {
            resize(capacity * 2);
        }

        // Insert element and move top pointer
        stack[++top] = x;
    }

    // Pop operation with dynamic shrinking
    public int pop() {

        // Check for stack underflow
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Remove and return top element
        int removedValue = stack[top--];

        // If stack is quarter full, reduce its size by half
        if (top > 0 && top == capacity / 4) {
            resize(capacity / 2);
        }

        return removedValue;
    }

    // Resize the stack array
    private void resize(int newCapacity) {

        // Create new array with new capacity
        int[] newStack = new int[newCapacity];

        // Copy old elements to new array
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        // Assign new array to stack
        stack = newStack;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        UnboundedArrayStack s = new UnboundedArrayStack();

        s.push(10);
        s.push(20);
        s.push(30); // Triggers expansion

        s.pop();
        s.pop();    // May trigger shrinking
    }
}
