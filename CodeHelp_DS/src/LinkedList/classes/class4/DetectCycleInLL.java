package LinkedList.classes.class4;

public class DetectCycleInLL {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next.next;
        System.out.println("The ll is cyclic in Nature: " + detectCycle(head));
    }

    private static boolean detectCycle(Node head){
        if (head == null)return false;

        Node slow = head, fast = head;

        while (slow != null && fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
