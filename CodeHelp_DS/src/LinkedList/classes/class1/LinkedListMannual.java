package LinkedList.classes.class1;

public class LinkedListMannual {

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        InsertInLinkedList insertInLinkedList = new InsertInLinkedList();
        head = insertInLinkedList.insertInTheBegining(head,tail,10);

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.printLinkedList(head);

        head = insertInLinkedList.insertInTheBegining(head,tail,20);
        printLinkedList.printLinkedList(head);

        head = insertInLinkedList.insertInTheBegining(head,tail,30);
        printLinkedList.printLinkedList(head);

        head = insertInLinkedList.insertAtEnd(head,tail,40);
        printLinkedList.printLinkedList(head);

    }

}
