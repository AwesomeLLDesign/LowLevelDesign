package PlacementPreparationSeries.LinkedList;

public class FindIntersectionPointInLinkedList {

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

    private NodeList[] yShapedLinkedList() {

        NodeList[] arr = new NodeList[2];
        NodeList first = new NodeList(2);
        first.next = new NodeList(7);
        first.next.next = new NodeList(4);
        first.next.next.next = new NodeList(6);
        first.next.next.next.next = new NodeList(5);

        NodeList second = new NodeList(1);
        second.next = new NodeList(3);
        second.next.next = first.next.next.next;

        arr[0] = first;
        arr[1] = second;

        return arr;
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

    private int findLengthOfLinkedList(NodeList head) {
        if (head == null) {
            System.out.println("The List is an empty list");
            return 0;
        }
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private NodeList findingIntersectionPoint(int firstLength, int secondLength, NodeList first, NodeList second) {
        int diff = 0;
        NodeList list1 = null;
        NodeList list2 = null;
        if (firstLength >= secondLength) {
            list1 = first;
            list2 = second;
        } else {
            list1 = second;
            list2 = first;
        }
        diff = Math.abs(firstLength - secondLength);

        if (diff != 0) {
            while (diff != 0) {
                list1 = list1.next;
                --diff;
            }
        }
        while (list1 != null) {
            if (list1 == list2) {
                break;
            }
            list1 = list1.next;
            list2 = list2.next;
        }


        return list1;
    }

    public static void main(String[] args) {
        FindIntersectionPointInLinkedList findIntersectionPointInLinkedList = new FindIntersectionPointInLinkedList();
        NodeList[] pointers = findIntersectionPointInLinkedList.yShapedLinkedList();
        System.out.println("Traversing of the first linked list");
        findIntersectionPointInLinkedList.printList(pointers[0]);
        System.out.println("Traversing of the second linked list");
        findIntersectionPointInLinkedList.printList(pointers[1]);

        int firstLength = findIntersectionPointInLinkedList.findLengthOfLinkedList(pointers[0]);
        System.out.println("Length of the first linked list: " + firstLength);
        int secondLength = findIntersectionPointInLinkedList.findLengthOfLinkedList(pointers[1]);
        System.out.println("Length of the second linked list: " + secondLength);

        if (Math.abs(firstLength - secondLength) == 0)
            return;

        System.out.println("Finding the intersection point of the Linked List");
        NodeList result = findIntersectionPointInLinkedList.findingIntersectionPoint(firstLength, secondLength, pointers[0], pointers[1]);
        System.out.println("The intersection point of the Linked List:" + result.val);
    }
}
