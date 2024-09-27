package PlacementPreparationSeries.LinkedList;

public class AddingTwoNumberInLinkedList {

    private class NodeList {
        int val;
        NodeList next;

        NodeList() {
        }

        NodeList(int value) {
            this.val = value;
            this.next = null;
        }

        NodeList(int value, NodeList pointer) {
            this.val = value;
            this.next = pointer;
        }
    }

    private NodeList firstLinkedList() {
        // represent number 642
        System.out.println("The first number is " + 642);
        NodeList head = new NodeList(2);
        head.next = new NodeList(4);
        head.next.next = new NodeList(6);
        return head;
    }

    private NodeList secondLinkedList() {
        // represent number 369
        System.out.println("The second number is " + 369);
        NodeList head = new NodeList(9);
        head.next = new NodeList(6);
        head.next.next = new NodeList(3);
        return head;
    }

    private void printList(NodeList head) {
        if (head == null) {
            System.out.println("The Linked List is empty");
        }
        while (head != null) {
            System.out.print("--->" + head.val);
            head = head.next;
        }
        System.out.println();
    }

    private NodeList addingTwoNumbers(NodeList first, NodeList second) {
        NodeList curr = null, newNode = null, head = null;
        int carry = 0, sum;
        while (first != null || second != null) {
            sum = carry + ((first == null) ? 0 : first.val) + ((second == null) ? 0 : second.val);
            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;

            newNode = new NodeList(sum);
            if (head == null)
                head = newNode;
            else {
                curr.next = newNode;

            }
            curr = newNode;
            if (first != null)
                first = first.next;
            if (second != null)
                second = second.next;

        }
        if (carry > 0)
            curr.next = new NodeList(carry);

        return head;
    }

    public static void main(String[] args) {
        AddingTwoNumberInLinkedList addingTwoNumberInLinkedList = new AddingTwoNumberInLinkedList();
        NodeList first = addingTwoNumberInLinkedList.firstLinkedList();
        NodeList second = addingTwoNumberInLinkedList.secondLinkedList();
        NodeList result = addingTwoNumberInLinkedList.addingTwoNumbers(first, second);
        addingTwoNumberInLinkedList.printList(result);
    }
}
