package AlgoExpertProblems.LinkedList;

class Node {

    int value;
    Node prev = null;
    Node next = null;

    Node(int data) {
        this.value = data;
    }
}

public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public void setHead(Node node) {
        // Write your code here.
    }

    public void setTail(Node node) {
        // Write your code here.
    }

    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAfter(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
        // Write your code here.
    }

    public void removeNodesWithValue(int value) {
        // Write your code here.
    }

    public void remove(Node node) {
        // Write your code here.
    }

    public boolean containsNodeWithValue(int value) {
        // Write your code here.
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;


    }
}
