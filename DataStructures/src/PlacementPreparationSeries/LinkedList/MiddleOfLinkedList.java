package PlacementPreparationSeries.LinkedList;

public class MiddleOfLinkedList {

    private class NodeList {
        int val;
        NodeList next;

        NodeList() {
        }

        NodeList(int value) {
            this.val = value;
            this.next = null;
        }

        NodeList(int value, NodeList pointer) {
            this.val = value;
            this.next = pointer;
        }
    }

    private NodeList createDummyLinkedList() {
        NodeList head = new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);
        return head;
    }

    private void printList(NodeList head) {
        if (head == null) return;
        System.out.println("The LinkedList elements are: ");
        while (head != null) {
            System.out.print("-->" + head.val);
            head = head.next;
        }
        System.out.println("");
    }

    private NodeList testEvenLengthCase() {
        NodeList head = new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);
        head.next.next.next.next.next = new NodeList(6);
        return head;
    }

    private NodeList testNullCase() {
        NodeList head = null;
        return head;
    }

    private NodeList findMiddleOfList(NodeList head) {
        if (head == null) return head;
        NodeList slow = head, fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        NodeList head = null, middle = null;
        head = middleOfLinkedList.createDummyLinkedList();
        middleOfLinkedList.printList(head);
        middle = middleOfLinkedList.findMiddleOfList(head);
        System.out.println("The middle node of linked list: " + middle.val);

        System.out.println();
        System.out.println("-------Even Length Test Case----------");
        head = middleOfLinkedList.testEvenLengthCase();
        middleOfLinkedList.printList(head);
        middle = middleOfLinkedList.findMiddleOfList(head);
        System.out.println("The middle node of linked list: " + middle.val);

        System.out.println();
        System.out.println("--------Null Test Case------------");
        head = middleOfLinkedList.testNullCase();
        middleOfLinkedList.printList(head);
        middle = middleOfLinkedList.findMiddleOfList(head);
        System.out.println("The middle node of linked list: " + middle);
    }
}

