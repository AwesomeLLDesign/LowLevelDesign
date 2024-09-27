package LinkedList.classes.class1;

public class InsertInLinkedList {

    public Node insertInTheBegining(Node head,Node tail, int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            //firstNode
            head = newNode;
            tail = newNode;
        }else{
            //not a first node
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public Node insertAtEnd(Node head, Node tail, int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
        return head;
    }

    public Node insertAtGivenPosition(Node head, Node tail, int position, int data){
        if(position < 1){
            System.out.println("Invalid position");
            System.out.println("Not able to perform operation");
            return head;
        }
        if(position == 1){
            return insertInTheBegining(head,tail,data);
        }else{
            int itr=1;
            Node curr = head;
            while(itr < position && curr != null){
                itr++;
                curr = curr.next;
            }
            if(curr == null){
                System.out.println("Invalid position");
                System.out.println("Not able to perform operation");
                return head;
            }else{
                Node newNode = new Node(data);
                newNode.next = curr.next;
                curr.next = newNode;
            }
        }
        return head;
    }
}
