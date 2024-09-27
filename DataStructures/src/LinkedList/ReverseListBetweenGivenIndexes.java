package LinkedList;

public class ReverseListBetweenGivenIndexes {

    public static void main(String... args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        int m = 2, n = 4;
        reverseList(head,m,n);
    }

    public static ListNode reverseList(ListNode head, int m, int n){
        return null;
    }
}
