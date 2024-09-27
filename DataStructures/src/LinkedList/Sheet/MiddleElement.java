package LinkedList.Sheet;

class Node{
    int data;
    Node next;

    Node(int key){
        this.data = key;
        this.next = null;
    }
}

public class MiddleElement {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        //head.next.next.next.next = new Node(50);
        Node output = findMiddleElement(head);
        if (output == null) {
            System.out.println("LinkedList doesn't exist");
        } else {
            System.out.println("The middle element is : " + output.data);
        }
    }

    private static Node findMiddleElement(Node head){

        if (head == null){
            return head;
        }
        Node slow = head, fast = head;

        while(fast != null){

         fast = fast.next;
         if (fast != null){
             fast = fast.next;
             slow = slow.next;
         }
        }
        return slow;
    }


}
