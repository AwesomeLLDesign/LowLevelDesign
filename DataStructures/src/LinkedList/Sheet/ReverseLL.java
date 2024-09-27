package LinkedList.Sheet;

class ListNode{

    int data;
    ListNode next;

    public ListNode(int key){
        this.data = key;
        this.next = null;
    }

}


public class ReverseLL {
    public static void main(String... args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        printLL(reverse(head));
    }

    public static ListNode reverse(ListNode head) {
        ListNode first = head, second = null, third = null;
        while (first != null) {
            second = first;
            first = first.next;
            second.next = third;
            third = second;
        }
        head = second;
        return head;
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
}
