package AlgoExpertProblems.LinkedList;

public class SumOfLinkedLists {

    public static void main(String[] args) {
        LinkedList one = new LinkedList(2);
        one.next = new LinkedList(4);
        one.next.next = new LinkedList(7);
        one.next.next.next = new LinkedList(1);
        LinkedList two = new LinkedList(9);
        two.next = new LinkedList(4);
        two.next.next = new LinkedList(5);
        LinkedList result = sumOfLinkedLists(one, two);
        while (result != null) {
            System.out.print(result.value);
            System.out.print("->");
            result = result.next;
        }
    }

    public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        if (linkedListOne == null && linkedListTwo == null)
            return null;
        LinkedList result = null;
        LinkedList head = null;
        int carry = 0;
        while (linkedListOne != null || linkedListTwo != null) {
            int nodeOneValue = linkedListOne != null ? linkedListOne.value : 0;
            int nodeTwoValue = linkedListTwo != null ? linkedListTwo.value : 0;
            int sum = nodeOneValue + nodeTwoValue + carry;
            carry = sum / 10;
            sum = sum % 10;
            if (result == null) {
                result = new LinkedList(sum);
                head = result;
            } else {
                LinkedList temp = new LinkedList(sum);
                result.next = temp;
                result = result.next;
            }
            linkedListOne = linkedListOne != null ? linkedListOne.next : null;
            linkedListTwo = linkedListTwo != null ? linkedListTwo.next : null;
        }
        if (carry != 0) {
            LinkedList newNode = new LinkedList(carry);
            result.next = newNode;
        }
        return head;
    }

}
