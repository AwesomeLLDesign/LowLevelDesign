package AlgoExpertProblems.LinkedList;


public class LinkedlistReversal {

    private LinkedList reverseAList(LinkedList head) {

        if (head == null || head.next == null) {
            return head;
        }
        LinkedList first = head, second = null, third = null;
        while (first != null) {
            second = first;
            first = first.next;
            second.next = third;
            third = second;
        }
        head = second;
        return head;
    }

    public static void main(String[] args) {
        LinkedlistReversal linkedlistReversal = new LinkedlistReversal();
        LinkedList head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(3);
        head.next.next.next.next = new LinkedList(4);
        LinkedList list = linkedlistReversal.reverseAList(head);
        while (list != null) {
            System.out.print("-->");
            System.out.print(list.value);
            list = list.next;
        }
    }
}
