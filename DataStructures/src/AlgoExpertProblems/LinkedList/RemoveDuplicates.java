package AlgoExpertProblems.LinkedList;

class LinkedList {

    int value;
    LinkedList next;

    LinkedList(int data) {
        this.value = data;
        this.next = null;
    }

}

public class RemoveDuplicates {

    private LinkedList removeDuplicatesFromList(LinkedList linkedList) {

        if (linkedList == null || linkedList.next == null) {
            return linkedList;
        }
        int count = 0;
        LinkedList currNode = linkedList;
        LinkedList uniqueNode = linkedList.next;
        while (uniqueNode != null) {
            if (currNode.value == uniqueNode.value) {
                count++;
                uniqueNode = uniqueNode.next;
            } else {
                currNode.next = uniqueNode;
                currNode = currNode.next;
                uniqueNode = uniqueNode.next;
                count = 0;
            }
        }
        if (count>0){
            currNode.next = uniqueNode;
        }

        return linkedList;
    }

    public static void main(String[] args) {

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(1);
        head.next.next.next = new LinkedList(1);
        head.next.next.next.next = new LinkedList(2);
        head.next.next.next.next.next = new LinkedList(2);
        head.next.next.next.next.next.next = new LinkedList(2);
//        head.next.next.next.next.next.next.next = new LinkedList(4);

        LinkedList list = removeDuplicates.removeDuplicatesFromList(head);
        while (list != null) {
            System.out.print("-->");
            System.out.print(list.value);
            list = list.next;
        }
    }
}
