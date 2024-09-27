package PlacementPreparationSeries.LinkedList;

public class ReverseLinkedList {

    private class Node {

        int data;
        Node next;

        Node() {
        }

        Node(int val) {
            this.data = val;
        }

        Node(int val, Node pointer) {
            this.data = val;
            this.next = pointer;
        }
    }

    private Node createDummyLinkedList() {
        Node temp = new Node(1);
        temp.next = new Node(2);
        temp.next.next = new Node(3);
        temp.next.next.next = new Node(4);
        Node head = new Node();
        head.next = temp;
        return head;
    }

    private Node reverseList(Node head) {
        System.out.println("After reversing the linked list");
        Node first = null, second = null, third = null;
        first = head.next;
        while (first != null) {
            second = first;
            first = first.next;
            second.next = third;
            third = second;
        }
        head.next = second;
        return head;
    }

    private void printList(Node head) {
        System.out.println("The LinkedList elements are: ");
        while (head != null) {
            System.out.print("-->" + head.data);
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node head = reverseLinkedList.createDummyLinkedList();
        reverseLinkedList.printList(head.next);
        head = reverseLinkedList.reverseList(head);
        reverseLinkedList.printList(head.next);
    }
}
