package LinkedList.classes.class4;

public class RemoveDuplicatesInSortedLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(4);
        printList(removeDuplicates(head));
        printList(removeDuplicates(null));
    }

    private static Node removeDuplicates(Node head){
        if(head == null) return head;

        Node curr = head, forward = head.next;
        while (forward != null){
            if (forward.data == curr.data) forward = forward.next;
            else {
                curr.next = forward;
                curr = forward;
                forward = forward.next;
            }
        }
        return head;
    }

    private static void printList(Node head){
        Node itr = head;
        while(itr != null){
            System.out.print(itr.data);
            System.out.print("->");
            itr = itr.next;
        }
        System.out.println("NULL");
    }

}
