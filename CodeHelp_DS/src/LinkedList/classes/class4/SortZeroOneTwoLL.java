package LinkedList.classes.class4;

public class SortZeroOneTwoLL {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(0);
        sortLL(head);
    }

    private static void sortLL(Node head){
        if (head == null) return;

        Node curr = head;
        Node[] insertedNodeArrays = null;
        Node zeroHead = null, zeroTail = null;
        Node oneHead = null, oneTail = null;
        Node twoHead = null, twoTail = null;
        Node forward = head.next;
        while (forward!= null){
         curr.next = null;
         Node newNode = curr;
         insertedNodeArrays = insertNode(newNode, zeroHead,zeroTail, oneHead,oneTail ,twoHead, twoTail);
         zeroHead = insertedNodeArrays[0];
         zeroTail = insertedNodeArrays[1];
         oneHead = insertedNodeArrays[2];
         oneTail = insertedNodeArrays[3];
         twoHead = insertedNodeArrays[4];
         twoTail = insertedNodeArrays[5];
         curr = forward;
         forward = forward.next;
        }
        insertedNodeArrays = insertNode(curr,zeroHead,zeroTail, oneHead,oneTail ,twoHead, twoTail);
        zeroHead = insertedNodeArrays[0];
        zeroTail = insertedNodeArrays[1];
        oneHead = insertedNodeArrays[2];
        oneTail = insertedNodeArrays[3];
        twoHead = insertedNodeArrays[4];
        twoTail = insertedNodeArrays[5];
        head = mergeInsertedNodes(head,zeroHead,zeroTail, oneHead,oneTail ,twoHead, twoTail );
        printLL(head);
    }

    private static Node mergeInsertedNodes(Node head, Node zeroHead, Node zeroTail, Node oneHead, Node oneTail, Node twoHead, Node twoTail) {
        // write the merge logic here
        if (zeroHead!=null){
            if (oneHead != null){
                zeroTail.next = oneHead;
                if (twoHead != null){
                    oneTail.next = twoHead;
                }
                head = zeroHead;
            }else{
                if (twoHead!=null){
                    zeroTail.next = twoHead;
                }
                head = zeroHead;
            }
        }else if(oneHead!= null){
            if (twoHead!=null){
                oneTail.next = twoHead;
                head = oneHead;
            }
        }else if (twoHead != null){
            head = twoHead;
        }else{
            System.out.println("All the nodes are NULL");
        }
        return head;
    }

    private static Node[] insertNode(Node newNode, Node zeroHead,Node zeroTail, Node oneHead,Node oneTail, Node twoHead, Node twoTail) {

        if(newNode.data == 0){
            if(zeroHead == null){
                zeroHead = newNode;
                zeroTail = newNode;
            }else{
                zeroTail.next = newNode;
                zeroTail = zeroTail.next;
            }
        }else if(newNode.data == 1){
            if(oneHead == null){
                oneHead = newNode;
                oneTail = newNode;
            }else{
                oneTail.next = newNode;
                oneTail = oneTail.next;
            }
        }else if(newNode.data == 2){
            if(twoHead == null){
                twoHead = newNode;
                twoTail = newNode;
            }else{
                twoTail.next = newNode;
                twoTail = twoTail.next;
            }
        }else{
            System.out.println("Invalid Node " + newNode );
        }

        return new Node[]{zeroHead,zeroTail,oneHead,oneTail,twoHead,twoTail};
    }

    private static void printLL(Node head){
        Node itr = head;
        while (itr!=null){
            System.out.print(itr.data);
            System.out.print("->");
            itr = itr.next;
        }
        System.out.print("NULL");
    }

}
