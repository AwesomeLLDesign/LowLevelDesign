package LinkedList.classes.class3;

public class MiddleOfLL {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        head = findMiddle(head);
        System.out.println(head.data);
        //printLL(head);
    }

    private static ListNode findMiddle(ListNode head){
        if(head == null){
            return head;
        }
        ListNode fast = head, slow = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null && fast.next!= null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
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
