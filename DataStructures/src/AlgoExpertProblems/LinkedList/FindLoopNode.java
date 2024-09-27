package AlgoExpertProblems.LinkedList;

import PlacementPreparationSeries.LinkedList.FindIntersectionPointInLinkedList;

public class FindLoopNode {

    private LinkedList findLoop(LinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedList slow = head, fast = head;
        do {
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (fast.next != null)
                fast = fast.next;
        } while (fast != slow && fast.next!= null);

        if (fast.next == null){
            return fast.next;
        }
        LinkedList newSlow = head;
        while (newSlow != slow) {
            newSlow = newSlow.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        FindLoopNode findLoopNode = new FindLoopNode();
        LinkedList head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(3);
        head.next.next.next.next = new LinkedList(4);
        head.next.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next.next = new LinkedList(8);
        head.next.next.next.next.next.next.next.next.next = new LinkedList(9);
//        head.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next;

        LinkedList root = findLoopNode.findLoop(head);
        while (root != null) {
            System.out.print("-->");
            System.out.print(root.value);
            root = root.next;
        }
    }
}
