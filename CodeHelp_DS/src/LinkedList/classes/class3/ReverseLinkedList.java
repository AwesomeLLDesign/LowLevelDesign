package LinkedList.classes.class3;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head = reverseLL(head);
        printLL(head);
    }

    private static ListNode reverseLL(ListNode head){

        ListNode forward = head;
        ListNode current = null, previous = null;

        while(forward!=null){
            current = forward;
            forward = current.next;
            current.next = previous;
            previous = current;
        }
        return current;
    }

    private static void printLL(ListNode head){
        ListNode itr = head;
        while (itr!=null){
            System.out.print(itr.data);
            System.out.print("->");
            itr = itr.next;
        }
        System.out.print("NULL");
    }
}
