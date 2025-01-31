package practice;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 public class LinkedList {
    Node head; // Head of the list

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node with a given value
    public void delete(int data) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        // If the node was found, remove it
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display the elements of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Insert elements
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        // Display list
        list.display(); // Output: 1 2 3

        // Delete an element
        list.delete(2);

        // Display list after deletion
        list.display(); // Output: 1 3
    }
}

//Time complexity : o(1)

//space complexity: O(1); 
