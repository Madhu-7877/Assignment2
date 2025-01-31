package practice;

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack with a given size
    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates empty stack
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop operation: Removes and returns the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Return an invalid value to indicate error
        }
        return stack[top--];
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1;
        }
        return stack[top];
    }

    // IsEmpty operation: Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Test cases
        stack.push(10);
        stack.push(20);

        System.out.println("Top element (peek): " + stack.peek()); // Output: 20
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek()); // Output: 10

        stack.pop();
        stack.pop();
        stack.pop(); // Should display "Stack Underflow"

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}


//Summary of Time Complexity
//Push: O(1)
//Pop: O(1)
//Peek: O(1)
//IsEmpty: O(1)
