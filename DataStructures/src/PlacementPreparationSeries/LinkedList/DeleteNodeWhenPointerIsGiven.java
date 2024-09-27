package PlacementPreparationSeries.LinkedList;

public class DeleteNodeWhenPointerIsGiven {

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
        NodeList head = new NodeList(2);
        head.next = new NodeList(4);
        head.next.next = new NodeList(6);
        head.next.next.next = new NodeList(7);
        head.next.next.next.next = new NodeList(8);
        head.next.next.next.next.next = new NodeList(9);
        return head;
    }

    private void printList(NodeList head) {
        if (head == null) {
            System.out.println("The Linked List is empty");
        }
        while (head != null) {
            System.out.print("--->" + head.val);
            head = head.next;
        }
        System.out.println();
    }

    private NodeList deleteNodeFromListUtil(NodeList head, NodeList pointer) {
        if (head == null || pointer == null) {
            System.out.println("Operation can't be performed");
            return head;
        }
        if (pointer.next == null) {
            System.out.println("You can't delete last node in singly linked list");
            return head;
        }
        pointer.val = pointer.next.val;
        pointer.next = pointer.next.next;
        return head;
    }

    public static void main(String[] args) {
        DeleteNodeWhenPointerIsGiven deleteNodeWhenPointerIsGiven = new DeleteNodeWhenPointerIsGiven();
        NodeList head = deleteNodeWhenPointerIsGiven.createDummyLinkedList();
        deleteNodeWhenPointerIsGiven.printList(head);

        /** When Pointer given to a particular node*/
        System.out.println("When Pointer given to a particular node");
        NodeList pointer = head.next.next.next;
        head = deleteNodeWhenPointerIsGiven.deleteNodeFromListUtil(head, pointer);
        deleteNodeWhenPointerIsGiven.printList(head);

        /** When Pointer given to a last node*/
        System.out.println("When Pointer given to a last node");
        pointer = head.next.next.next.next;
        head = deleteNodeWhenPointerIsGiven.deleteNodeFromListUtil(head, pointer);
        deleteNodeWhenPointerIsGiven.printList(head);
    }
}
