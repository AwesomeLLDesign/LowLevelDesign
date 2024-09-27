package LinkedList.classes.class3;

public class ReverseLLRecursion {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode curr = head;
        ListNode prev = null;
        head = reverseLL(curr,prev);
        printLL(head);
    }

    private static ListNode reverseLL(ListNode curr, ListNode prev){
        if (curr == null){
            return prev;
        }

        ListNode forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;
        return reverseLL(curr,prev);
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
