package LinkedList.classes.class1;

public class PrintLinkedList {

    public void printLinkedList(Node head){
        Node traverse = head;
        while(traverse!= null) {
            System.out.print("-->" + traverse.data);
            traverse = traverse.next;
        }
        System.out.println("");
    }
}
