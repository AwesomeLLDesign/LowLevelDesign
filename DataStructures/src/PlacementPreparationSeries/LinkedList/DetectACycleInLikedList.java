package PlacementPreparationSeries.LinkedList;

public class DetectACycleInLikedList {

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

    private NodeList cyclicLinkedList() {
        NodeList head = new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);
        head.next.next.next.next.next = head.next.next;
        return head;
    }

    private boolean detectCycle(NodeList head) {
        if (head == null) {
            System.out.println("The LinkedList is empty");
            return false;
        }
        boolean check = false;
        NodeList slow = head, fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (fast == slow) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        DetectACycleInLikedList detectACycleInLikedList = new DetectACycleInLikedList();
        NodeList head = detectACycleInLikedList.cyclicLinkedList();
        boolean check = detectACycleInLikedList.detectCycle(head);
        System.out.println("Statement - Linked List having cycle: " + check);
    }
}
