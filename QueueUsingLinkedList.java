package practice;

public class QueueUsingLinkedList {
    
    // Node class representing each element in the queue
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear; // Front and rear pointers

    // Constructor to initialize an empty queue
    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    // Method to add an element to the rear of the queue (Enqueue)
    public void enqueue(int value) {
        Node newNode = new Node(value);
        
        if (rear == null) { // If queue is empty, both front and rear point to new node
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued: " + value);
    }

    // Method to remove an element from the front of the queue (Dequeue)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        int removedValue = front.data;
        front = front.next;

        if (front == null) { // If queue becomes empty, reset rear to null
            rear = null;
        }

        System.out.println("Dequeued: " + removedValue);
        return removedValue;
    }

    // Method to get the front element without removing it
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to display the elements of the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the queue operations
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
    

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        queue.dequeue();
        
        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.display();

      
    }
}

// Time :  O(1)
// Space : 0(n)
