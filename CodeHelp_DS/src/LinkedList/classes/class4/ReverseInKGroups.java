package LinkedList.classes.class4;

public class ReverseInKGroups {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        Node result = reverseKNodes(head,2);
        printList(result);

    }

    private static int findLength(Node head){
        if (head == null) return 0;
        int len = 0;
        Node itr = head;
        while (itr != null){
            len++;
            itr = itr.next;
        }
        return len;
    }

    private static Node reverseKNodes(Node head, int k){
        if (head == null || head.next == null){
            return head;
        }

        int length = findLength(head);
        if (length < k){
            return head;
        }
        int pos = 0;
        Node prev = null, cur = head;
        while (pos < k){
            Node forward = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forward;
            pos++;
        }

        if(cur != null) {
            Node recursionHead = reverseKNodes(cur, k);
            head.next = recursionHead;
        }

        return prev;

    }

    private static void printList(Node head){
        if (head == null) return;
        Node itr = head;
        while (itr != null){
            System.out.print(itr.data);
            System.out.print("->");
            itr = itr.next;
        }
        System.out.println("NULL");
    }
}
