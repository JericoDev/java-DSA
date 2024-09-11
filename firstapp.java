class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkedList {
    Node head;

    // Add a new node to the front of the list
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // Link new node to the current head
        head = newNode;       // Make new node the new head
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(30);
        list.add(20);
        list.add(10);
        list.display();
    }
}
