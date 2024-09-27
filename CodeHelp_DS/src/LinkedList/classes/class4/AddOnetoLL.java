package LinkedList.classes.class4;

public class AddOnetoLL {

    public static void main(String[] args) {

        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        addOne(head);
    }

    private static void addOne(Node head) {
        if (head == null) return;
        Node curr = reverseLL(head);
        curr = addOnetoList(curr);
        curr = reverseLL(curr);
        printLL(curr);

    }

    private static Node reverseLL(Node headToReverseLL) {

        Node curr = null, forward = headToReverseLL, prev = null;

        while (forward!= null){
            curr = forward;
            forward = forward.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
    }

    private static void printLL(Node head){
        Node itr = head;
        while (itr != null){
            System.out.print(itr.data);
            System.out.print("->");
            itr = itr.next;
        }
        System.out.println("Null");
    }

    private static Node addOnetoList(Node head){
        Node curr = head, prev = null;
        int carry = 1;

        while (curr !=  null){
            int data = curr.data + carry;
             curr.data = data % 10;
             carry = data / 10;
             prev = curr;
             curr = curr.next;
        }

        if (carry > 0){
            Node newNode = new Node(carry);
            prev.next = newNode;
        }

        return head;
    }

}
