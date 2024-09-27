package PlacementPreparationSeries.LinkedList;

import org.w3c.dom.Node;

public class MergeSortedListVersion2 {

    /**
     * Recursive way to sort both list into one resultant list
     * In place method
     * Time Complexity - O(m+n)
     * Space Complexity - O(1)
     */

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

    private NodeList createFirstLinkedList() {
        NodeList head = new NodeList(2);
        head.next = new NodeList(4);
        head.next.next = new NodeList(6);
        head.next.next.next = new NodeList(7);
        head.next.next.next.next = new NodeList(8);
        return head;
    }

    private NodeList createSecondLinkedList() {
        NodeList head = new NodeList(1);
        head.next = new NodeList(3);
        head.next.next = new NodeList(5);
        head.next.next.next = new NodeList(9);
        return head;
    }

    private void printList(NodeList node) {
        System.out.println();
        if (node == null) {
            System.out.println("The LinkedList is Empty");
            return;
        }
        System.out.println("The element present in the LinkedList are: ");
        while (node != null) {
            System.out.print("--->" + node.val);
            node = node.next;
        }
        System.out.println();
    }

    private NodeList mergeTwoSortedLists(NodeList first, NodeList second) {
        if (first == null && second == null) {
            return null;
        }
        if (first == null) return second;
        if (second == null) return first;
        NodeList result = null;
        if (first.val <= second.val) {
            first.next = mergeTwoSortedLists(first.next, second);
            result = first;
        } else {
            second.next = mergeTwoSortedLists(first, second.next);
            result = second;
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println("--------------Test case for unequal LinkedList lengths--------------");
        MergeSortedListVersion2 mergeSortedListVersion2 = new MergeSortedListVersion2();
        NodeList first = mergeSortedListVersion2.createFirstLinkedList();
        mergeSortedListVersion2.printList(first);
        NodeList second = mergeSortedListVersion2.createSecondLinkedList();
        mergeSortedListVersion2.printList(second);
        NodeList head = null;
        head = mergeSortedListVersion2.mergeTwoSortedLists(first, second);
        mergeSortedListVersion2.printList(head);

        System.out.println("--------------Test case for empty linkedlist--------------");
        mergeSortedListVersion2.printList(null);
        mergeSortedListVersion2.printList(null);
        head = mergeSortedListVersion2.mergeTwoSortedLists(null, null);
        mergeSortedListVersion2.printList(head);
    }
}
