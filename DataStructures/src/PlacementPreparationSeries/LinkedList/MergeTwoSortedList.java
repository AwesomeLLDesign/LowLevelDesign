package PlacementPreparationSeries.LinkedList;

public class MergeTwoSortedList {

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

    private void printList(NodeList head) {
        if (head == null) {
            System.out.println("The LinkedList is empty");
            System.out.println();
            return;
        }
        System.out.println("The LinkedList elements are: ");
        while (head != null) {
            System.out.print("-->" + head.val);
            head = head.next;
        }
        System.out.println();
    }

    private NodeList createNewNode(int val) {
        NodeList newDummyNode = new NodeList(val);
        return newDummyNode;
    }

    private NodeList mergeSortedLists(NodeList first, NodeList second) {
        if (first == null && second == null) return null;
        NodeList merged = new NodeList();
        NodeList result = null;
        int count = 0;
        while (first != null || second != null) {
            if (first == null) {
                merged.next = second;
                if (result == null)
                    result = merged.next;
                break;

            } else if (second == null) {
                merged.next = first;
                if (result == null)
                    result = merged.next;
                break;
            } else if (first.val <= second.val) {
                merged.next = createNewNode(first.val);
                count++;
                if (count == 1) {
                    result = merged.next;
                }
                first = first.next;
                merged = merged.next;
            } else {
                merged.next = createNewNode(second.val);
                count++;
                if (count == 1) {
                    result = merged.next;
                }
                second = second.next;
                merged = merged.next;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println("-------- When one list size is greater than another list{test case 1} -------");
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        NodeList firstList = mergeTwoSortedList.createFirstLinkedList();
        NodeList secondList = mergeTwoSortedList.createSecondLinkedList();
        mergeTwoSortedList.printList(firstList);
        mergeTwoSortedList.printList(secondList);
        NodeList result = mergeTwoSortedList.mergeSortedLists(firstList, secondList);
        mergeTwoSortedList.printList(result);

        System.out.println();
        System.out.println("-------- When one list is empty{test case 2} -------");
        mergeTwoSortedList.printList(firstList);
        mergeTwoSortedList.printList(null);
        result = mergeTwoSortedList.mergeSortedLists(firstList, null);
        mergeTwoSortedList.printList(result);

        System.out.println();
        System.out.println("-------- When both lists are empty{test case 3} -------");
        mergeTwoSortedList.printList(null);
        mergeTwoSortedList.printList(null);
        result = mergeTwoSortedList.mergeSortedLists(null, null);
        mergeTwoSortedList.printList(result);
    }
}