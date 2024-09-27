package PlacementPreparationSeries.LinkedList;

public class RemoveNthNodeFromBackOfLinkedList {

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

    private NodeList removeNodeFromLast(NodeList head, int num) {
        if (head == null) {
            System.out.println("An empty Linked List provided as an input");
            return head;
        }
        NodeList last = head, curr = head.next, prev = head;
        while (last != null && num != 0) {
            last = last.next;
            num--;
        }
        if (num > 0) {
            System.out.println("Operation Not Allowed, Number greater than LinkedList Length");
            return null;
        } else {
            while (last != null)
            {
                last = last.next;
                curr = curr.next;
                prev = prev.next;
            }
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String args[]) {
        RemoveNthNodeFromBackOfLinkedList removeNthNodeFromBackOfLinkedList = new RemoveNthNodeFromBackOfLinkedList();
        NodeList head = removeNthNodeFromBackOfLinkedList.createDummyLinkedList();
        removeNthNodeFromBackOfLinkedList.printList(head);
        NodeList newHead = removeNthNodeFromBackOfLinkedList.removeNodeFromLast(head, 3);
        removeNthNodeFromBackOfLinkedList.printList(newHead);

    }
}
